package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
  @Autowired
  private EmailRepository emailRepository;

  public List<EmailModel> getAllEmails() {
    return emailRepository.getAllEmails();
  }

  public EmailModel getEmailById(int id) {
    return emailRepository.getEmailById(id);
  }

  public void createEmail(EmailModel email) {
     emailRepository.createEmail(email);
  }

  public boolean transferAmmount(int senderId, int receiverId, int ammount) {
    return emailRepository.transferAmmount(senderId, receiverId, ammount);
  }
}
