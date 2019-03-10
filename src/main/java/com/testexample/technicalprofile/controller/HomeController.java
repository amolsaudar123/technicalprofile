package com.testexample.technicalprofile.controller;

import com.testexample.technicalprofile.MailAPI.MailSenderService;
import com.testexample.technicalprofile.MailAPI.SimpleMailModel;
import com.testexample.technicalprofile.model.MailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.MessagingException;

@Controller
public class HomeController {

    @Autowired
    private MailSenderService senderService;
    @RequestMapping("/")
    public String getInitialHomePage(Model model){
        model.addAttribute("sendmail", new MailDetails());
        return "index";
    }

    @RequestMapping("/sendMail")
    public String sendingMail(Model model, MailDetails mailDetails) throws MessagingException {
        if(mailDetails!=null) {
            model.addAttribute("sendmail", new MailDetails());
            senderService.sendSimpleMail(mailDetails, new SimpleMailModel("amolsaudar@gmail.com"));
            return "index";
        }
        return "error";
    }




}
