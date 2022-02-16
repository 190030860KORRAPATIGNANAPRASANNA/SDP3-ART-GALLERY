package com.klef.demo;

import java.util.List;

import org.springframework.data.domain.Page;

import com.klef.demo.Payment;

public interface PaymentService {
  void savepay(Payment payment);
  
}