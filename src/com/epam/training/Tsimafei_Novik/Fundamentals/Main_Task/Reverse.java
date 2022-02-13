package com.epam.training.Tsimafei_Novik.Fundamentals.Main_Task;
import java.util.Scanner;

public class Reverse {
    //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void main(String[] args) {
        //Аргументами выступают Arg1 Arg2 Arg3
        for(int i = args.length - 1; i >= 0; i--)
            System.out.print(args[i] + " "); //Arg3 Arg2 Arg1
    }
}
