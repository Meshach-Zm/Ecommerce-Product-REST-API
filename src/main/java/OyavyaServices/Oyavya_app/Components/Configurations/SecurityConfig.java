package OyavyaServices.Oyavya_app.Components.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                            http
                                .csrf().disable()
                                .authorizeRequests((authorizeRequests) -> authorizeRequests
                                                .antMatchers("http://localhost:8080/api/admin").hasRole("ADMIN")
                                                .antMatchers("https://web.postman.co/workspace/62e2f30d-fa2d-4a62-83c6-90ed95d9f590/request/create?requestId=8293901b-1604-4d15-bc3c-2b388fa79901")
                                                .hasRole("USER"));

                return http.build();
        }
}
