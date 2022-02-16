package com.klef.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.klef.demo.Payment;
import com.klef.demo.PaymentService;

@Controller
public class PaymentController {

  @Autowired
  private PaymentService paymentService;
  
  
  @GetMapping("/check")
  public String showpayform(Model model) {
    // create model attribute to bind form data
    Payment payment = new Payment();
    model.addAttribute("payment", payment);
    return "check";
  }
  
  @PostMapping("/savepayment")
  public String savepay(@ModelAttribute("payment") Payment payment) {
    // save employee to database
    paymentService.savepay(payment);
    return "redirect:thanks";
  }
  
}