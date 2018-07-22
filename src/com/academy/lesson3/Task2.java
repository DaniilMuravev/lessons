package com.academy;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку текста:");
        str = in.nextLine();
        System.out.println(str);
        String prefix = "d";
        int count = 0;
        int currentIndex = 0;
        while (currentIndex < str.length()
                && (currentIndex = (str.indexOf(prefix, currentIndex) + 1)) != 0)
            count++;
        if (str.startsWith(prefix.trim()))
            count++;
        System.out.println(count-1);
        String[] words = str.split(" ");
        int i;
        for (i = 0; i < words.length; ++i)
            if (words[i].endsWith("d"))
                System.out.println(words[i]);
    }
}