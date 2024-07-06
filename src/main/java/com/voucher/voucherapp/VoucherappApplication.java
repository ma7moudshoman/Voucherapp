package com.voucher.voucherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.voucher.voucherapp.Repository")

public class VoucherappApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoucherappApplication.class, args);
    }

}
