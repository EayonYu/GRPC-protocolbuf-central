#!/usr/bin/env bash

version="0.0.2"
# add config to daemon.json
# "insecure-registries": [
#   "10.124.106.121:5000"
# ]
docker build -t protobuf-compiler:"${version}" .
docker tag protobuf-compiler:"${version}" 10.124.106.121:5000/gaia/protobuf-compiler:"${version}"
docker push 10.124.106.121:5000/gaia/protobuf-compiler:"${version}"
