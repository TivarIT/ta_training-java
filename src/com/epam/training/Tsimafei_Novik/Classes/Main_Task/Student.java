package com.epam.training.Tsimafei_Novik.Classes.Main_Task;

/**
 Создать классы, спецификации которых приведены ниже. Определить кон-
 структоры и методы setТип(), getТип(), toString(). Определить дополнительно
 методы в классе, создающем массив объектов. Задать критерий выбора данных
 и вывести эти данные на консоль. В каждом классе, обладающем информацией,
 должно быть объявлено несколько конструкторов.
 Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
 Факультет, Курс, Группа
 **/
public class Student {

    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private String dateOfBirth;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;
    public Student( int id, String surname, String name, String middleName, String dateOfBirth, String address,  String phoneNumber, String faculty, String course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMiddleName() {
        return name;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String toString() {
        return "Студент{" + " id " + id +
                ", Фамилия = '" + surname + '\'' +
                ", Имя = '" + name + '\'' +
                ", Отчество = '" + middleName + '\'' +
                ", Дата рождения = '" + dateOfBirth + '\'' +
                ", адрес = '" + address + '\'' +
                ", Телефон = '" + phoneNumber + '\'' +
                ", Факультет = '" + faculty + '\'' +
                ", Курс = '" + course + '\'' +
                ", Группа = '" + group + '\'' +
                '}';
    }
    public String fullName(){
        return surname + " " + middleName + " " + name;
    }
}






