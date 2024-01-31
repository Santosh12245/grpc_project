package com.grpcProject;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class BookConfig {

      @Bean
      public BookResponse call() throws IOException, InterruptedException {
          Server s = ServerBuilder.forPort(9090).addService(new BookService()).build();
          s.start();

          System.out.println("Server start with" + s.getPort());
          s.awaitTermination();

          return null ;

      }



}
