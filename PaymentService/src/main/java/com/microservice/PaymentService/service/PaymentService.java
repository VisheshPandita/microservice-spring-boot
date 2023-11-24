package com.microservice.PaymentService.service;

import com.microservice.PaymentService.model.PaymentRequest;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);
}
