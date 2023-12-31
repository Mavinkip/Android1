package com.example.update2


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import android.util.Log
import androidx.lifecycle.lifecycleScope
import ca.uhn.fhir.context.FhirContext
import ca.uhn.fhir.context.FhirVersionEnum

import com.google.android.fhir.datacapture.QuestionnaireFragment
import com.google.android.fhir.datacapture.mapping.ResourceMapper
import kotlinx.coroutines.launch
import org.hl7.fhir.r4.model.Questionnaire

class MainActivity8 : AppCompatActivity() {

    var questionnaireJsonString: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        // 4.2 Replace with code from the codelab to add a questionnaire fragment.
        // Step 2: Configure a QuestionnaireFragment
        questionnaireJsonString = getStringFromAssets("Diagnosis.json")

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add(
                    R.id.fragment_container_view,
                    QuestionnaireFragment.builder().setQuestionnaire(questionnaireJsonString!!).build()
                )
            }
        }
    }

    private fun submitQuestionnaire() {

        // 5 Replace with code from the codelab to get a questionnaire response.
        // Get a questionnaire response
        val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view)
                as QuestionnaireFragment
        val questionnaireResponse = fragment.getQuestionnaireResponse()

// Print the response to the log
        val jsonParser = FhirContext.forCached(FhirVersionEnum.R4).newJsonParser()
        val questionnaireResponseString =
            jsonParser.encodeResourceToString(questionnaireResponse)
        Log.d("response", questionnaireResponseString)

        // 6 Replace with code from the codelab to extract FHIR resources from QuestionnaireResponse.
        lifecycleScope.launch {
            val questionnaire =
                jsonParser.parseResource(questionnaireJsonString) as Questionnaire
            val bundle = ResourceMapper.extract(questionnaire, questionnaireResponse)
            Log.d("extraction result", jsonParser.encodeResourceToString(bundle))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.submit_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.submit) {
            submitQuestionnaire()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun getStringFromAssets(fileName: String): String {
        return assets.open(fileName).bufferedReader().use { it.readText() }
    }
}
