package vimigo.service_c;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionService {

    @GetMapping("/{userId}")
    public String getSubscriptionDetails(@PathVariable String userId) {
        // Simulate subscription details retrieval logic
        return "Subscription details for user " + userId;
    }
}
