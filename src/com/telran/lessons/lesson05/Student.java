package com.telran.lessons.lesson05;

//Создайте класс Student
//Создайте конструктор по умолчанию
//Создайте класс Тест
//Создайте экземпляр класса Student
//Добавьте в класс Student несколько конструкторов  с параметрами
//Удалите конструктор по умолчанию
//Удалите this из конструктора, переименуйте параметры

public class Student {

    int id;
    String Name;
    int age;

    public Student() {
    }

    public Student(int id, String Name, int age){
        this.id = id;
        this.Name = Name;
        this.age = age;
    }

    public Student(int id){
        this(id,null,0);
    }


    public Student(int id, String Name){
        this(id, Name, 0);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
