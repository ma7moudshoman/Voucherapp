package com.voucher.voucherapp.Security;

import com.voucher.voucherapp.Repository.UserRepo;
import com.voucher.voucherapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class USerDetailsServiceVoucher implements UserDetailsService {



    private  UserRepo userRepo;

    @Autowired
    public void UserDetailsServiceVoucher(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepo.findByEmail(username);
        if (user==null){throw
        new UsernameNotFoundException("User Not Found " + username);
    } return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(), user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getRoleName()))
                .collect(Collectors.toList()));}
}
