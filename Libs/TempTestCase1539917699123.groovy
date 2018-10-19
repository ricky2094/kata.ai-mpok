import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\RICKY~1.NUG\\AppData\\Local\\Temp\\Katalon\\Test Cases\\test\\20181019_095459\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

not_run: WebUI.openBrowser('platform.kata.ai/login')

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('username'), 'sylviatest')

not_run: WebUI.setText(findTestObject('password'), '12345')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('btn_login'))

not_run: WebUI.click(findTestObject('click_api'))

WebUI.setText(findTestObject('set text timezone'), 'gmt +7')

WebUI.sendKeys(findTestObject('menu outer'), Keys.chord(Keys.ENTER))

''', 'Test Cases/test', new TestCaseBinding('Test Cases/test',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
