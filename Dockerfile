FROM openjdk:11.0.15-jre
COPY "./build/libs/coffee-webflux-0.0.1-SNAPSHOT.jar" "coffee.jar"
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "coffee.jar"]