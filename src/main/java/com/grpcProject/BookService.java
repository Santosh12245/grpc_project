package com.grpcProject;

import com.grpcProject.BookRequest;
import com.grpcProject.BookResponse;
import com.grpcProject.BookServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Service
public class BookService {

    @Autowired
    ManagedChannel channel ;

    public void getBook() {

//        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

        BookServiceGrpc.BookServiceBlockingStub stub = BookServiceGrpc.newBlockingStub(channel);
        System.out.println(" This is stub  :"   +   stub);



            System.out.println("Starting :            ");
            BookResponse bookResponse = stub.getBook(BookRequest.newBuilder().setBookId("2").build());

            System.out.println(bookResponse.toString());

//            channel.shutdown();



        }

    }

