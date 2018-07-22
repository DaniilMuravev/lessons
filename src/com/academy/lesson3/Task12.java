package com.academy;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//создаем сканнер для чтения из консоли
        System.out.println("Колличество строк");
        int sizex = scan.nextInt();// читаем из консоли количество строк нашего массива
        System.out.println("Колличество столбцов");
        int sizey = scan.nextInt();//читаем из консоли количество столбцов нашего массива
        double[][] arr = new double[sizex][sizey];// создаем массив с введенными количествами строк и столбцов
        for (int i = 0; i < sizex; i++) {
            for (int j = 0; j < sizey; j++) {//два цикла для прохода по каждому элементу массива
                System.out.println("Введите элемент массива [" + i + "]" + "[" + j + "]");
                arr[i][j] = scan.nextDouble();//читаем из консоли и записываем элемент в массив
                double elem = arr[i][j] * 100;//cоздаем переменную в elem записываем в нее элемент массива умноженный на 100 это понадобиться позже
                double remaid = elem % 1;// создаем переменную и записывыем в нее остаток от деления элемента массива умноженного на 100
                if (remaid != 0) {// если остаток от деление на 1 не равен 0 то у нас больше 2 знаков после запятой и мы выбрасываем предупреждение
                    System.out.println("Внимание! Число не должно иметь более 2-х знаков после запятой ");
                    if (remaid >= 0.5) { // если остаток от деления больше 0.5 то округляем в большую сторону
                        elem = (int) elem;  // отбрасывем знаки после запятой принудительно приводя к типу int
                        arr[i][j] += 1; // добавляем 1 так как округляем в большую сторону

                    } else {// если остаток от деление меньше 0.5 то в меньшую сторону
                        elem = (int) elem; // просто приводим к типу int отбрасывая все знаки после запятой

                    }
                }
                if (elem > 99999) { // если элемент массива умноженный на 100 больше 99999 значить он имеет больше 3х разрядов выводим ошибку
                    System.out.println("Ошибка! Число должно иметь не больше 3-х разрядов");
                    return;// завершаем выполнение программы
                }
                arr[i][j] = elem / 100; // не забываем в конце округленный элемент разделить на 100 чтобы он не изменился
            }
        }
        for (int i = 0; i < sizex; i++) {
            System.out.print("|");
            for (int j = 0; j < sizey; j++) { // опять же двойной цикла для прохода по элементам массива
                System.out.print(" " + arr[i][j]); // выводим элементы
            }
            System.out.print(" |");
            System.out.println(); // переход на новую строку
        }
        Minimal(arr,sizex,sizey);//Вызов используемых функций
        Maximum(arr,sizex, sizey);
        MaxSumLine(arr,sizex, sizey);
        MinSumLine(arr, sizex,sizey);

    }
    public static void Minimal(double [][] arr, int sizex, int sizey){
        double min = 999999;
        for (int i = 0; i <sizex ; i++) {
            for (int j = 0; j < sizey; j++) {
                if(arr[i][j]<min){
                    min =arr[i][j];
                }
            }
        }
        System.out.println("Минимальный элемент "+ min);
    }
    public static void Maximum(double [][] arr, int sizex, int sizey){
        double max = -999999;
        for (int i = 0; i <sizex ; i++) {
            for (int j = 0; j < sizey; j++) {
                if(arr[i][j]>max){
                    max =arr[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент "+ max);
    }
    public static double sum( double [] [] arr, int sizey, int num){
        double sum =0;
        for (int i = 0; i <sizey ; i++) {
            sum+=arr[num][i];
        }
        return sum;
    }
    public static void MaxSumLine(double [][] arr, int sizex, int sizey){
        double max = -999999;
        int numLine =0;
        for (int i = 0; i <sizex ; i++) {
            double summa = sum(arr,sizey,i);
           if( summa> max){
               max = summa;
               numLine=i;
           }
        }
        System.out.println("Номер строки в которой сумма максимальна равен "+(numLine+1));
    }
    public static void MinSumLine(double [][] arr, int sizex, int sizey){
        double min = 999999;
        int numLine =0;
        for (int i = 0; i <sizex ; i++) {
            double summa = sum(arr,sizey,i);
            if( summa< min){
                min = summa;
                numLine=i;
            }
        }
        System.out.println("Номер строки в которой сумма минимальна равен "+(numLine+1));
    }

}
