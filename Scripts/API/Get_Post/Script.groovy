import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper

ResponseObject response = WS.sendRequest(findTestObject('API/Get_Post'))

WS.verifyResponseStatusCode(response, 200)
WS.verifyNotEqual(response.getResponseBodyContent(), '')

def json = new JsonSlurper().parseText(response.getResponseBodyContent())

assert json.id != null
assert json.title != null
assert json.body != null
assert json.userId != null
