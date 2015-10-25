@echo off
SET JavaPath=%1
SET JavaExec=%2
cd %JavaPath%
javac *.java
java %JavaExec%
cd ..