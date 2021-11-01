Compilation:

javac -d ./bin ./src/by/nik/lesson2/*

"/bin" - path to result files *.class
"./src/by/nik/lesson2/*" - path to files *.java from the current directory



To run:

java -classpath ./bin by.nik.lesson2.Person

"./bin" - path to compiled files,
"by.nik.lesson2.Person" - main class

---------------------- 

to create jar:
first create a file "manifest.mf" with parameters:

class-path: bin/ - path to compiled files
Main-Class: by.nik.lesson2.Person - main class

then run:
jar -cmf manifest.mf person.jar -C bin .

"bin" - path to compiled files
"." - path to result person.jar (current directory)


--------------------- 
To run the jar:
java -jar person.jar

-------------------------------------- 

The names of nested classes consist of the names of the external and nested class, separated by "$"
the name of an anonymous class contains "1" instead of its name
in the name of the local class, the number "1" stands before its name
unlike the anonymous lambda did not add a new file *.class
