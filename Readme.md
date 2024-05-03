# Simple Auth Example
### An example project to showcase basic security setup in spring applications
* Secures Endpoint using JWT token 
* Uses thymeleaf for basic front-end

## Stack
1. Java v21
2. Spring boot v3.2.5
3. MySQL v8+
4. OpenAPI v3
5. Gradle v8.7

## Directories /Files:
1. specs: OpenAPI spec files for writing documented APIs and generating stubs
2. src: project source code
   1. main: where the project code will be written
   2. main/resources: contains directories for migration, templates and spring properties
   3. test: for test code
3. build.gradle: dependencies
4. settings.gradle: project settings

## Commands:
#### 1. Validate and generate stubs:
```agsl
./gradlew clean openApiValidate openApiGenerate mergeSpec

```
this will generate API interface with defined end points in `build/src/main.../api` and API request and response entities in `build/src/main.../model`

#### 2. Build project:
``` ./gradlew build ```

#### 3. Run server:
```./gradlew bootRun```

## Note: 
1. Ensure that MySQL configuration is updated correctly in `application.yml` file
2. Tests are currently being skipped

