==========================================================
			Random Password Generator Application
==========================================================

Project Description:
--------------------

This Maven project is about a standlone Java application that generates random passwords of length with 10 characters which includes at least 1 - Capital (Upper) Case Alphabet, 1 - Lower Case Alphabet, 1 - Number and 1 - Special Character.

Password generated will contain the combination of following characters from each group as given below,

i. 	 Capital (Upper) Case Letters - A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z (26 - Letters)
ii.  Lower Case Letters - a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z
iii. Numbers - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 
iv.  Special Characters - !, , ", #, $, %, &, ', (, ), *, +, ,, -, ., /, :, ;, <, =, >, ?, @, [, \, ], ^, _, `, {, |, }, ~

Project Execution:
-----------------

Import the project into IDEs as existing Maven projects to clean, build and install using 'mvn' commands as given below,

mvn clean - This command cleans the maven project by deleting the target directory
mvn install - This command builds the maven project and installs the project files (JAR, WAR, pom.xml, etc) to the local repository.
mvn package - This command builds the maven project and packages them into a JAR, WAR, etc.

Navigate to the target folder of the project repository and execute the below command to execute the project from target folder level where the jar file is located after executing "mvn install" command from local repository.
java -jar javaproject-0.0.1-SNAPSHOT.jar

Sample Execution:
-----------------
machinename:target user$ pwd
/Volumes/Documents/Java Workspace/javaproject/target
machinename:target user$ java -jar javaproject-0.0.1-SNAPSHOT.jar 
Generated Password:
7FBkfK/kx)
machinename:target user$ 

Project Enhancements (TBD):
---------------------------
This Java application can be built to support requests call from REST API to serve intended users.  