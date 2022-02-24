package com.epam.training.Tsimafei_Novik.Classes.Main_Task;

import java.util.ArrayList;
import java.util.List;
/**
 a) список студентов заданного факультета;
 b) списки студентов для каждого факультета и курса;
 c) список студентов, родившихся после заданного года;
 d) список учебной группы.
 **/
public class StudentsList {
    private final List<Student>studentsList = new ArrayList<>();
    public void addStudent(Student st){
        studentsList.add(st);
    }
    public void facultyPrint(String faculty){
        System.out.println("Список студентов факультета '" + faculty + "'");
        for(Student st : studentsList){
            if(st.getFaculty().equals(faculty)){
                System.out.println(st);
            }
        }
    }
    public void facultyCoursePrint(String faculty, int course){
        for(Student st : studentsList){
            if(Integer.parseInt(st.getCourse()) == course && st.getFaculty().equals(faculty)){
                System.out.println(st);
            }
        }
    }
    public void yearOfBirthPrint(String year){
        System.out.println("Список студентов, родившихся после " + year + " года");
        for(Student st : studentsList){
            if(parseYear(st.getDateOfBirth().substring(6)) > parseYear(year)){
                System.out.println(st);}
        }
    }
    public void groupPrint(String group){
        System.out.println("Список студентов группы №" + group);
        for(Student st : studentsList){
            if(st.getGroup().equals(group)){
                System.out.println(st);
            }
        }
    }

    public int parseYear(String years){
        return Integer.parseInt(years);
    }
}
