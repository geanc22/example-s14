FROM openjdk:17
ADD ./target/proyectoFinalCalc-0.0.1-SNAPSHOT.jar proyectodevops.jar
ENTRYPOINT ["java","-jar","/proyectodevops.jar"]
