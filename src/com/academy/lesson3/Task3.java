package com.academy;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку текста:");
        str = in.nextLine();
        System.out.println(str);
        String substr = str.substring(0,4);
        System.out.println(substr);
        int count = 0;
        int currentIndex = 0;
        while (currentIndex < str.length()
                && (currentIndex = (str.indexOf(substr, currentIndex) + 1)) != 0)
            count++;
        if (str.startsWith(str.trim()))
            count++;
        System.out.println(count-1);
    }
}
