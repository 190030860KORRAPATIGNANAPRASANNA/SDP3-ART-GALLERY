package com.klef.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.klef.demo.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}

