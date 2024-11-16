import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonSlurper as JsonSlurper

def responseActivityById = WS.sendRequestAndVerify(findTestObject('FakeRestAPI/api/v1/Activities/{id}/GET Activities By ID'))

WS.verifyResponseStatusCode(responseActivityById, 200 // Verify status code 200
    )

WS.verifyElementPropertyValue(responseActivityById, 'id', 1)

WS.verifyElementPropertyValue(responseActivityById, 'title', 'Activity 1')

// Parse JSON response
def jsonResponseActivityById = new JsonSlurper().parseText(responseActivityById.getResponseBodyContent())

// Example of verifying the value of ID and title
assert jsonResponseActivityById.id == 1 : 'Expected ID should be 1'

assert jsonResponseActivityById.title != null : 'Title should not be null'

