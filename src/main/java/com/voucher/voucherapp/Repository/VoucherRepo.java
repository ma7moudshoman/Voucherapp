package com.voucher.voucherapp.Repository;

import com.voucher.voucherapp.model.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherRepo extends JpaRepository<Voucher ,Integer> {
Voucher findByCode(String code);


}
