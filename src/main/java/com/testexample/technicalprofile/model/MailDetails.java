package com.testexample.technicalprofile.model;

public class MailDetails {
    String senderName;
    String senderEmail;
    String message;

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MailDetails{" +
                "senderName='" + senderName + '\'' +
                ", senderEmail='" + senderEmail + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
