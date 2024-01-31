package com.grpcProject;

import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.channel.ChannelOption;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Configuration
public class BookConfig{

    @Bean
    public ManagedChannel getPlainTextGrpcNettyChannel() {
        return getNettyChannelBuilder()
                .usePlaintext()
                .build();
    }


    @Bean
    public NettyChannelBuilder getNettyChannelBuilder() {
        return NettyChannelBuilder
                .forAddress("localhost", 9090)
                .withOption(ChannelOption.CONNECT_TIMEOUT_MILLIS,
                        (int) TimeUnit.SECONDS.toMillis(1));
    }
}
