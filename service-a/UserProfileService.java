// UserProfileService.java
@RestController
@RequestMapping("/user")
public class UserProfileService {

    @GetMapping("/{userId}")
    public ResponseEntity<UserProfile> getUserProfile(@PathVariable String userId) {
        UserProfile profile = new UserProfile(userId, "John Doe", "john.doe@example.com");
        return ResponseEntity.ok(profile);
    }
}
