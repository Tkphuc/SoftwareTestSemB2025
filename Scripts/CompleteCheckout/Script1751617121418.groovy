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

WebUI.setText(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.sendKeys(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/input_Swag Labs_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/a_1'))

WebUI.click(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/input_Checkout Your Information_firstName'), 
    'John')

WebUI.setText(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/input_Checkout Your Information_lastName'), 
    'Doe')

WebUI.setText(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/input_Checkout Your Information_postalCode'), 
    '12345')

WebUI.click(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/button_Finish'))

WebUI.click(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/h2_Thank you for your order'))

WebUI.click(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/div_Your order has been dispatched, and wil_39390f'))

WebUI.click(findTestObject('Object Repository/CompleteCheckout/Page_Swag Labs/img_Checkout Complete_pony_express'))

String message = WebUI.getText(findTestObject('CompleteCheckout/Page_Swag Labs/h2_Thank you for your order'))

WebUI.verifyMatch( message,"Thank you for your order!",true)

