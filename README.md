# Java DDD Template

This is a template for using in Java Domain-Driven projects. It contains all the projects with their own respective folders. The root `pom.xml` already references all of the child projects. All of the files in this project were handcrafted, including the configuration ones to keep the structure clean, but any IDE that has support for Maven should be able to import everything.

The only projects that already include some files are **domain** and **api**.

The domain project contains the necessary base classes to handle **value objects**, **entities**, **aggregate roots**, and **domain exceptions**.

The api project contains the `persistence.xml` configuration file pointing to a JNDI resource (configuration needed for the application server) and the main entry point in the `App.java` file as required by the JAX-RS specification.

## Compatibility

The template is configure to use **Jakarta's 9** specification, which supports **Java 11**.

## Coming Soon

This template needs to be updated to support later versions of Java and Jakarta. Some files also need to be added to simplify the configuration. The domain project still lacks support for domain events, but this will probably not be included because most developers have their own preferences on how to handle things like this.

## License
[MIT](LICENSE)
