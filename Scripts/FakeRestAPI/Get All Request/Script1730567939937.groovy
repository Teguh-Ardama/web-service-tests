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

// Test Case: Verify Status and Data Values in API Requests
// 1. Send GET request to retrieve all activities and verify status code
def responseActivities = WS.sendRequest(findTestObject('FakeRestAPI/api/v1/Activities/GET Activities'))

WS.verifyResponseStatusCode(responseActivities, 200 // Verify status code 200
    )

// 2. Send GET request to retrieve a specific activity by ID and verify status code
def responseActivityById = WS.sendRequest(findTestObject('FakeRestAPI/api/v1/Activities/{id}/GET Activities By ID'))

WS.verifyResponseStatusCode(responseActivityById, 200 // Verify status code 200
    )

// 3. Send GET request to retrieve authors and verify status code
def responseAuthors = WS.sendRequest(findTestObject('FakeRestAPI/api/v1/Authors/GET Authors'))

WS.verifyResponseStatusCode(responseAuthors, 200 // Verify status code 200
    )

WS.sendRequest(findTestObject('FakeRestAPI/api/v1/Authors/authors/books/{idBook}/GET Authors_Books By ID'))

WS.sendRequest(findTestObject('FakeRestAPI/api/v1/Authors/{id}/GET Authors By ID'))

WS.sendRequest(findTestObject('FakeRestAPI/api/v1/Books/GET Books'))

WS.sendRequest(findTestObject('FakeRestAPI/api/v1/Books/{id}/GET Books By ID'))

WS.sendRequest(findTestObject('FakeRestAPI/api/v1/CoverPhotos/books/covers/{idBook}/GET CoverPhotos_Books_Covers By ID'))

WS.sendRequest(findTestObject('FakeRestAPI/api/v1/CoverPhotos/GET CoverPhotos'))

WS.sendRequest(findTestObject('FakeRestAPI/api/v1/CoverPhotos/{id}/GET CoverPhotos By ID'))

WS.sendRequest(findTestObject('FakeRestAPI/api/v1/Users/GET Users'))

WS.sendRequest(findTestObject('FakeRestAPI/api/v1/Users/{id}/GET Users By ID'))

