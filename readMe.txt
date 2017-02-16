Instruction to run the application
----------------------------------

Below is the script to run the application

javac ApplicationRunner.java
java ApplicationRunner ../Dataset

Following are the understanding about the above script

1.	ApplicationRunner.java has the main method as starting point
2.	While executing, the application expects one parameter as argument - Path where the set of documents to be tokenized are available. In the above example, ../Dataset is passed as argument. This means the folder Dataset has the collection of documents to be tokenized. The folder is residing one step back to the folder where ApplicationRunner.java is residing. 

However, if dataset is available in the path /people/cs/s/sanda/cs6322/Cranfield, then following is the command to be executed
java ApplicationRunner /people/cs/s/sanda/cs6322/Cranfield

Following are the information about the java files attached

1.	ApplicationRunner.java - Driver class which receives argument and create respective class objects.
2.	Constant.java -	Has static constant (final) member variables which are used across the application
3.	Stemmer.java  - Class downloaded which does the actual stemming process
4.	StemmingExecutor.java - Class which uses Stemmer.java and builds stemmed toekn map
5.	TokenSummary.java - Entity which holds all the parameters of tokenization
6.	TokenExecutor.java - Class which has TokenSummary, processes each file and update the token summary instance
7.	Utility.java - Class which has static helper methods which can be used across the application