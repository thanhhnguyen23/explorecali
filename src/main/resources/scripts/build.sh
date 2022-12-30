#!/bin/sh

# build jar file
mvn clean install &&

# run java from cli with default port (8080)
java -jar target/*jar && 

# run java from cli with custom port (8081)
java -Dserver.port=9090 -jar target/*jar && 
