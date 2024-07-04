// PlaylistRecommendationService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommendations")
public class PlaylistRecommendationService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/{userId}")
    public ResponseEntity<String> getRecommendations(
        @PathVariable String userId
    ) {
        // Simulate recommendation logic
        return ResponseEntity.ok("Recommended playlist for user " + userId);
    }

    @KafkaListener(topics = "user-profile-updates", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
        // Handle profile update
    }
}
