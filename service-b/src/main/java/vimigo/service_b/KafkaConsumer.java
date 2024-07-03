package vimigo.service_b;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "user-profile-updates", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
        // Handle profile update
    }
}
