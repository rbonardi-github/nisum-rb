# Nisum - Crud de Usuarios con seguridad JWT

![](https://img.shields.io/badge/build-success-brightgreen.svg)

# Stack Tecnológico

![](https://img.shields.io/badge/java_11-✓-blue.svg)
![](https://img.shields.io/badge/spring_boot-✓-blue.svg)
![](https://img.shields.io/badge/h2_database-✓-blue.svg)
![](https://img.shields.io/badge/jwt-✓-blue.svg)
![](https://img.shields.io/badge/openapi_3-✓-blue.svg)

# Resumen

Servicio para el alta, eliminación y consulta de usuarios, así como su logueo para no permitir peticiones inseguras.
![](./doc/Diagrama-Flujo.jpg) 

# Diagrama de componentes

![](./doc/Diagrama-componentes.jpg)

# Iniciar el servicio

1. Requsitos: [Java 11](https://www.java.com/download/) y [Maven](https://maven.apache.org)

2. Clonar el repositorio

```
$ git clone https://github.com/rbonardi-github/nisum-rb.git
```

3. Posicionarse en la carpeta

```
$ cd nisum-rb
```

4. Compilación e instalación de dependencias

```
$ mvn clean package
```

5. Arranque del servicio

```
$ mvn spring-boot:run
```

```javascript
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.6.13)

2023-10-16 10:11:01.825  INFO 15548 --- [           main] com.nisum.users.ServiceApplication       : Starting ServiceApplication using Java 11.0.12 on DESKTOP-TKEKVBL with PID 15548 (C:\Nisum\
entrevista\nisum-rb\target\classes started by ruben in C:\Nisum\entrevista\nisum-rb)
2023-10-16 10:11:01.829  INFO 15548 --- [           main] com.nisum.users.ServiceApplication       : The following 1 profile is active: "local"
2023-10-16 10:11:02.510  INFO 15548 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2023-10-16 10:11:02.563  INFO 15548 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 46 ms. Found 1 JPA repository interfaces.
2023-10-16 10:11:03.489  INFO 15548 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-10-16 10:11:03.498  INFO 15548 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-10-16 10:11:03.499  INFO 15548 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.68]
2023-10-16 10:11:03.700  INFO 15548 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-10-16 10:11:03.700  INFO 15548 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1812 ms
2023-10-16 10:11:03.733  INFO 15548 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-10-16 10:11:03.837  INFO 15548 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2023-10-16 10:11:03.848  INFO 15548 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:nisum_db'
2023-10-16 10:11:03.945  INFO 15548 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2023-10-16 10:11:03.988  INFO 15548 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.12.Final
2023-10-16 10:11:04.094  INFO 15548 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-10-16 10:11:04.175  INFO 15548 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-10-16 10:11:04.718  INFO 15548 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform
.internal.NoJtaPlatform]
2023-10-16 10:11:04.726  INFO 15548 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2023-10-16 10:11:05.101  WARN 15548 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed
 during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2023-10-16 10:11:05.275  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/v3/api-docs']. This is not recommen
ded -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.276  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/v3/api-docs']
2023-10-16 10:11:05.276  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/v3/api-docs/**']. This is not recom
mended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.277  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/v3/api-docs/**']
2023-10-16 10:11:05.277  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/swagger-resources/**']. This is not
 recommended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.278  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/swagger-resources/**']
2023-10-16 10:11:05.279  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/swagger-ui.html']. This is not reco
mmended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.280  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/swagger-ui.html']
2023-10-16 10:11:05.280  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/swagger-ui/**']. This is not recomm
ended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.281  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/swagger-ui/**']
2023-10-16 10:11:05.281  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/configuration/**']. This is not rec
ommended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.281  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/configuration/**']
2023-10-16 10:11:05.281  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/webjars/**']. This is not recommend
ed -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.281  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/webjars/**']
2023-10-16 10:11:05.282  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/public']. This is not recommended -
- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.282  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/public']
2023-10-16 10:11:05.282  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/h2-console/**']. This is not recomm
ended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.283  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/h2-console/**']
2023-10-16 10:11:05.324  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.context.request.async.WebAsy
ncManagerIntegrationFilter@3538a129, org.springframework.security.web.context.SecurityContextPersistenceFilter@177302d6, org.springframework.security.web.header.HeaderWriterFilter@8c34631, org
.springframework.security.web.authentication.logout.LogoutFilter@2213854b, com.nisum.users.security.JwtTokenFilter@766db6f9, org.springframework.security.web.savedrequest.RequestCacheAwareFilt
er@21046afa, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@41bbdd8a, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@6f8fb90
6, org.springframework.security.web.session.SessionManagementFilter@3aa63b53, org.springframework.security.web.access.ExceptionTranslationFilter@4a094f90, org.springframework.security.web.acce
ss.intercept.FilterSecurityInterceptor@742dbac8]
2023-10-16 10:11:05.824  INFO 15548 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-10-16 10:11:05.834  INFO 15548 --- [           main] com.nisum.users.ServiceApplication       : Started ServiceApplication in 4.42 seconds (JVM running for 4.894)

```

# Acceso a consolas

Una vez iniciado el servicio puede acceder a las consolas:

1. Consola OpenApi

`http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/` 

2.- Consola Base de Datos H2

Usuario: root
Password: root
BD: nisum_db

![](./doc/bd.jpg)


# Prueba servicio

Una vez iniciado el servicio puede acceder a las consolas:

1. Operación `POST /users/signup`

Request ROLE_ADMIN

```
{
  "name": "Ruben Bonardi - Admin",
  "username": "arbonardi",
  "email": "ruben.bonardi@gmail.com.cl",
  "password": "arbonardi",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_ADMIN"
  ]
}
```

Request ROLE_CLIENT

```
{
  "name": "Ruben Bonardi - Client",
  "username": "crbonardi",
  "email": "ruben_bonardi@hotmail.com.cl",
  "password": "crbonardi",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_CLIENT"
  ]
}
```

Ejecución

```
curl -X 'POST' \
  'http://localhost:8080/users/signup' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "name": "Ruben Bonardi - Admin",
  "username": "arbonardi",
  "email": "ruben.bonardi@gmail.com.cl",
  "password": "arbonardi",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_ADMIN"
  ]
}'
```

Respuesta

```
{
  "id": 1,
  "uuid": "2b235246-768c-476c-a07d-eb709382d1cf",
  "name": "Ruben Bonardi - Admin",
  "username": "arbonardi",
  "email": "ruben.bonardi@gmail.com.cl",
  "isActive": true,
  "createdDate": "2023-10-16",
  "modifyDate": "2023-10-16",
  "lastLogin": "2023-10-16",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_ADMIN"
  ],
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0NjY3OTMsImV4cCI6MTY5NzQ2NzA5M30.psYAsqOYcJFl5yWC07RUYQqujigHlilv94tOMpgkrEk"
}
```

2. Operación `POST /users/signin`

Esta operación realiza el login para el usario conectado.

Nota: el token obtenido al crear (operacion 1) o realizar login (operacion 2) debe colocarse en el "Authorize" anteponiendo el literal "Bearer".

![](./doc/authorize.jpg)

Ejecución
```
curl -X 'POST' \
  'http://localhost:8080/users/signin?username=arbonardi&password=arbonardi' \
  -H 'accept: */*' \
  -d ''
```
Respuesta
```
eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0NjcyNzgsImV4cCI6MTY5NzQ2NzU3OH0.CPfk6cHLoZX8dD298wCSy-Ueq2-Nk9Qt1DPRsf_CBhY
```

3. Operación `GET /users/me`

Recupera la información del usuario logueado

Ejecución
```
curl -X 'GET' \
  'http://localhost:8080/users/me' \
  -H 'accept: */*' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0Njc0NTIsImV4cCI6MTY5NzQ2Nzc1Mn0.47e5nMmlHz-gpfar5gpTybOjUaG-IPX_8N2SbZ6_r7M'
```
Respuesta
```
{
  "id": 1,
  "uuid": "2b235246-768c-476c-a07d-eb709382d1cf",
  "name": "Ruben Bonardi - Admin",
  "username": "arbonardi",
  "email": "ruben.bonardi@gmail.com.cl",
  "isActive": true,
  "createdDate": "2023-10-16",
  "modifyDate": "2023-10-16",
  "lastLogin": "2023-10-16",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_ADMIN"
  ],
  "token": null
}
```

4. Operación `GET /users/{username}`

Recupera la información de un usuario. Solo puede ser llamao con un usuario con ROLE_ADMIN

Ejecución
```
curl -X 'GET' \
  'http://localhost:8080/users/arbonardi' \
  -H 'accept: */*' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0Njc0NTIsImV4cCI6MTY5NzQ2Nzc1Mn0.47e5nMmlHz-gpfar5gpTybOjUaG-IPX_8N2SbZ6_r7M'
```
Respuesta
```
{
  "id": 1,
  "uuid": "2b235246-768c-476c-a07d-eb709382d1cf",
  "name": "Ruben Bonardi - Admin",
  "username": "arbonardi",
  "email": "ruben.bonardi@gmail.com.cl",
  "isActive": true,
  "createdDate": "2023-10-16",
  "modifyDate": "2023-10-16",
  "lastLogin": "2023-10-16",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_ADMIN"
  ],
  "token": null
}
```

5. Operación `GET /users/refresh`

Refresca el token del usuario logueado.

Ejecución
```
curl -X 'GET' \
  'http://localhost:8080/users/refresh' \
  -H 'accept: */*' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0Njc0NTIsImV4cCI6MTY5NzQ2Nzc1Mn0.47e5nMmlHz-gpfar5gpTybOjUaG-IPX_8N2SbZ6_r7M'
```
Respuesta
```
eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0Njc2MzIsImV4cCI6MTY5NzQ2NzkzMn0.sh8T7suEY7vdr0FisHZtzUOicVK_wrVYbaPF1OMrHX4
```

6. Operación `DELETE /users/{username}`

Elimina un usuario. Solo puede ser llamao con un usuario con ROLE_ADMIN

Ejecución
```
curl -X 'DELETE' \
  'http://localhost:8080/users/arbonardi' \
  -H 'accept: */*' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0Njc3MTcsImV4cCI6MTY5NzQ2ODAxN30.WneqxdCbMuw8JxgJZQH6zHY1naC22vmiD87H_PPJNs4'
```
Respuesta
```
arbonardi
```

# Verificación de pruebas unitarias

Para verificar las pruebas unitarias del servicio, se debe ejecutar el comando

```
mvn clean package
```

Resultado Consola

```
ruben@DESKTOP-TKEKVBL MINGW64 /c/Nisum/entrevista/nisum-rb (main)
$ mvn clean package
[INFO] Scanning for projects...
[INFO]
[INFO] ----------------------< com.nisum.users:nisum-rb >----------------------
[INFO] Building nisum-rb 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ nisum-rb ---
[INFO] Deleting C:\Nisum\entrevista\nisum-rb\target
[INFO]
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ nisum-rb ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ nisum-rb ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 23 source files to C:\Nisum\entrevista\nisum-rb\target\classes
[INFO]
[INFO] --- maven-resources-plugin:3.2.0:testResources (default-testResources) @ nisum-rb ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 2 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ nisum-rb ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 4 source files to C:\Nisum\entrevista\nisum-rb\target\test-classes
[INFO] /C:/Nisum/entrevista/nisum-rb/src/test/java/com/nisum/users/controller/UserControllerTest.java: C:\Nisum\entrevista\nisum-rb\src\test\java\com\nisum\users\controller\UserControllerTest.
java uses or overrides a deprecated API.
[INFO] /C:/Nisum/entrevista/nisum-rb/src/test/java/com/nisum/users/controller/UserControllerTest.java: Recompile with -Xlint:deprecation for details.
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ nisum-rb ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.nisum.users.controller.UserControllerTest
12:14:51.136 [main] DEBUG org.jboss.logging - Logging Provider: org.jboss.logging.Log4j2LoggerProvider
12:14:51.139 [main] INFO org.hibernate.validator.internal.util.Version - HV000001: Hibernate Validator 6.2.5.Final
12:14:51.161 [main] DEBUG org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator - Loaded expression factory via original TCCL
12:14:51.161 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom MessageInterpolator of type org.springframework.validation.beanvalidation.LocaleCon
textMessageInterpolator
12:14:51.162 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom ParameterNameProvider of type org.springframework.validation.beanvalidation.LocalVa
lidatorFactoryBean$1
12:14:51.166 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - Trying to load META-INF/validation.xml for XML based Validator configuration.
12:14:51.167 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via TCCL
12:14:51.167 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via Hibernate Validator's class loader
12:14:51.167 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - No META-INF/validation.xml found. Using annotation based configuration only.
12:14:51.174 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Found javax.persistence.Persistence on classpath containing 'getPersistenceUtil'. Assuming JPA
 2 environment. Trying to instantiate JPA aware TraversableResolver
12:14:51.176 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Instantiated JPA aware TraversableResolver of type org.hibernate.validator.internal.engine.res
olver.JPATraversableResolver.
12:14:51.292 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider
as property node name provider.
12:14:51.300 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.springframework.validation.beanvalidation.LocaleContextMessageInterp
olator as ValidatorFactory-scoped message interpolator.
12:14:51.300 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver
as ValidatorFactory-scoped traversable resolver.
12:14:51.300 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as
 ValidatorFactory-scoped parameter name provider.
12:14:51.300 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.DefaultClockProvider as Validato
rFactory-scoped clock provider.
12:14:51.300 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluator
Factory as ValidatorFactory-scoped script evaluator factory.
12:14:51.466 [main] DEBUG _org.springframework.web.servlet.HandlerMapping.Mappings -
        c.n.u.c.UserController:
        {DELETE [/users/{username}]}: delete(String)
        {GET [/users/{username}]}: search(String)
        {POST [/users/signup]}: signup(UserDataDTO)
        {GET [/users/refresh]}: refresh(HttpServletRequest)
        {GET [/users/me]}: whoami(HttpServletRequest)
        {POST [/users/signin]}: login(String,String)
12:14:51.473 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - 6 mappings in org.springframework.web.servlet.mvc.method.annotation.RequestMappin
gHandlerMapping
12:14:51.705 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter - ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1
ResponseBodyAdvice
12:14:51.732 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver - ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
12:14:51.755 [main] INFO org.springframework.mock.web.MockServletContext - Initializing Spring TestDispatcherServlet ''
12:14:51.755 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Initializing Servlet ''
12:14:51.758 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected AcceptHeaderLocaleResolver
12:14:51.758 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected FixedThemeResolver
12:14:51.758 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@692dba54
12:14:51.759 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.support.SessionFlashMapManager@71f1cc02
12:14:51.759 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logg
ing of potentially sensitive data
12:14:51.759 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Completed initialization in 4 ms
12:14:51.795 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - GET "/users/users/refresh", parameters={}
12:14:51.798 [main] WARN org.springframework.web.servlet.PageNotFound - No mapping for GET /users/users/refresh
12:14:51.800 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Completed 404 NOT_FOUND
12:14:51.809 [main] DEBUG org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator - Loaded expression factory via original TCCL
12:14:51.809 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom MessageInterpolator of type org.springframework.validation.beanvalidation.LocaleCon
textMessageInterpolator
12:14:51.809 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom ParameterNameProvider of type org.springframework.validation.beanvalidation.LocalVa
lidatorFactoryBean$1
12:14:51.809 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - Trying to load META-INF/validation.xml for XML based Validator configuration.
12:14:51.810 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via TCCL
12:14:51.810 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via Hibernate Validator's class loader
12:14:51.810 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - No META-INF/validation.xml found. Using annotation based configuration only.
12:14:51.811 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Found javax.persistence.Persistence on classpath containing 'getPersistenceUtil'. Assuming JPA
 2 environment. Trying to instantiate JPA aware TraversableResolver
12:14:51.811 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Instantiated JPA aware TraversableResolver of type org.hibernate.validator.internal.engine.res
olver.JPATraversableResolver.
12:14:51.813 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider
as property node name provider.
12:14:51.813 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.springframework.validation.beanvalidation.LocaleContextMessageInterp
olator as ValidatorFactory-scoped message interpolator.
12:14:51.813 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver
as ValidatorFactory-scoped traversable resolver.
12:14:51.813 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as
 ValidatorFactory-scoped parameter name provider.
12:14:51.813 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.DefaultClockProvider as Validato
rFactory-scoped clock provider.
12:14:51.813 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluator
Factory as ValidatorFactory-scoped script evaluator factory.
12:14:51.819 [main] DEBUG _org.springframework.web.servlet.HandlerMapping.Mappings -
        c.n.u.c.UserController:
        {DELETE [/users/{username}]}: delete(String)
        {GET [/users/{username}]}: search(String)
        {POST [/users/signup]}: signup(UserDataDTO)
        {GET [/users/refresh]}: refresh(HttpServletRequest)
        {GET [/users/me]}: whoami(HttpServletRequest)
        {POST [/users/signin]}: login(String,String)
12:14:51.821 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - 6 mappings in org.springframework.web.servlet.mvc.method.annotation.RequestMappin
gHandlerMapping
12:14:51.830 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter - ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1
ResponseBodyAdvice
12:14:51.833 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver - ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
12:14:51.833 [main] INFO org.springframework.mock.web.MockServletContext - Initializing Spring TestDispatcherServlet ''
12:14:51.833 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Initializing Servlet ''
12:14:51.833 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected AcceptHeaderLocaleResolver
12:14:51.833 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected FixedThemeResolver
12:14:51.833 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@346f41a9
12:14:51.833 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.support.SessionFlashMapManager@1084f78c
12:14:51.833 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logg
ing of potentially sensitive data
12:14:51.833 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Completed initialization in 0 ms
12:14:51.834 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - GET "/users/users/me", parameters={}
12:14:51.834 [main] WARN org.springframework.web.servlet.PageNotFound - No mapping for GET /users/users/me
12:14:51.834 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Completed 404 NOT_FOUND
12:14:51.838 [main] DEBUG org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator - Loaded expression factory via original TCCL
12:14:51.838 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom MessageInterpolator of type org.springframework.validation.beanvalidation.LocaleCon
textMessageInterpolator
12:14:51.838 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom ParameterNameProvider of type org.springframework.validation.beanvalidation.LocalVa
lidatorFactoryBean$1
12:14:51.839 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - Trying to load META-INF/validation.xml for XML based Validator configuration.
12:14:51.839 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via TCCL
12:14:51.839 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via Hibernate Validator's class loader
12:14:51.840 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - No META-INF/validation.xml found. Using annotation based configuration only.
12:14:51.840 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Found javax.persistence.Persistence on classpath containing 'getPersistenceUtil'. Assuming JPA
 2 environment. Trying to instantiate JPA aware TraversableResolver
12:14:51.840 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Instantiated JPA aware TraversableResolver of type org.hibernate.validator.internal.engine.res
olver.JPATraversableResolver.
12:14:51.843 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider
as property node name provider.
12:14:51.843 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.springframework.validation.beanvalidation.LocaleContextMessageInterp
olator as ValidatorFactory-scoped message interpolator.
12:14:51.844 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver
as ValidatorFactory-scoped traversable resolver.
12:14:51.844 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as
 ValidatorFactory-scoped parameter name provider.
12:14:51.844 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.DefaultClockProvider as Validato
rFactory-scoped clock provider.
12:14:51.844 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluator
Factory as ValidatorFactory-scoped script evaluator factory.
12:14:51.850 [main] DEBUG _org.springframework.web.servlet.HandlerMapping.Mappings -
        c.n.u.c.UserController:
        {DELETE [/users/{username}]}: delete(String)
        {GET [/users/{username}]}: search(String)
        {POST [/users/signup]}: signup(UserDataDTO)
        {GET [/users/refresh]}: refresh(HttpServletRequest)
        {GET [/users/me]}: whoami(HttpServletRequest)
        {POST [/users/signin]}: login(String,String)
12:14:51.852 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - 6 mappings in org.springframework.web.servlet.mvc.method.annotation.RequestMappin
gHandlerMapping
12:14:51.856 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter - ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1
ResponseBodyAdvice
12:14:51.858 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver - ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
12:14:51.859 [main] INFO org.springframework.mock.web.MockServletContext - Initializing Spring TestDispatcherServlet ''
12:14:51.859 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Initializing Servlet ''
12:14:51.859 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected AcceptHeaderLocaleResolver
12:14:51.859 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected FixedThemeResolver
12:14:51.859 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@3451f01d
12:14:51.859 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.support.SessionFlashMapManager@72503b19
12:14:51.859 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logg
ing of potentially sensitive data
12:14:51.859 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Completed initialization in 0 ms
12:14:51.861 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - POST "/users/signin?username=arbonardi&password=arbonardi", parameters={masked}
12:14:51.863 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - Mapped to com.nisum.users.controller.UserController#login(String, String)
12:14:51.909 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor - Using 'text/plain', given [*/*] and supported [text/plain, */*, application
/json, application/*+json]
12:14:51.910 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor - Nothing to write: null body
12:14:51.911 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Completed 200 OK
12:14:51.913 [main] DEBUG org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator - Loaded expression factory via original TCCL
12:14:51.913 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom MessageInterpolator of type org.springframework.validation.beanvalidation.LocaleCon
textMessageInterpolator
12:14:51.913 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom ParameterNameProvider of type org.springframework.validation.beanvalidation.LocalVa
lidatorFactoryBean$1
12:14:51.913 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - Trying to load META-INF/validation.xml for XML based Validator configuration.
12:14:51.913 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via TCCL
12:14:51.914 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via Hibernate Validator's class loader
12:14:51.914 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - No META-INF/validation.xml found. Using annotation based configuration only.
12:14:51.914 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Found javax.persistence.Persistence on classpath containing 'getPersistenceUtil'. Assuming JPA
 2 environment. Trying to instantiate JPA aware TraversableResolver
12:14:51.914 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Instantiated JPA aware TraversableResolver of type org.hibernate.validator.internal.engine.res
olver.JPATraversableResolver.
12:14:51.915 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider
as property node name provider.
12:14:51.915 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.springframework.validation.beanvalidation.LocaleContextMessageInterp
olator as ValidatorFactory-scoped message interpolator.
12:14:51.916 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver
as ValidatorFactory-scoped traversable resolver.
12:14:51.916 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as
 ValidatorFactory-scoped parameter name provider.
12:14:51.916 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.DefaultClockProvider as Validato
rFactory-scoped clock provider.
12:14:51.916 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluator
Factory as ValidatorFactory-scoped script evaluator factory.
12:14:51.919 [main] DEBUG _org.springframework.web.servlet.HandlerMapping.Mappings -
        c.n.u.c.UserController:
        {DELETE [/users/{username}]}: delete(String)
        {GET [/users/{username}]}: search(String)
        {POST [/users/signup]}: signup(UserDataDTO)
        {GET [/users/refresh]}: refresh(HttpServletRequest)
        {GET [/users/me]}: whoami(HttpServletRequest)
        {POST [/users/signin]}: login(String,String)
12:14:51.921 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - 6 mappings in org.springframework.web.servlet.mvc.method.annotation.RequestMappin
gHandlerMapping
12:14:51.924 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter - ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1
ResponseBodyAdvice
12:14:51.927 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver - ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
12:14:51.928 [main] INFO org.springframework.mock.web.MockServletContext - Initializing Spring TestDispatcherServlet ''
12:14:51.928 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Initializing Servlet ''
12:14:51.928 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected AcceptHeaderLocaleResolver
12:14:51.928 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected FixedThemeResolver
12:14:51.928 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@5c9934da
12:14:51.928 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.support.SessionFlashMapManager@4cb702ce
12:14:51.928 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logg
ing of potentially sensitive data
12:14:51.928 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Completed initialization in 0 ms
12:14:52.022 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - POST "/users/signup", parameters={}
12:14:52.022 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - Mapped to com.nisum.users.controller.UserController#signup(UserDataDTO)
12:14:52.054 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor - Read "application/json" to [UserDataDTO(name=Ruben Bonardi - Admin, usernam
e=arbonardi, email=ruben.bonardi@gmail.com.cl, passwo (truncated)...]
12:14:52.096 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor - Using 'application/json', given [*/*] and supported [application/json, appl
ication/*+json]
12:14:52.096 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor - Nothing to write: null body
12:14:52.097 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Completed 200 OK
12:14:52.100 [main] DEBUG org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator - Loaded expression factory via original TCCL
12:14:52.100 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom MessageInterpolator of type org.springframework.validation.beanvalidation.LocaleCon
textMessageInterpolator
12:14:52.100 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom ParameterNameProvider of type org.springframework.validation.beanvalidation.LocalVa
lidatorFactoryBean$1
12:14:52.100 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - Trying to load META-INF/validation.xml for XML based Validator configuration.
12:14:52.101 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via TCCL
12:14:52.101 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via Hibernate Validator's class loader
12:14:52.101 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - No META-INF/validation.xml found. Using annotation based configuration only.
12:14:52.102 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Found javax.persistence.Persistence on classpath containing 'getPersistenceUtil'. Assuming JPA
 2 environment. Trying to instantiate JPA aware TraversableResolver
12:14:52.102 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Instantiated JPA aware TraversableResolver of type org.hibernate.validator.internal.engine.res
olver.JPATraversableResolver.
12:14:52.103 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider
as property node name provider.
12:14:52.104 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.springframework.validation.beanvalidation.LocaleContextMessageInterp
olator as ValidatorFactory-scoped message interpolator.
12:14:52.104 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver
as ValidatorFactory-scoped traversable resolver.
12:14:52.104 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as
 ValidatorFactory-scoped parameter name provider.
12:14:52.104 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.DefaultClockProvider as Validato
rFactory-scoped clock provider.
12:14:52.104 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluator
Factory as ValidatorFactory-scoped script evaluator factory.
12:14:52.108 [main] DEBUG _org.springframework.web.servlet.HandlerMapping.Mappings -
        c.n.u.c.UserController:
        {DELETE [/users/{username}]}: delete(String)
        {GET [/users/{username}]}: search(String)
        {POST [/users/signup]}: signup(UserDataDTO)
        {GET [/users/refresh]}: refresh(HttpServletRequest)
        {GET [/users/me]}: whoami(HttpServletRequest)
        {POST [/users/signin]}: login(String,String)
12:14:52.110 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - 6 mappings in org.springframework.web.servlet.mvc.method.annotation.RequestMappin
gHandlerMapping
12:14:52.113 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter - ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1
ResponseBodyAdvice
12:14:52.115 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver - ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
12:14:52.115 [main] INFO org.springframework.mock.web.MockServletContext - Initializing Spring TestDispatcherServlet ''
12:14:52.115 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Initializing Servlet ''
12:14:52.115 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected AcceptHeaderLocaleResolver
12:14:52.115 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected FixedThemeResolver
12:14:52.116 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@413bef78
12:14:52.116 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.support.SessionFlashMapManager@66383c29
12:14:52.116 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logg
ing of potentially sensitive data
12:14:52.116 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Completed initialization in 1 ms
12:14:52.116 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - GET "/users/users/arbonardi", parameters={}
12:14:52.117 [main] WARN org.springframework.web.servlet.PageNotFound - No mapping for GET /users/users/arbonardi
12:14:52.117 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Completed 404 NOT_FOUND
12:14:52.118 [main] DEBUG org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator - Loaded expression factory via original TCCL
12:14:52.119 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom MessageInterpolator of type org.springframework.validation.beanvalidation.LocaleCon
textMessageInterpolator
12:14:52.119 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom ParameterNameProvider of type org.springframework.validation.beanvalidation.LocalVa
lidatorFactoryBean$1
12:14:52.119 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - Trying to load META-INF/validation.xml for XML based Validator configuration.
12:14:52.119 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via TCCL
12:14:52.120 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via Hibernate Validator's class loader
12:14:52.120 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - No META-INF/validation.xml found. Using annotation based configuration only.
12:14:52.121 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Found javax.persistence.Persistence on classpath containing 'getPersistenceUtil'. Assuming JPA
 2 environment. Trying to instantiate JPA aware TraversableResolver
12:14:52.121 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Instantiated JPA aware TraversableResolver of type org.hibernate.validator.internal.engine.res
olver.JPATraversableResolver.
12:14:52.123 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider
as property node name provider.
12:14:52.125 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.springframework.validation.beanvalidation.LocaleContextMessageInterp
olator as ValidatorFactory-scoped message interpolator.
12:14:52.125 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver
as ValidatorFactory-scoped traversable resolver.
12:14:52.125 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as
 ValidatorFactory-scoped parameter name provider.
12:14:52.125 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.DefaultClockProvider as Validato
rFactory-scoped clock provider.
12:14:52.125 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluator
Factory as ValidatorFactory-scoped script evaluator factory.
12:14:52.130 [main] DEBUG _org.springframework.web.servlet.HandlerMapping.Mappings -
        c.n.u.c.UserController:
        {DELETE [/users/{username}]}: delete(String)
        {GET [/users/{username}]}: search(String)
        {POST [/users/signup]}: signup(UserDataDTO)
        {GET [/users/refresh]}: refresh(HttpServletRequest)
        {GET [/users/me]}: whoami(HttpServletRequest)
        {POST [/users/signin]}: login(String,String)
12:14:52.131 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - 6 mappings in org.springframework.web.servlet.mvc.method.annotation.RequestMappin
gHandlerMapping
12:14:52.134 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter - ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1
ResponseBodyAdvice
12:14:52.136 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver - ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
12:14:52.137 [main] INFO org.springframework.mock.web.MockServletContext - Initializing Spring TestDispatcherServlet ''
12:14:52.137 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Initializing Servlet ''
12:14:52.137 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected AcceptHeaderLocaleResolver
12:14:52.137 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected FixedThemeResolver
12:14:52.137 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@52ae997b
12:14:52.137 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.support.SessionFlashMapManager@f557c37
12:14:52.137 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logg
ing of potentially sensitive data
12:14:52.137 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Completed initialization in 0 ms
12:14:52.137 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - DELETE "/users/users/arbonardi", parameters={}
12:14:52.138 [main] WARN org.springframework.web.servlet.PageNotFound - No mapping for DELETE /users/users/arbonardi
12:14:52.139 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Completed 404 NOT_FOUND
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.682 s - in com.nisum.users.controller.UserControllerTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- maven-jar-plugin:3.2.2:jar (default-jar) @ nisum-rb ---
[INFO] Building jar: C:\Nisum\entrevista\nisum-rb\target\nisum-rb-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot-maven-plugin:2.6.13:repackage (repackage) @ nisum-rb ---
[INFO] Replacing main artifact with repackaged archive
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  13.045 s
[INFO] Finished at: 2023-10-16T12:14:55-03:00
[INFO] ------------------------------------------------------------------------

ruben@DESKTOP-TKEKVBL MINGW64 /c/Nisum/entrevista/nisum-rb (main)

```