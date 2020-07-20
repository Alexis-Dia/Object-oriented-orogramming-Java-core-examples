# Compiling classes:
# javac -d E:\IdeadProjects\helloWorldProj\Object-oriented-orogramming-Java-core-examples\out -sourcepath E:\IdeadProjects\helloWorldProj\Object-oriented-orogramming-Java-core-examples\src E:\IdeadProjects\helloWorldProj\Object-oriented-orogramming-Java-core-examples\src\by\bntu\fitr\povt\java8new\example1\case4\Test.java

# Creating jar:
# 1. Create Manifest.mf in root of Object-oriented-orogramming-Java-core-examples:
    Manifest-Version: 1.0
    Main-Class: by.bntu.fitr.povt.java8new.example1.case4.Test
# 2. cd Object-oriented-orogramming-Java-core-examples/out
    jar cmf ../Manifest.mf Java8new-case4-labmdas.jar by/bntu/fitr/povt/java8new/example1/case4/

# Running jar:
# java -jar Java8new-case4-labmdas.jar

