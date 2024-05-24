package com.example.projectZarna;

public class HelperClass {
    String emails;
    String passwords;

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public HelperClass(String emails, String passwords) {
        this.emails = emails;
        this.passwords = passwords;
        this.useremail = useremail;
        this.userpassword = userpassword;
    }

    String useremail;
    String userpassword;

}
