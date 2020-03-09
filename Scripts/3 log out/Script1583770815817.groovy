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

WebUI.setText(findTestObject('Object Repository/input_Email_email'), email)

WebUI.setText(findTestObject('Object Repository/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/input_Lupa Password_btn btn-success w-100'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Tokobuah Admin -/a_Admin'))

WebUI.click(findTestObject('Object Repository/a_Logout'))

WebUI.click(findTestObject('Object Repository/a_Logout_1'))

WebUI.navigateToUrl('http://localhost/tokobuah/index.php/admin/login')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Login Admin/h1_Login Admin'), 0)

