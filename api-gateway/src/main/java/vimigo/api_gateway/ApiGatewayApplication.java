import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayApplication {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder
            .routes()
            .route(
                "service-a",
                r -> r.path("/service-a/**").uri("http://localhost:8081")
            ) // Replace with actual URL and port of service-a
            .route(
                "service-b",
                r -> r.path("/service-b/**").uri("http://localhost:8082")
            ) // Replace with actual URL and port of service-b
            .route(
                "service-c",
                r -> r.path("/service-c/**").uri("http://localhost:8083")
            ) // Replace with actual URL and port of service-c
            .build();
    }
}
