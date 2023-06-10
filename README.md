# Microservicio de Spring Boot

Este repositorio contiene un microservicio de Usuarios desarrollado en Spring Boot, Spring Security, Spring Cloud, base de datos embebida H2, Swagger y Actuator.
## Requisitos previos

Antes de comenzar, asegúrate de tener instalado lo siguiente:

- Java Development Kit (JDK) 8 o superior.
- Apache Maven para compilar y construir el proyecto.
- IDE sugeridos: IntelliJ IDEA, Eclipse, Spring Tool Suit o VS Code.

## Configuración del proyecto

Sigue estos pasos para configurar el proyecto en tu entorno local:

1. Clona este repositorio en tu máquina local usando el siguiente comando:

   ```
   git clone https://github.com/QAJOSEP/PRUEBA_TECNICA_TECNIVA.git
   ```

2. Abre el proyecto en tu IDE o con línea de comandos.

## Configuración de la base de datos

1. Levanta el proyecto.

2. Dirigete al https://localhost:8000/h2-console/

3. Las credenciales y la dirección ya estan configuradas.

4. Accede a la base de datos.   

## Compilación y ejecución del microservicio

Sigue estos pasos para compilar y ejecutar el microservicio:

1. Navega al directorio raíz del proyecto.

2. Ejecuta el siguiente comando desde una terminal para compilar el proyecto:

   ```
   mvn clean install
   ```

3. Una vez que la compilación sea exitosa, puedes ejecutar el microservicio con el siguiente comando:

   ```
   mvn spring-boot:run
   ```

   o ejecuta el proyecto desde ExamApplication con el menu Run Project.
   
4. El microservicio ahora debería estar en funcionamiento y accesible a través del localhost 8761 y 8080.

## Uso del microservicio

1. Para mayor referencia de los recursos y su implementación dirigete a http://localhost:8080/swagger-ui/index.html  
   
   Donde podrás encontrar la documentación de la API
