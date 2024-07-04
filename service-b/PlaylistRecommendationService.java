// PlaylistRecommendationService.java
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
