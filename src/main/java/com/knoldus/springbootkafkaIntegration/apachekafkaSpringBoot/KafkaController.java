package com.knoldus.springbootkafkaIntegration.apachekafkaSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

/**
 * Kafka Integration with SpringBoot
 * Created by IntelliJ IDEA.
 * User: shashikant
 * Date: 23/06/2022
 */
@RestController
public class KafkaController {

    private final Producer producer;

    @Autowired
    public KafkaController(Producer producer) {
        this.producer = producer;
    }
    @PostMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message){

        this.producer.sendMessage(message);


    }
}