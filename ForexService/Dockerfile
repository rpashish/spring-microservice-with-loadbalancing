FROM openjdk:17
EXPOSE 8082
ADD target/ForexService-0.0.1-SNAPSHOT.jar ForexServiceNamingEurekaServer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ForexService-0.0.1-SNAPSHOT.jar"]