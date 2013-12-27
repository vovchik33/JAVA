@echo off

call javac -d .  .\src\com\vkv\tutorial\HelloWorld.java
call jar cvf .\helloworld.jar .\com\
call java -cp helloworld.jar com.vkv.tutorial.HelloWorld

pause