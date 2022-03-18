package com.example.springcloudstreampublisher.rest;

import com.example.springcloudstreampublisher.messageChannel.ControllerChannels;
import com.example.springcloudstreampublisher.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
@EnableBinding({ControllerChannels.class})
public class EmployeeController {


    @Autowired
    @Qualifier("controllerinput")
    private MessageChannel orders;

    @PostMapping("/orders")
    public void publishMessagetoMail(@RequestBody Employee emp){
        //sending request
        System.out.println("[Controller] Sending message(request):" + emp);
        orders.send(MessageBuilder.withPayload(emp).build());
    }

    //listening response
    @StreamListener("controlleroutput")
    public void handlepayments(Employee emp){
        System.out.println("[Controller] Received message(response):" + emp);
    }
}
