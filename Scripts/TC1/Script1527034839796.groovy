import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut-mimic.kazurayam.com/6949_testbed.html')

WebUI.verifyElementText(findTestObject('Page_6949/div_text 1'), 'text 1')

WebUI.verifyElementText(findTestObject('Page_6949/div_text 2'), 'text 2')

WebUI.verifyElementText(findTestObject('Page_6949/div_text 3'), 'text 3')

WebUI.closeBrowser()

