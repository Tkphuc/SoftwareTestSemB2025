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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/FailedLogin/Page_Swag Labs/input_Swag Labs_user-name'), 'locked_out_user')

WebUI.setEncryptedText(findTestObject('Object Repository/FailedLogin/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/FailedLogin/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Object Repository/FailedLogin/Page_Swag Labs/h3_Epic sadface Sorry, this user has been l_a91fd7'))

errorText = WebUI.getText(findTestObject('FailedLogin/Page_Swag Labs/h3_Epic sadface Sorry, this user has been l_a91fd7'))

println(errorText)

WebUI.verifyMatch(errorText, 'Epic sadface: Sorry, this user has been locked out.', true)

WebUI.click(findTestObject('Object Repository/FailedLogin/Page_Swag Labs/button_Epic sadface Sorry, this user has be_5ebff2'))

WebUI.click(findTestObject('Object Repository/FailedLogin/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Object Repository/FailedLogin/Page_Swag Labs/h3_Epic sadface Sorry, this user has been l_a91fd7'))

WebUI.click(findTestObject('Object Repository/FailedLogin/Page_Swag Labs/svg_Epic sadface Sorry, this user has been _2c0cce'))

