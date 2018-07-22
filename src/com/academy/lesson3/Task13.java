package com.academy;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку текста:");
        str = in.nextLine();
        String[] words = str.split(" ");
        System.out.println(str);
        System.out.println("Слова содержащие знак '@': ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("@")) {
                System.out.print(words[i] + " ");
            }
        }
    }
}
