# Sobre este Proyecto
Este proyecto es una implementación de un API rest que 
devuelve un listado de personas. Los datos son almacenados 
en una base de datos embebida (H2)
# Instalación local
#### Herramientas Necesarias
- IntelliJ IDE 2022
- JDK 1.8.0_202
- Maven 3.6.1
- Git 2.28.0
#### Pasos
- Clone el repositorio
- Instale el IDE de desarrollo IntelliJ
- Instale y configura JDK en IntelliJ
- Importe el proyecto File->Open
- Correr el proyecto con el SDK Java 8
- Acceder desde el navegador a la consola de H2; 
http://localhost:8080/h2-console e ingresar con los datos
contenidos en el archivo application.yaml. De manera 
automática se creará la tabla y sus atributos. En la ruta src/main/resources/data.sql 
se encuentra el archivo sql con los inserts iniciales para obtener datos.
- Finalmente a través de insomia o postman se puede probar el servicio desde 
la ruta: localhost:8080/person