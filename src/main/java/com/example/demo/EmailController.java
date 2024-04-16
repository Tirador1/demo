package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/home")
public class EmailController {
  @Autowired
  private EmailService emailService;

  @GetMapping("/emails")
  public List<EmailModel> getAllEmails() {
    return emailService.getAllEmails();
  }

  @GetMapping("/emails/{id}")
  public EmailModel getEmailById(@PathVariable int id) {
    return emailService.getEmailById(id);
  }

  @PostMapping("/emails")
  public void createEmail(@RequestBody EmailModel email) {
      emailService.createEmail(email);
  }

  @PutMapping("/emails/{senderId}/transfer/{receiverId}")
  public boolean transferAmmount(@PathVariable int senderId, @PathVariable int receiverId, @RequestParam  int ammount) {
    return emailService.transferAmmount(senderId, receiverId, ammount);
  }
}
