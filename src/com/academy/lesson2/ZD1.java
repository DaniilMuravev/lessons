package lesson2dzdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ZD1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String num1 = in.nextLine();
        String num2 = in.nextLine();
        String num3 = in.nextLine();
        int[] arr = {Integer.parseInt(num1), Integer.parseInt(num2), Integer.parseInt(num3)};
        Arrays.sort(arr);
        int j = arr[2];
        arr[2]=arr[1];
        arr[1] = j;

        for (int i = 0; i <3; i++) {
            System.out.println(arr[i]);

        }
    }
}
