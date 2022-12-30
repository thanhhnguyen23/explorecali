#!/bin/sh

# build jar file
mvn clean install &&

# run java from cli
java -jar target/*jar