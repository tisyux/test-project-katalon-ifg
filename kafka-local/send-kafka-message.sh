#!/usr/bin/env bash
set -euo pipefail

docker exec -i katalon-test-kafka /opt/kafka/bin/kafka-console-producer.sh \
  --bootstrap-server localhost:9092 \
  --topic test-topic <<'MESSAGE'
{"id":1,"name":"Pritisia","status":"ACTIVE"}
MESSAGE
