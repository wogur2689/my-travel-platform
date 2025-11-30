package com.travel.wogur2689.admin.cmn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        //공개 페이지
                        .requestMatchers("/pub/**", "/", "/css/**", "/js/**", "/images/**").permitAll()
                        //로그인 필요
                        .requestMatchers("/pri/**").authenticated()
                        //기타 요청은 기본 거부
                        .anyRequest().denyAll()
                )
                .formLogin(form -> form
                        .loginPage("/pub/login")       // 로그인 페이지
                        .loginProcessingUrl("/pub/loginProc")
                        .defaultSuccessUrl("/pub/home", true)
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/app/logout")
                        .logoutSuccessUrl("/app/login?logout")
                );

        return http.build();
    }
}