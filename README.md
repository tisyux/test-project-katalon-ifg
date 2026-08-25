# Katalon Technical Test

Author: Pritisia

## Requirement

* Katalon Studio
* Java
* Kafka
* Docker optional

## API Test

This project uses JSONPlaceholder for simple REST API tests:

* `POST /posts` as producer
* `GET /posts/1` as consumer

Run `API_Test_Suite` from Katalon Studio.

## Kafka Test

Katalon reads a message from Kafka topic:

`test-topic`

Sample message:

```json
{
  "id": 1,
  "name": "Pritisia",
  "status": "ACTIVE"
}
```

Kafka Java client jar files are needed in the `Drivers` folder before running the Kafka test.

Suggested dependency:

`org.apache.kafka:kafka-clients:3.7.0`

## How To Run

1. Clone repository.
2. Open this project in Katalon Studio.
3. Run `API_Test_Suite`.
4. Start Kafka with `docker compose up -d`.
5. Create topic with `./kafka-local/create-kafka-topic.sh`.
6. Send the sample message with `./kafka-local/send-kafka-message.sh`.
7. Run `Kafka_Test_Suite`.

## Kafka Local

Create topic:

```bash
./kafka-local/create-kafka-topic.sh
```

Send sample message:

```bash
./kafka-local/send-kafka-message.sh
```

Optional helper to download Kafka jar files:

```bash
./kafka-local/download-kafka-libs.sh
```
