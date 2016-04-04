package com.email.domain;
import java.util.*;

/**
 * Created by student on 2016/04/04.
 */
public abstract class Email {
    Email nextEmail;
    String address;
    String description;
    ArrayList<MailEntry> entries;
    Date recent;

    public Email() {
    }

    public Date getRecent(){
        return recent;
    }

    public void setRecent(Date recent){
        this.recent = recent;
    }


    public void setNextEmail(Email nextEmail){
        this.nextEmail = nextEmail;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<MailEntry> getEntries() {
        return entries;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEntries(ArrayList<MailEntry> entries) {
        this.entries = entries;
    }

    public int getEmailNumber(Email mail){
        return mail.getEntries().size();
    }

    public void printList(Email mail){
        for(MailEntry entry: mail.getEntries()){
            System.out.println(entry.getTitle() + '\n');
        }
    }

    public abstract void showEmailDetails();

    public abstract String handleRequest(String request);

    private Email(Builder builder) {
        this.address = builder.address;
        this.description = builder.description;
    }

    public static class Builder{
        private String address;
        private String description;

        public Builder address(String value){
            this.address = value;
            return this;
        }

        public Builder description(String value){
            this.description = value;
            return this;
        }

        public Builder copy(Email value) {
            this.address = value.address;
            this.description = value.description;
            return this;
        }

        public Email build() {
            return new Email(this) {
                @Override
                public void showEmailDetails() {

                }

                @Override
                public String handleRequest(String request) {
                    return null;
                }
            };
        }
    }

}
