package com.javacourse.streams;

import java.util.ArrayList;

public class StudentsList {
    public static Students student1 = new Students(1, "Alex", "Potter", 1992, "Polevaya 60А", "0956211168", "Medical", "5", "52");
    public static Students student2 = new Students(2, "David", "Smirnov", 1991, "Gagarin 30", "0952365966", "Medical", "5", "52");
    public static Students student3 = new Students(3, "Kriss", "Shatilov", 1989, "Moskovskij 45", "07325695465", "Medical", "6", "61");
    public static Students student4 = new Students(4, "Kat", "Ivanova", 1987, "Shevchenko 2", "0669232181", "Medical", "4", "43");
    public static Students student5 = new Students(5, "Anastacia", "Guzeeva", 2000, "Ganny 9", "0507863899", "Biological", "4", "45");
    public static Students student6 = new Students(6, "Den", "Stiles", 1995, "Gagarina 98", "0996322904", "Pharmocological", "6", "63");
    public static Students student7 = new Students(7, "Michael", "Momot", 1980, "Donets-zakharzhevskogo 1", "0955555767", "Biological", "3", "31");
    public static Students student8 = new Students(8, "Pole", "Rastorguev", 2002, "Technical 23", "0739911555", "Biological", "2", "20");
    public static Students student9 = new Students(9, "Julia", "Voloshina", 2000, "Klaptsova 13", "0500011376", "Pharmocological", "2", "20");
    public static Students student10 = new Students(10, "Ricardio", "Italiano", 1999, "Gagarin 55", "0732568709", "Pharmocological", "1", "12");

    public static ArrayList<Students> studentsList = new ArrayList<Students>();

    public static void addStudents () {
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);
        studentsList.add(student6);
        studentsList.add(student7);
        studentsList.add(student8);
        studentsList.add(student9);
        studentsList.add(student10);
    }
}

