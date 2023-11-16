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
//
//	int[] p = [9,3,4,4,2,7,3]
//	
//	def e = p.sum()
//	
//	def a
//	
//	WebUI.openBrowser("https://www.calculator.net/")
//	
//	for(int i=0;i<p.size(); i++ ) {
//	
//		WebUI.click(findTestObject('Object Repository/sabtung/pilang (angka)',['angka':p[i]]))
//		
//		if(i==p.size()-1) {
//			a = WebUI.getText(findTestObject('Object Repository/sabtung/out'))
//			
//		}else {
//			WebUI.click(findTestObject('Object Repository/sabtung/pilop (operator)',['operator':'+']))
//		}
//	}
//	
//	WebUI.verifyMatch(a, ' '+e.toString() , false)
	

	
	