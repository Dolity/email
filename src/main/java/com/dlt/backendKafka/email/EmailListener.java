package com.dlt.backendKafka.email;

import com.dlt.backendKafka.common.EmailRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class EmailListener {

    @KafkaListener(topics = "activation-email")
    public void listenForActivationEmail(EmailRequest request) {
        log.info("Kafka received: "+ request.getTo());
        log.info(request.getContent());
    }
}
