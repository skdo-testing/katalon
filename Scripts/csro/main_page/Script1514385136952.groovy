import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://94.130.75.130/#/')

WebUI.setText(findTestObject('csro_main_page/Page_/input_add_user_login'), '7(985) 178-65-05')

WebUI.setText(findTestObject('csro_main_page/Page_/input_add_user_password'), '324806')

WebUI.click(findTestObject('csro_main_page/Page_/span_'))

WebUI.setText(findTestObject('csro_main_page/Page_/input_confirmation_code'), '9')

WebUI.click(findTestObject('csro_main_page/Page_/span__1'))

WebUI.click(findTestObject('csro_main_page/Page_/span_ (1)'))

WebUI.click(findTestObject('csro_main_page/Page_/span_ (2)'))

WebUI.click(findTestObject('csro_main_page/Page_/span__2'))

WebUI.setText(findTestObject('csro_main_page/Page_/input_add_full_orgName'), 'чсро 2')

WebUI.click(findTestObject('csro_main_page/Page_/span__3'))

WebUI.click(findTestObject('csro_main_page/Page_/label_empty'))

WebUI.click(findTestObject('csro_main_page/Page_/span_ _1'))

WebUI.click(findTestObject('csro_main_page/Page_/label_empty'))

WebUI.click(findTestObject('csro_main_page/Page_/span_101300'))

WebUI.click(findTestObject('csro_main_page/Page_/label_empty'))

WebUI.click(findTestObject('csro_main_page/Page_/span_ _2'))

WebUI.click(findTestObject('csro_main_page/Page_/label_empty'))

WebUI.click(findTestObject('csro_main_page/Page_/span_ _3'))

WebUI.click(findTestObject('csro_main_page/Page_/label_empty'))

WebUI.click(findTestObject('csro_main_page/Page_/span__4'))

WebUI.setText(findTestObject('csro_main_page/Page_/input_addrstreet'), 'Ленина')

WebUI.setText(findTestObject('csro_main_page/Page_/input_addrhouse'), '5')

WebUI.setText(findTestObject('csro_main_page/Page_/input_addrroom'), '22')

WebUI.click(findTestObject('csro_main_page/Page_/span__5'))

WebUI.click(findTestObject('csro_main_page/Page_/td'))

WebUI.click(findTestObject('csro_main_page/Page_/span__6'))

WebUI.click(findTestObject('csro_main_page/Page_/span__3'))

WebUI.click(findTestObject('csro_main_page/Page_/label_empty'))

WebUI.click(findTestObject('csro_main_page/Page_/li_ng-tns-c2-29 ui-dropdown-it'))

WebUI.setText(findTestObject('csro_main_page/Page_/input_add_msro__email'), 'test22@mail.ru')

WebUI.click(findTestObject('csro_main_page/Page_/span__5'))

WebUI.click(findTestObject('csro_main_page/Page_/span__5'))

WebUI.click(findTestObject('csro_main_page/Page_/label_'))

WebUI.click(findTestObject('csro_main_page/Page_/span_ (3)'))

WebUI.click(findTestObject('csro_main_page/Page_/span__5'))

WebUI.click(findTestObject('csro_main_page/Page_/span__5'))

WebUI.click(findTestObject('csro_main_page/Page_/span__5'))

WebUI.click(findTestObject('csro_main_page/Page_/span__6'))

WebUI.click(findTestObject('csro_main_page/Page_/td'))

WebUI.click(findTestObject('csro_main_page/Page_/span__6'))

WebUI.click(findTestObject('csro_main_page/Page_/span__3'))

WebUI.click(findTestObject('csro_main_page/Page_/label_empty'))

WebUI.click(findTestObject('csro_main_page/Page_/span_ _4'))

WebUI.click(findTestObject('csro_main_page/Page_/label_empty'))

WebUI.click(findTestObject('csro_main_page/Page_/span_ _2'))

WebUI.setText(findTestObject('csro_main_page/Page_/input_add_phoneextention'), '12')

WebUI.click(findTestObject('csro_main_page/Page_/span__5'))

WebUI.click(findTestObject('csro_main_page/Page_/span__5'))

WebUI.closeBrowser()

