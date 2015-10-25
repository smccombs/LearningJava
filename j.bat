@echo off
SET JavaPath=%1
SET JavaExec=%2
cd %JavaPath%
javac *.java
IF NOT EXIST bin mkdir bin
move *.class bin >nul
cd bin
java %JavaExec%
cd ..
cd ..