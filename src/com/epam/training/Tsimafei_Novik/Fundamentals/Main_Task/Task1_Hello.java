package com.epam.training.Tsimafei_Novik.Fundamentals.Main_Task;
import java.util.Scanner;

public class Task1_Hello {
    //1. Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Приветствую, " + name + "!");
    }
}
