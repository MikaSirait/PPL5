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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/tokobuah/index.php/admin/login')

WebUI.setText(findTestObject('Object Repository/Page_Login Admin/input_Email_email'), email)

WebUI.setText(findTestObject('Object Repository/Page_Login Admin/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/Page_Login Admin/input_Lupa Password_btn btn-success w-100'))

WebUI.delay(3)

if (expected == 'passed') {
    WebUI.verifyElementPresent(findTestObject('a_Admin'), 0)

    WebUI.delay(3)
} else if (expected == 'fail') {
    WebUI.verifyElementPresent(findTestObject('h1_Login Admin'), 0)

    WebUI.delay(3)
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

