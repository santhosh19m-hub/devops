FROM eclipse-temurin:17
COPY target/mobiledevops.jar mobiledevops.jar
CMD ["java","-jar","mobiledevops.jar"]