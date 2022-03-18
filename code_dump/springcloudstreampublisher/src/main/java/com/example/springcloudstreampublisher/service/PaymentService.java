package com.example.springcloudstreampublisher.service;

import com.example.springcloudstreampublisher.messageChannel.ControllerChannels;
import com.example.springcloudstreampublisher.messageChannel.ServiceChannels;
import com.example.springcloudstreampublisher.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@EnableBinding({ServiceChannels.class})
@Service
public class PaymentService {

    @Autowired
    @Qualifier("serviceoutput")
    private MessageChannel payments;

    @StreamListener("serviceinput")
    public void handleorders(Employee emp){
        //listening request
        System.out.println("[Service] Received message(request)");

        //processing
        System.out.println("Process salary raise request...");
        emp.setSalary(emp.getSalary() + 2);
        //sending response
        System.out.println("[Service] Sending message(response)");
        payments.send(MessageBuilder.withPayload(emp).build());

    }
}
