# OHDM/Linked Open Data

## What is this
The idea of Linked Open Data is to repeat the same thing we already did with
the www and web pages.
The only difference is that we are now using data.
So basically we are exposing data to the internet which links to other data
on the internet, that's it.
This particular implementation will be exposing the data of the Open Historical
Data Maps project.

## Quick Start
First of all, a detailed documentation will be available in the [documentation repository](https://github.com/OpenHistoricalDataMap/OHDM-Documentation)
of the OHDM project, but for the initial docs here is a quickstart.

This webapp is a springboot project, if you don't know what it is and how to eat it stop
here and read [THIS](https://docs.spring.io/spring-boot/docs/1.5.8.RELEASE/reference/htmlsingle/#getting-started-introducing-spring-boot).  
Now that you read the documentation **thoroughly**, or at least the getting started part, you can start this app.  
First of all we need to create a `application.properties` file in the `/src/main/resource/` directory.  
This file should contain the following.

```properties
##/src/main/resource/application.properties
spring.datasource.url = the datasource URL e.g. jdbc:postgres://localhost:5432/my_database
spring.datasource.username = username
spring.datasource.password = superAwesomeSecretPassword

spring.jpa.hibernate.ddl-auto=none
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQL9Dialect
spring.jpa.properties.hibernate.default_schema=someScheme #optional
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
```

Now that you've linked your datasource you can start the app via mavenwrapper, provided by springboot.
```bash
#For Linux/MacOS
./mvnw spring-boot:run

#For Windows
mvnw.cmd spring-boot:run
```
The wrapper is there to handle version disparities for you, it will download a compatible mvn version to
run the app.

After all is said and done just visit [http://localhost:8080/](http://localhost:8080/) which should show you
the page with further links to discover the API.
