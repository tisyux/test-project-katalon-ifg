#!/usr/bin/env bash
set -euo pipefail

docker exec -it katalon-test-kafka /opt/kafka/bin/kafka-topics.sh \
  --bootstrap-server localhost:9092 \
  --create \
  --if-not-exists \
  --topic test-topic
