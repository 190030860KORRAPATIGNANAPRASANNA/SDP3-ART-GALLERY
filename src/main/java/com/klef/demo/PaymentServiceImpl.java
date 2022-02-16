package com.klef.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.klef.demo.Payment;
import com.klef.demo.PaymentRepository;


@Service
public class PaymentServiceImpl  implements PaymentService {

  @Autowired
  private PaymentRepository paymentRepository;

  

  @Override
  public void savepay(Payment payment) {
    this.paymentRepository.save(payment);
  }

}