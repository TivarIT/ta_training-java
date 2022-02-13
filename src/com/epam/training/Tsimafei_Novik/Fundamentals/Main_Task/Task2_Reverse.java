package com.epam.training.Tsimafei_Novik.Fundamentals.Main_Task;
import java.util.Scanner;

public class Task2_Reverse {
    //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void main(String[] args) {
        /*Если под "аргументами" понимается значения в параметре args, то Arg1 Arg2 Arg3 это наши аргументы функции main
        for(int i = args.length - 1; i >= 0; i--)
            System.out.print(args[i] + " "); //Arg3 Arg2 Arg1
         */
        //Но если имелось ввиду просто ввод данных с клавиатуры, то так
        Scanner in = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String input = in.nextLine();
        StringBuffer buffer = new StringBuffer(input);
        buffer.reverse();
        System.out.print("В обратном порядке: ");
        System.out.print(buffer);
    }
}
