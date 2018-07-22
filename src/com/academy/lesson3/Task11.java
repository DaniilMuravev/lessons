package com.academy;
import java.util.Scanner;
import java.util.*;
public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int a[] = new int[size];
        Random rand = new Random(); // создаем рандомизатор
        for (int i = 0; i < size; i++) {
            a[i] = rand.nextInt()%100; //заполняем элементы массива случайными числами не больше 100
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + a[i]);
        }
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);

        }
        System.out.println();
        Arrays.sort(a);
        for(int i = 0; i <  a.length; i++) {
            System.out.print(a[i] + "  ");
        }


    }
    }

