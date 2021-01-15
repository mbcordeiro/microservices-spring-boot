package com.matheuscordeiro.hrpayroll.services;

import com.matheuscordeiro.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days) {
        return new Payment("Karina", 200.0, days);
    }
}
