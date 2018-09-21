package com.main;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число которое хотите конвертировать ");
        int a = in.nextInt();
        int b;
        String c = "";
        if(a >= -128 && a <= 127) {
            System.out.println("Ваше число относится к типу данных byte" );
        }
        if(a >= -32768 && a <= 32767)  {
            System.out.println("Ваше число относится к типу данных short" );
        }
        if(a >= -2147483648 && a <= 2147483647) {
            System.out.println("Ваше число относится к типу данных int" );
        }
        if(a >= -1.4e-45f && a <= 3.4e+38f) {
            System.out.println("Ваше число относится к типу данных long" );
        }
        if(a >= -4.9e-324 && a <= 1.7e+308) {
            System.out.println("Ваше число относится к типу данных double" );
        }
        else System.out.println("Ваше число не число, а символ)))" );
        while(a != 0){
            b = a % 2;
            c = b + c;
            a /= 2;
        }
        System.out.println("Вот ваше число " + c);

    }
}
