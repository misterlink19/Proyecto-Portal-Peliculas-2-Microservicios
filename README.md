# Gestión de Películas con Spring Boot

Este proyecto es una aplicación web desarrollada con Spring Boot para la gestión de películas, inspirada en la funcionalidad de portales como Filmaffinity. El objetivo principal fue aplicar y consolidar los conocimientos adquiridos en la asignatura de Frameworks Backend y Microservicios, utilizando tecnologías clave como Microservicios, JPA (con conexión a MySQL), servicios REST y el patrón MVC.

## Funcionalidades Principales

* Gestión completa de películas: alta, baja, modificación y listado.
* Gestión completa de actores: alta, baja, modificación y listado.
* Búsquedas de películas por título, género y actor.
* Almacenamiento de información detallada de películas (título, año, duración, país, dirección, género, sinopsis, imagen de portada) y actores (nombre, fecha de nacimiento, país de nacimiento).

## Tecnologías Utilizadas

* Spring Boot
* Microservicios
* JPA (Hibernate)
* MySQL
* Servicios REST
* MVC
* Thymeleaf
* Maven

## Estructura del Proyecto

El proyecto se divide en dos microservicios principales:

* **Backend (Lógica de Negocio):** Encargado de la gestión de datos mediante JPA y servicios REST.
* **Frontend (Capa de Presentación):** Un cliente del microservicio backend que utiliza Thymeleaf para la presentación de la interfaz web.

## Instrucciones de Ejecución

1.  Clonar el repositorio.
2.  Ejecutar los scripts para crear la base de datos MySQL y sus datos  en la carpeta DB donde esta el scritp  `DB/Portal Pelicula V3.sql` y `DB/Datos Portal Pelicula V3.sql`.
3.  Configurar las propiedades de conexión a la base de datos en los archivos `application.properties` de los microservicios.
4.  Ejecutar los microservicios Spring Boot utilizando Maven:
    * `cd PortalPeliculas_Cliente && mvn spring-boot:run`
    * `cd PortalPeliculas_Microservicio_ActorYPelicula && mvn spring-boot:run`
5.  Acceder a la aplicación en `http://localhost:9000` (o otro puerto que quiera configurar).

## Posibles Mejoras Futuras

* Implementación de la funcionalidad para usuarios no administradores.
* Mejoras en la interfaz de usuario.
* Implementación de pruebas unitarias y de integración.
* Implementación de seguridad.
