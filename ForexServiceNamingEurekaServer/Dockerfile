FROM openjdk:17
EXPOSE 8081
ADD /var/lib/jenkins/.m2/repository/com/example/ForexServiceNamingEurekaServer/0.0.1-SNAPSHOT/ForexServiceNamingEurekaServer-0.0.1-SNAPSHOT.jar ForexServiceNamingEurekaServer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ForexServiceNamingEurekaServer-0.0.1-SNAPSHOT.jar"]