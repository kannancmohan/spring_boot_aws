# stores-api
Sample app to demonstrate the configuration of aws secrets and spring boot

## prerequisite
* Java 17
* Maven 3.5+
* create a new secret in aws secrets manager with name "project-dev-be-ct-myservice-api-secret"

## Build 
mvn clean install 

## Run
* set the following environment variable
    AWS_REGION=eu-central-1
    AWS_ACCESS_KEY_ID
    AWS_SECRET_ACCESS_KEY
    AWS_SESSION_TOKEN
 
    eg: AWS_SESSION_TOKEN={aws-token};AWS_REGION=eu-central-1;AWS_ACCESS_KEY_ID={aws-key};AWS_SECRET_ACCESS_KEY={aws-secret-key}
* Start application using `mvn spring-boot:run`

## Test
check the method com.kcm.springboot.aws.secrets.springbootawssecrets.SpringbootAwsSecretsApplication.run
