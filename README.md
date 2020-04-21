First, make sure you are reading this page with support from a Mark Down editor/plug-in

Remember that more emphasis is done on testing, using this framework to help UI testing

#What I need to run this test?
1. First, please check if you local computer has Chrome browser installed.
2. Check the version by going to the menu "Chrome > About Google Chrome".
3. Now download the relevant chrome driver corresponding to your browser version from the URL - https://chromedriver.chromium.org/downloads 
4. UNzip the downloaded file and place it under the following location in your code - src/test/resources/webdriver.mac/ 
5. Make sure you have these tools and technologies in your machine and 
    * JAVA (JRE and JDK) (https://java.com/en/download/)
    * MAVEN (https://maven.apache.org/install.html and/or https://www.mkyong.com/maven/how-to-install-maven-in-windows/)
    * Perferably IntelliJ or any other IDE that supports JAVA (Eclipse. Ex: https://www.jetbrains.com/idea/download/#section=windows , use community edition for IntelliJ)
    * Cucumber Plugin in your IDE
    * Optional : GIT Command Line (https://git-scm.com/downloads)
    * Optional : A Git Client (https://www.sourcetreeapp.com/)

#java JDK(version)
Set the language level to Java 8 or higher - Lambda expressions, Annotations etc.

#Framework
This is a maven driven framework with Serenity BDD. Serenity uses Selenium to drive UI tests, Cucumber to write BDD tests and serenity-maven-plugin to drive the BDD suites

#Architecture

##### src/test/resources
    * contains the feature files can be seggregated by folders if necessary in case of more features 
    * can write any number of scenarios in a feature file
    * We enable tagging at feature and scenario level so that you can run them as smoke, regression suites or any individual test cases as well if needed...
    * We have driver folder where we keep drivers of all browsers ex: Chrome
    
##### src/test/java
    * contains Constants page enums
    * contains Page Objects such as commonPageObjects where every page extends the commonPageObjects
    * contains all Pages for the required application
    * contains Steps like BackGroundSteps,VisaEligibilityCheckSteps step definitions for all BDD steps defined in feature files
    * These files usually end with 'steps' (recommended)
    * We have utils such as commonMethods where we implement re-usable methods
      
    
#Execution
##### To run only japan suites
    *   mvn clean verify -Dcucumber.options="--tags @japan"
    
##### To run only tourism ()
    *   mvn clean verify -Dcucumber.options="--tags @tourism"
    
##### To run only longStudy ()
        *   mvn clean verify -Dcucumber.options="--tags @longStudy"
        
##### To run only shortStudy ()
            *   mvn clean verify -Dcucumber.options="--tags @shortStudy"
    
##### To run both japan and tourism ()
    *   mvn clean verify -Dcucumber.options="--tags @japan,@tourism"
    
##### To run both longStudy and shortStudy ()
        *   mvn clean verify -Dcucumber.options="--tags @longStudy,@shortStudy"
        
        
##### To run only russia suites
            *   mvn clean verify -Dcucumber.options="--tags @russia"
            
##### To run only tourism ()
            *   mvn clean verify -Dcucumber.options="--tags @tourism"
            
##### To run both russia and tourism ()
                *   mvn clean verify -Dcucumber.options="--tags @japan,@tourism"
     
##### To run everything
     *   mvn clean verify    
         
#Reports
* Serenity generates the reports and stores them at target/site/serenity
* Go here and open the file index.html         


#Common Issues and Answers
##### I keep getting the error, “Unimplemented substep definition” in IntelliJ with Cucumber??
###### Ans : Uninstall Substeps IntelliJ Plugin. Cucumber for Java and Gherkin should be enough.


