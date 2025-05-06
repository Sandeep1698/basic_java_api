package com.deere.mp.config;

//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//@Configuration
//@EnableWebMvc
//public class SecurityConfig {
//
//    public static final String[] PUBLIC_URLS = {
//            "/v3/api-docs",
//            "/v2/api-docs",
//            "/swagger-resources/**",
//            "/swagger-ui/**",
//            "/webjars/**"};
//
//    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
//        http
//                .csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers(PUBLIC_URLS).permitAll()
//                        .requestMatchers(HttpMethod.GET, "/**").permitAll()
//                        .anyRequest().authenticated()
//                );
//
//        return http.build();
//    }
//}