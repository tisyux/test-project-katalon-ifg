#!/usr/bin/env bash
set -euo pipefail

mkdir -p Drivers

download() {
  local url="$1"
  local file="Drivers/${url##*/}"

  if [[ ! -f "$file" ]]; then
    curl -L "$url" -o "$file"
  fi
}

download "https://repo1.maven.org/maven2/org/apache/kafka/kafka-clients/3.7.0/kafka-clients-3.7.0.jar"
download "https://repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar"
download "https://repo1.maven.org/maven2/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar"
download "https://repo1.maven.org/maven2/org/xerial/snappy/snappy-java/1.1.10.5/snappy-java-1.1.10.5.jar"
download "https://repo1.maven.org/maven2/com/github/luben/zstd-jni/1.5.5-6/zstd-jni-1.5.5-6.jar"
