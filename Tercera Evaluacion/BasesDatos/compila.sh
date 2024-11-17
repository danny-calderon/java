#!/bin/bash
javac -cp :mysql-connector-j-8.3.0.jar $1.java
java -cp :mysql-connector-j-8.3.0.jar $1
