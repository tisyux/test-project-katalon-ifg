import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper
import internal.GlobalVariable

ResponseObject response = WS.sendRequest(findTestObject('API/Create_Post'))

WS.verifyResponseStatusCode(response, 201)

def json = new JsonSlurper().parseText(response.getResponseBodyContent())

assert json.id != null
assert json.title == 'Katalon Test'
assert json.userId == 1

GlobalVariable.createdPostId = json.id
