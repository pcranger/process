package com.example.springcloudstreampublisher.messageChannel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ServiceChannels {
    //queue creation

    @Output
    MessageChannel payments();

    @Input
    SubscribableChannel orders();



}
