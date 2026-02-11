package com.gqt_java.java_gqt.programs;
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Dt20 {
    public static void main(String[] args) {
        Student[] s = new Student[2];
        s[0] = new Student(1, "Ram");
        s[1] = new Student(2, "Sita");
        for (Student st : s)
            System.out.println(st.id + " " + st.name);
    }
}

