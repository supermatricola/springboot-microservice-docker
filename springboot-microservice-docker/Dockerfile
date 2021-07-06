FROM java:8

EXPOSE 8080:8080

ADD target/service-demo.jar service-demo.jar

ENTRYPOINT ["java","-jar" , "service-demo.jar"]