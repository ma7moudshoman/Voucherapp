package com.voucher.voucherapp.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;






@Configuration
public class WebSecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http.httpBasic();
        http.authorizeHttpRequests()
                .requestMatchers(HttpMethod.GET, "/voucherApi/vouchers/**", "/", "/showGetVoucher", "/getVoucher")
                .hasAnyRole("USER", "ADMIN")
                .requestMatchers(HttpMethod.GET, "/createVoucher", "/createResponse")
                .hasRole("ADMIN")
                .requestMatchers(HttpMethod.POST, "/voucherApi/vouchers", "/saveVoucher")
                .hasRole("ADMIN")
                .requestMatchers(HttpMethod.POST, "/getVoucher")
                .hasAnyRole("USER", "ADMIN")
                .and()
                .csrf().disable();
        return http.build();

    }
}
