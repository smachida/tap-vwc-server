#!/bin/bash
tanzu service class-claim create mysql-1 \
  --class mysql-unmanaged \
  --parameter storageGB=3
