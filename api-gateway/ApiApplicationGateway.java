// ApiGatewayApplication.java
@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("user_profile_route", r -> r.path("/user/**")
                .uri("http://service-a:8081"))
            .build();
    }
}
