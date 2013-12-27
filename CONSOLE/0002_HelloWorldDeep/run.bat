@echo off

call javac -d .\classes .\src\com\vkv\tutorial\HelloWorld.java
call java -cp .\classes com.vkv.tutorial.HelloWorld


pause