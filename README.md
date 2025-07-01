# my-test-practice

# log4J setup
- [x] create log4j.xml file in main -> resources 
- [x] add the below in Edit Configurations
- [x] go to Edit Configurations 
- [x] click Edit Configuration template
- [x] go to Applications -> VM options -> paste the below setting
- [x] go to TestNG VM options -> paste the below setting 

for windows
````
-ea -Dlog4j.configurationFile=$ProjectFileDir$\src\main\resources\log4j2.xml
````

for mac
````
-ea -Dlog4j.configurationFile=$ProjectFileDir$/src/main/resources/log4j2.xml
````

- [x] create repository in github
- [x] clone project in intellij
- [x] add maven module
- [] create stackoverflow package
  - [] create First test, testNgXml
- [] create util package
  - [] add BaseUtilTest