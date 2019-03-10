package com.testexample.technicalprofile.MailAPI;

import com.testexample.technicalprofile.model.MailDetails;

public class SimpleMailModel {
    private final String to;

    public SimpleMailModel(String to) {
        this.to = to;
    }

    public String getTo() {
        return this.to;
    }

    public String getSubject() {
        return "Technical Profile Mail Sender";
    }

    public String getContent(MailDetails mailDetails) {
        String content=mailDetails.getMessage();
        String senderMailId=mailDetails.getSenderEmail();
        String senderName=mailDetails.getSenderEmail();
        return "\n Name : "+senderName+"\n Mail Id : "+senderMailId+"\n Message: "+content;
    }
}
