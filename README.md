# WebServiceUsingSpring
1. This webservice is create using Spring boot application

2. git commend for this application

3. go to project directory like(E:\chabed_sts_webService\WebServiceUsingSpring) in your git bash

4. now run this commend $ mvn clean install

5. if you find oracle jdbc error run this commend $ mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.3 -Dpackaging=jar -Dfile=E:/oracleJar/ojdbc6.jar -DgeneratePom=true

6. after build success run this $ java -jar target/webservice-testing-0.1.0.jar
