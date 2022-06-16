FROM openjdk:11
ADD build/libs/cloud-gateway-0.0.1-SNAPSHOT.jar cloud-gateway-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "cloud-gateway-0.0.1-SNAPSHOT.jar"]