import com.kms.katalon.core.annotation.Keyword
import org.apache.kafka.clients.consumer.ConsumerRecords
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.serialization.StringDeserializer

class KafkaConsumerKeyword {

	@Keyword
	String readMessage(String bootstrapServers, String topic, String groupId) {
		Properties props = new Properties()
		props.put('bootstrap.servers', bootstrapServers)
		props.put('group.id', groupId)
		props.put('key.deserializer', StringDeserializer.name)
		props.put('value.deserializer', StringDeserializer.name)
		props.put('auto.offset.reset', 'earliest')
		props.put('enable.auto.commit', 'true')

		KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props)
		consumer.subscribe([topic])

		try {
			long endAt = System.currentTimeMillis() + 15000
			while (System.currentTimeMillis() < endAt) {
				ConsumerRecords<String, String> records = consumer.poll(java.time.Duration.ofMillis(1000))
				if (!records.isEmpty()) {
					return records.iterator().next().value()
				}
			}
			return null
		} finally {
			consumer.close()
		}
	}
}
