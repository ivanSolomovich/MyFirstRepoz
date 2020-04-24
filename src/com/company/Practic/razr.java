package com.company.Practic;

public class razr {
    public static void main(String[] s[]) {
        Student st1 = new Student();
        Student st2 = new Student();

        st1.name = "Ivan";
        st2.marks = 87;
        st1.section = 'C';

        System.out.println("Print using st1: " +
                st1.name + "" + st1.marks + " " + st1.section);

        System.out.println("Print using st2: " +
                st2.name + " " + st2.marks + " " + st2.section);


    }
    }

class Student {
    String name;
    int marks;
    char section;
}
