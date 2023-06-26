package com.example.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
        @Bean
        public WebSecurityCustomizer webSecurityCustomizer() {
            return (web) -> web.ignoring()
                    // Spring Security should completely ignore URLs starting with /resources/
                    .requestMatchers("/resources/**");
        }


        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .requestMatchers("/hola").permitAll()
                    .requestMatchers("/notes").hasRole("ADMIN")
                    .anyRequest().authenticated()
                    .and()
                    .oauth2Login();
            return http.build();
        }

        //This users are in ram
        @Bean
        public UserDetailsService userDetailsService() {
            UserDetails user = User.builder()
                    .username("user")
                    .password(  passwordEncoder().encode("password")  )
                    .roles("USER")
                    .build();
            UserDetails admin = User.builder()
                    .username("admin")
                    .password(  passwordEncoder().encode("password")  )
                    .roles("ADMIN", "USER")
                    .build();
            return new InMemoryUserDetailsManager(user, admin);
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }


        // Possibly more bean methods ...

}
