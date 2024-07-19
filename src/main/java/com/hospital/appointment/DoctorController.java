package com.hospital.appointment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {

    @GetMapping("/doctor/home")
    public String doctorHome() {
        return "doctorHome";
    }
}
