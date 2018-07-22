package com.academy;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Task2 {
    public static void main(String[] args) {

        String reg = "\\d+[.,]?\\d{1,2}[($|(грн)|(руб))]";

        testCurrencyFormat(reg);
    }

    public static void testCurrencyFormat(String regexFormat){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currency value: ");
        String str = scanner.next();

        boolean result = Pattern.matches(regexFormat, str);

        if(result == true){
            System.out.println("Currency format is correct");
        }
        else{
            System.out.println("Currency format is incorrect");
        }

    }
}
