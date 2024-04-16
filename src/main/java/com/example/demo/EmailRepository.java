package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class EmailRepository {
  List<EmailModel> listEmails = new ArrayList<EmailModel>(
    Arrays.asList(
      new EmailModel(1, 100),
      new EmailModel(2, 200),
      new EmailModel(3, 300)
    )
  );

  public List<EmailModel> getAllEmails() {
    return listEmails;
  }

  public EmailModel getEmailById(int id) {
    return listEmails.stream().filter(email -> email.getId() == id).findFirst().orElse(null);
  }

  public void createEmail (EmailModel email) {
    if(getEmailById(email.getId()) == null){
      int indexlength = String.valueOf(email.getId()).length();
      if(indexlength > 8 && indexlength < 18 && email.getAmmount() > 0){
        listEmails.add(email);
        return ;
      } else {
        return ;
      }
    } else {
      return;
    }

  }

  public boolean transferAmmount(int senderId, int receiverId, int ammount) {
    EmailModel sender = getEmailById(senderId);
    EmailModel receiver = getEmailById(receiverId);
    if(sender != null && receiver != null && sender.getAmmount() >= ammount){
      sender.setAmmount(sender.getAmmount() - ammount);
      receiver.setAmmount(receiver.getAmmount() + ammount);
      return true;
    } else {
      return false;
    }
  }
}
