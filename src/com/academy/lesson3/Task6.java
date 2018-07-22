package com.academy;
import java.util.Scanner;
public class Task6 {
    public static boolean isVowel(char c) // функция для проверки на гласность букв
    {
        c = Character.toLowerCase(c); // переводим в нижний регистр символ
        String vowels = "aeiouyаеёиоуэюяы"; //массив гласных
        for (char d : vowels.toCharArray())// идем по массиву гласных и сравниваем с элементом
        {
            if (c == d)// если гласня равна символу который проверяем возвращаем true
                return true;
        }
        return false;//если нет то false
    }
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку текста:");
        str = in.nextLine();
        StringBuilder sb = new StringBuilder();
        String vowelStr="";
        for (char ch : str.toCharArray()) {

                if (!isVowel(ch)) { // вызываем нашу функцb. и проверяем если буква не гласная то добавляем ее в строку sb
                    sb.append(ch);
                } else {// если гласная то  добавляем в строку vowelStr
                    vowelStr += ch;
                }

        }
        System.out.println(str);
        System.out.println("Result: " + sb.toString());
        System.out.println(vowelStr);

    }


}
