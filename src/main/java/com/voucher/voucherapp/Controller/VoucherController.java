package com.voucher.voucherapp.Controller;


import com.voucher.voucherapp.Repository.VoucherRepo;
import com.voucher.voucherapp.model.Voucher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voucherApi")
public class VoucherController {

    @Autowired
    VoucherRepo voucherRepo;

    @PostMapping("/vouchers")
public Voucher creat(@RequestBody Voucher voucher){
    return voucherRepo.save(voucher);
}

@GetMapping("/vouchers/{code}")
public Voucher getvoucher(@PathVariable ("code") String code){
        return voucherRepo.findByCode(code);
}

}
