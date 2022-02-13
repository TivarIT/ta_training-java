package com.epam.training.Tsimafei_Novik.Fundamentals.Main_Task;
import java.util.Scanner;

public class Task4_Sum {
    public static void main(String[] args) {
        //4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = in.nextInt();
        System.out.print("Введите y: ");
        int y = in.nextInt();
        System.out.println("1. Узнать сумму x и y");
        System.out.println("2. Узнать произведение x и y");
        int answer = in.nextInt();
        switch (answer) {
            case 1: System.out.println("Ответ = " + (x + y));
                 break;
            case 2: System.out.println("Ответ = " + (x * y));
                 break;
            default:
                System.out.println("Incorrect value! Type '1' or '2'.");
        }
    }
}

