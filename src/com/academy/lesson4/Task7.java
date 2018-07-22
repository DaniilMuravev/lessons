package com.academy;
import java.util.regex.Pattern;
public class Task7 {
    public static void main(String[] args) {

        String email1 = "132762862@jdhsemaids45.cdhf";
        String email2 = "dsd#!$#@#%dnsmd.ck";
        String reg = "[a-z0-9_]+[@][a-z0-9]+[.][a-z]{2,4}";

        checkEmailFormat(reg, email1);
        checkEmailFormat(reg, email2);

    }

    public static void checkEmailFormat(String regexp, String email){

        boolean result = Pattern.matches(regexp, email);

        if(result == true){
            System.out.println("Email address format is correct");
        }
        else{
            System.out.println("Email address format is incorrect");
        }

    }
}
