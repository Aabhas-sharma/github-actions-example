FROM openjdk:17
EXPOSE 8080
ADD target/springboot-aabhas-test.jar springboot-aabhas-test.jar
ENTRYPOINT ["java","-jar","/springboot-aabhas-test.jar"]