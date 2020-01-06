package com.github.binodsh;

import io.grpc.stub.StreamObserver;

public class HelloWorldImpl extends HelloGrpc.HelloImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println("saying hello......");
        HelloResponse helloResponse = HelloResponse.newBuilder().setMessage("hello " + request.getName()).build();

        responseObserver.onNext(helloResponse);
        responseObserver.onCompleted();
    }

}
