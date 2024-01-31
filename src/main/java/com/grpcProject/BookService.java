package com.grpcProject;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class BookService extends BookServiceGrpc.BookServiceImplBase{
    @Override
    public void getBook(BookRequest request, StreamObserver<BookResponse> responseObserver) {
        // We have mocked the employee data.
        // In real world this should be fetched from database or from some other source
        BookResponse empResp = BookResponse.newBuilder().setBookId(request.getBookId()).setName("santoh")
                .setType(Type.AUTOBIOGRAPHY).build();

        // set the response object
        responseObserver.onNext(empResp);
        System.out.println(empResp);
        // mark process is completed
        responseObserver.onCompleted();
    }
}



