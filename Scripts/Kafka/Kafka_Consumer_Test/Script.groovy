import com.kms.katalon.core.util.KeywordUtil
import groovy.json.JsonSlurper

String message = CustomKeywords.'KafkaConsumerKeyword.readMessage'(
	'localhost:9092',
	'test-topic',
	'katalon-technical-test-group'
)

KeywordUtil.logInfo("Kafka message: " + message)

assert message != null

def json = new JsonSlurper().parseText(message)

assert json.id != null
assert json.name != null
assert json.status != null
