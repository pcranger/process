package com.example.springcloudstreampublisher.messageChannel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ControllerChannels {
    //queue creation

    @Output
    MessageChannel orders();

    @Input
    SubscribableChannel payments();



}
