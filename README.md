# WebServiceUsingSpring
This webservice is create using Spring boot application
git commend for this application
go to project directory like(E:\chabed_sts_webService\WebServiceUsingSpring) in your git bash
now run this $ mvn clean install
if you find oracle jdbc error run this commend mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.3 -Dpackaging=jar -Dfile=E:/oracleJar/ojdbc6.jar -DgeneratePom=true
after build success run this $ java -jar target/webservice-testing-0.1.0.jar
