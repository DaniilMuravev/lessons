package com.academy;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку текста:");
        str = in.nextLine();

        int k = 0, count = 0;
        for (; k < str.length() / 2; k++) //стандартный цикл для палиндромов
            if (str.charAt(k) == str.charAt(str.length() - k - 1))
                count++; //сравниваем первые и поселедний знак в числе,
        //второе и предпоследний и т.д.
        //count - обычный счетчик. Узнаем, сколько пар в числе между собой равны.
        if (count == k) {
            System.out.println("Это полиндром!");
            System.out.println(str);  //если count равен количеству элементов, которое сравнивали

        }else {
            System.out.println("Это не полиндром");
        }
    }
}
