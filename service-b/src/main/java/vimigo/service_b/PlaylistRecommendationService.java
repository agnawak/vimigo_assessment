package vimigo.service_b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommendations")
public class PlaylistRecommendationService {

    @GetMapping("/{userId}")
    public String getRecommendations(@PathVariable String userId) {
        // Simulate recommendation logic
        return "Recommended playlist for user " + userId;
    }
}
