package com.hospital.appointment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {

    @GetMapping("/patient/home")
    public String patientHome() {
        return "patientHome";
    }
}
