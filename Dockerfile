#Usa una imagen base con una versión de Java compatible con tu aplicación Spring Boot
FROM openjdk:17

#Etiqueta del mantenedor
LABEL maintainer="Alejandro <a.betancourt92@hotmail.com>"

#Directorio de trabajo dentro del contenedor
WORKDIR /app

#Copia el archivo JAR de tu aplicación en el directorio de trabajo
COPY ./target/ruralPharma-0.0.1-SNAPSHOT.jar /app/app.jar

#Expone el puerto en el que se ejecutará tu aplicación Spring Boot
EXPOSE 8080

#Comando para ejecutar la aplicación cuando el contenedor se inicia
CMD ["java", "-jar", "app.jar"]
