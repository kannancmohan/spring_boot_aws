package com.kcm.springboot.aws.secrets.springbootawssecrets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringbootAwsSecretsApplication implements CommandLineRunner {

  @Autowired private Environment environment;

  public static void main(String[] args) {
    SpringApplication.run(SpringbootAwsSecretsApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(">>>>>>>>>>>>>>>Added for Testing the secrets<<<<<<<<<<<<<<<<");
    System.out.println("Secret value " + environment.getProperty("projectKey"));
  }
}
