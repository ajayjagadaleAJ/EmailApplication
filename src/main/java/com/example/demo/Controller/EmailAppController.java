package com.example.demo.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.Email;
import com.example.demo.Service.EmailService;
@Controller
public class EmailAppController {

  @Autowired
  private EmailService emailService;
  @GetMapping("/")
  public String index()
  {
	  return"index";
  }
  

	@PostMapping("/sendMail")
	public String sendMail(@ModelAttribute Email email,HttpSession session)
	{
		emailService.sendMail(email);
		System.out.println(email);
		session.setAttribute("msg", "Email Send Successfully!!");
		return"redirect:/";
	
		
	}
}
