package com.epam.training.Tsimafei_Novik.Classes.Main_Task;
import java.util.Scanner;
/**
 Создать классы, спецификации которых приведены ниже. Определить кон-
 структоры и методы setТип(), getТип(), toString(). Определить дополнительно
 методы в классе, создающем массив объектов. Задать критерий выбора данных
 и вывести эти данные на консоль. В каждом классе, обладающем информацией,
 должно быть объявлено несколько конструкторов.
 Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
 Факультет, Курс, Группа
 **/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student st1 = new Student(1,"Латий", "Денис", "Иванович", "02.05.2004", "Жиновича 7", "375294567312", "Исторический", "2", "201");
        Student st2 = new Student(2,"Барбук", "Кирилл", "Петрович", "20.04.1999", "Матусевича 35", "375442345789", "Психология", "3", "301");
        Student st3 = new Student(3,"Гончар", "Пётр", "Иванович", "11.11.1996", "Голубка 10", "375442345854", "Юридический", "3", "302");
        Student st4 = new Student(4,"Ковалёв", "Иван", "Александрович", "09.10.2000", "Колесникова 8", "375295674312", "Психология", "2", "201");
        Student st5 = new Student(5,"Рожанский", "Никита", "Николаевич", "03.12.2001", "Лещинского 45", "375294563412", "Исторический", "3", "302");
        Student st6 = new Student(6,"Новиков", "Николай", "Дмитриевич", "17.02.1996", "Алеся Гаруна 13", "375293456723", "Юридический", "4", "401");

        StudentsList StList = new StudentsList();
        StList.addStudent(st1);
        StList.addStudent(st2);
        StList.addStudent(st3);
        StList.addStudent(st4);
        StList.addStudent(st5);
        StList.addStudent(st6);

        StList.facultyPrint("Исторический");
        System.out.println("Cписки студентов для каждого факультета и курса");
        StList.facultyCoursePrint("Исторический",2);
        StList.facultyCoursePrint("Исторический",3);
        StList.facultyCoursePrint("Юридический",3);
        StList.facultyCoursePrint("Юридический",4);
        StList.facultyCoursePrint("Психология",2);
        StList.facultyCoursePrint("Психология",3);
        StList.yearOfBirthPrint("1999");
        StList.groupPrint("302");
    }
}