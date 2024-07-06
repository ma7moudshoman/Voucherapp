package com.voucher.voucherapp.Controller;


import com.voucher.voucherapp.Repository.VoucherRepo;
import com.voucher.voucherapp.model.Voucher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
//  GET http://localhost:3030/voucherApi
@RequestMapping("/voucherApi")
public class VoucherController {

    @Autowired
    VoucherRepo voucherRepo;


    //  GET http://localhost:3030/showCreateVoucher
    @PostMapping("/showCreateVoucher")
public String creatVoucher(){
    return "CreateVoucher";
}

@PostMapping("/saveVoucher")
public String save(@RequestBody Voucher voucher){
        voucherRepo.save(voucher);
        return "GetVoucher";
}

@GetMapping("/showGetVoucher")
public String  showGetVoucher(){
        return "GetVoucher";
}

@PostMapping("/getVoucher")
public ModelAndView getVoucher(String code){
        ModelAndView mav=new ModelAndView("VoucherDetails");
    System.out.println(code);
    mav.addObject(voucherRepo.findByCode(code));
    return mav;
}






}
