package com.academy;
import java.util.Scanner;
import static java.lang.Character.isDigit;
public class Task4 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку текста:");
        str = in.nextLine();
        String dataString = str;
        StringBuilder sb = new StringBuilder();
        String digitStr = "";

        for (char ch : dataString.toCharArray()) {
            if (!isDigit(ch)) {

                sb.append(ch);


            }else{
            digitStr += ch;
            }
        }

        System.out.println(str);
        System.out.println("Result: " + sb.toString());
        System.out.println(digitStr);

    }
}
