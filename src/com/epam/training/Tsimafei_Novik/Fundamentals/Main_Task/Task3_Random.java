package com.epam.training.Tsimafei_Novik.Fundamentals.Main_Task;
import java.util.Scanner;

public class Task3_Random {
    //3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во случайных чисел: ");
        int count = in.nextInt();
        System.out.println("Выберите способ");
        System.out.println("1. С переходом на новую строку");
        System.out.println("2. Без перехода на новую строку");
        int answer = in.nextInt();
        switch (answer) {
            case 1:
            for (int i = 0; i < count; i++) {
                int rand = (int) (Math.random() * 10);
                System.out.println(rand + " ");
            } break;
            case 2:
            for (int i = 0; i < count; i++) {
                int rand = (int) (Math.random() * 10);
                System.out.print(rand + " ");
            } break;
            default:
                System.out.println("Incorrect value! Type '1' or '2'.");
        }
    }
}

