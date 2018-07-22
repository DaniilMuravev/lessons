package com.academy;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку текста:");
        str = in.nextLine();
        String outText = "";
        String[] array = str.split("");
        for (int i = array.length - 1; i >= 0; i--) {
            outText += array[i] + " ";
        }
        System.out.println(str);
        System.out.println(outText);


    }
}
