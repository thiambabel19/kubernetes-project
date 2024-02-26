FROM openjdk:17-alpine
LABEL maintainer="Mohamed THIAM mohamedthiam563@gmail.com"
EXPOSE 8080
ADD target/kubernetesproject.jar kubernetesproject.jar
ENTRYPOINT ["java","-jar","/kubernetesproject.jar"]