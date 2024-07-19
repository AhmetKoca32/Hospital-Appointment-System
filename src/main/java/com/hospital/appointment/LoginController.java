package com.hospital.appointment;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Set;

@Controller
public class LoginController {

    @GetMapping("/default")
    public String defaultAfterLogin(Authentication authentication) {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        if (roles.contains("ROLE_ADMIN")) {
            return "redirect:/admin/home";
        } else if (roles.contains("ROLE_DOCTOR")) {
            return "redirect:/doctor/home";
        } else if (roles.contains("ROLE_PATIENT")) {
            return "redirect:/patient/home";
        }
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login() {
        return "login";  // templates/login.html dosyasını döndürür
    }
}
