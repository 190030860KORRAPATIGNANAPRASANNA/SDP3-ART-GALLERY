package com.klef.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AppController {
   
  @Autowired
  private UserService service;
  
    
  @GetMapping("")
  public String viewHomePage()
  {
    return "index";
  }

  @GetMapping("/register")
  public String showRegistrationForm(Model model) {
      model.addAttribute("user", new User());
       
      return "signup_form";
  }
  
  @PostMapping("/process_register")
  public String processRegister(User user) {
      service.saveUserWithDefaultRole(user);
      return "login";
  }
  
  @GetMapping("/list_users")
  public String listUsers(Model model) {
      List<User> listUsers = service.listAll();
      model.addAttribute("listUsers", listUsers);
      return "users";
  }
  
  
  @GetMapping("/register_success")
  public String loginsu(Model model)
  {
    return "register_success";
  }
  
  @GetMapping("/users/edit/{id}")
  public String editUser(@PathVariable("id") Long id, Model model)
  { 
    User user=service.get(id);
    List<Role> listRoles = service.getRoles();
    model.addAttribute("user", user);
    model.addAttribute("listRoles", listRoles);
    return "user_form";
  }
  
  @PostMapping("/users/save")
  public String saveUser(User user)
  {
    service.save(user);
    
    return "redirect:/list_users";
  }
  
  @GetMapping("/admin")
  public String openadminhome(User user)
  {
    return "redirect:/";
  }
  
  @GetMapping("/login")
  public String showLoginPage()
  {
    Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
    if(authentication == null || authentication instanceof AnonymousAuthenticationToken)
    {
      return "login";
    }
    else
    {
      return "redirect:/";
    }
  }
  
  @PostMapping("/login")
  public String afterlogin()
  {
    return "home";
  }
  
  @GetMapping("/home")
  public String afterhome() {
	  return "home";
  }
  
  @GetMapping("/logout")
  public String logout() {
	  return "index";
  }
  @GetMapping("/about")
  public String about() {
	  return "about";
  }
  @GetMapping("/service")                     
  public String service() {
      return "service";           
  }
  @GetMapping("/blog")                     
  public String blog() {
      return "blog";           
  }
  @GetMapping("/blog-details")                     
  public String blogdetails() {
      return "blog-details";           
  }
  @GetMapping("/contact")                     
  public String contact() {
      return "contact";           
  }
  @GetMapping("/mod")                     
	  public String mod() {
	      return "mod";           
	  }
  @GetMapping("/index1")                     
  public String index1() {
      return "index1";           
  }
  @GetMapping("/index2")                     
  public String index2() {
      return "index2";           
  }
  @GetMapping("/index3")                     
  public String index3() {
      return "index3";           
  }
  @GetMapping("/index4")                     
  public String index4() {
      return "index4";           
  }
  @GetMapping("/index5")                     
  public String index5() {
      return "index5";           
  }
  @GetMapping("/index6")                     
  public String index6() {
      return "index6";           
  }
  @GetMapping("/nature")                     
  public String nature() {
      return "nature";           
  }
  @GetMapping("/index13")                     
  public String index13() {
      return "index13";           
  }
  @GetMapping("/index14")                     
  public String index14() {
      return "index14";           
  }
  @GetMapping("/index15")                     
  public String index15() {
      return "index15";           
  }
  @GetMapping("/index16")                     
  public String index16() {
      return "index16";           
  }
  @GetMapping("/index17")                     
  public String index17() {
      return "index17";           
  }
  @GetMapping("/index18")                     
  public String index18() {
      return "index18";           
  }
  @GetMapping("/his")                     
  public String his() {
      return "his";           
  }
  @GetMapping("/index7")                     
  public String index7() {
      return "index7";           
  }
  @GetMapping("/index8")                     
  public String index8() {
      return "index8";           
  }
  @GetMapping("/index9")                     
  public String index9() {
      return "index9";           
  }
  @GetMapping("/index10")                     
  public String index10() {
      return "index10";           
  }
  @GetMapping("/index11")                     
  public String index11() {
      return "index11";           
  }
  @GetMapping("/index12")                     
  public String index12() {
      return "index12";           
  }
  @GetMapping("/viediomain")                     
  public String viediomain() {
      return "viediomain";           
  }
  @GetMapping("/viecard")                     
  public String viecard() {
      return "viecard";           
  }
  @GetMapping("/vie1")                     
  public String vie1() {
      return "vie1";           
  }
  @GetMapping("/vie2")                     
  public String vie2() {
      return "vie2";           
  }
  @GetMapping("/vie3")                     
  public String vie3() {
      return "vie3";           
  }
  @GetMapping("/vie4")                     
  public String vie4() {
      return "vie4";           
  }
  @GetMapping("/thanks")                     
  public String thanks() {
      return "thanks";           
  }
	
	
  

}