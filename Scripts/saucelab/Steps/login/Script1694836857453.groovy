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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.waitForPageLoad(5)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('saucelab/login/obj (tagName)(id)', [ ('tagName'):'input',('id') : 'user-name']), username)

WebUI.setEncryptedText(findTestObject('saucelab/login/obj (tagName)(id)', [('tagName'):'input',('id') : 'password']), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('saucelab/login/obj (tagName)(id)', [('tagName'):'input',('id') : 'login-button']))

if (expected != '') {
    boolean hasError = WebUI.waitForElementVisible(findTestObject('Object Repository/saucelab/login/error_message'), 2, 
        FailureHandling.OPTIONAL)

    if (hasError) {
        String error = WebUI.getText(findTestObject('Object Repository/saucelab/login/error_message'))

        WebUI.verifyMatch(error, expected, false)
    } else {
        KeywordUtil.markFailedAndStop('error message')
    }
} else {
    boolean product = WebUI.waitForElementPresent(findTestObject('Object Repository/saucelab/inventory/text_product'), 0)

    if (product) {
        KeywordUtil.markPassed('pass')
    } else {
        KeywordUtil.markFailedAndStop('coba lagi')
    }
}
WebUI.comment(tcName)

WebUI.closeBrowser()

