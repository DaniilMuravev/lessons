package lesson2dzdemo;

public class ArrDemo6 {
    public static void main(String[] args) {

        int n =8;
        //узнаем самое большое n-циферное число так,
        //что возведем в n-ую степень 10 и отнимем 1.
        long number = (long) Math.pow(10, n) - 1;

        for (long j = number; j > 0; j--) { //цикл начинаем от самого большого n-циферного числа
            long res = number * j; //переумножаем самое большое n-цифреное и пришедшее число в цикле
            int l = String.valueOf(res).length(); //берем длину числа, которое получили в результате умножения
            String strnumber = String.valueOf(res); //int переводим в String
            int k = 0, count = 0;
            for (; k < l / 2; k++) //стандартный цикл для палиндромов
                if (strnumber.charAt(k) == strnumber.charAt(l - k - 1))
                    count++; //сравниваем первые и поселедний знак в числе,
            //второе и предпоследний и т.д.
            //count - обычный счетчик. Узнаем, сколько пар в числе между собой равны.
            if (count == k) {
                System.out.println(Long.parseLong(strnumber));  //если count равен количеству элементов, которое сравнивали
                break;
            }
        }

    }

}