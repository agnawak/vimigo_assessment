// SubscriptionService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/{userId}")
    public ResponseEntity<String> subscribe(@PathVariable String userId) {
        // Simulate subscription logic
        return ResponseEntity.ok("Subscribed user " + userId);
    }

    @KafkaListener(topics = "user-profile-updates", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
        // Handle profile update
    }
}
