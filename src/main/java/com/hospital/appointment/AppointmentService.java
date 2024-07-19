package com.hospital.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment createAppointment(Appointment appointment) {
        // Burada appointment oluşturma işlemleri yapılır
        return appointment; // veya başka bir dönüş değeri
    }
    // CRUD işlemleri
}
