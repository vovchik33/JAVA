@echo off

call javac -d .\classes .\src\HelloWorld.java
call java -cp .\classes HelloWorld


pause