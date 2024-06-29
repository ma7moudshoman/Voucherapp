package com.voucher.voucherapp.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "voucher")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   private   String code;
    private BigDecimal discount;
    private  String ExpireDate;

    public Voucher() {
    }

    public Voucher(int id, String code, BigDecimal discount, String expireDate) {
        this.id = id;
        this.code = code;
        this.discount = discount;
        ExpireDate = expireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getExpireDate() {
        return ExpireDate;
    }

    public void setExpireDate(String expireDate) {
        ExpireDate = expireDate;
    }
}
