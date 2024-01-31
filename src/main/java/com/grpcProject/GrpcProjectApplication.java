package com.grpcProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;


@SpringBootApplication
@Configuration
public class GrpcProjectApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		SpringApplication.run(GrpcProjectApplication.class, args);

	}

}

