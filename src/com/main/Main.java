package com.main;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число которое хотите конвертировать ");
        int a = in.nextInt();
        int b;
        String c = "";
        while(a != 0){
            b = a % 2;
            c = b + c;
            a /= 2;
        }
        System.out.println("Вот ваше число " + c);


    }
}
