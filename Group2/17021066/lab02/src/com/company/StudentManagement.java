package com.company;

import java.util.ArrayList;

public class StudentManagement {

    public static ArrayList<Student> Students = new ArrayList<>();

    public static void removeStudent(String id) {
        for (int i = 0; i < Students.size(); i++) {
            Student t = Students.get(i);
            if (t.getid().equals(id))
                Students.remove(i);
        }
    }

    public static void StudentByGroup () {
        Student tam = Students.get(0);
        String presentGroup = tam.getgroup();
        String nextGroup = "";

        boolean[] check = new boolean[Students.size()];
        for (int i = 0; i < Students.size(); i++) {

            Student tamStudent = Students.get(i);
            if (check[i] != true) {
                if ( tamStudent.getgroup().equals(presentGroup)) {
                    System.out.println(tamStudent.getinfo());
                    check[i] = true;
                } else {
                    nextGroup = tamStudent.getgroup();
                }
                if (i == Students.size() - 1) {
                    i = 0;
                    presentGroup = nextGroup;
                }
            }

        }
    }


    public static boolean sameGroup(Student s1, Student s2) {

        return s1.getgroup().equals(s2.getgroup());
    }

    public static void main(String[] arg) {
        StudentManagement kiemtra = new StudentManagement();
        Student toan = new Student();

        toan.setname("Toan");
        toan.setid("17021066");
        toan.setgroup("INT22041");
        toan.setemail("toan@gmail.com");
        System.out.println(toan.getinfo());
        Student two = new Student(toan);
        System.out.println(two.getinfo());
        Student one = new Student("toan", "000", "toan56199@gmail.com");
        System.out.println(one.getinfo());
        Student minh = new Student();
        System.out.println(minh.getinfo());
        System.out.println(sameGroup(toan, minh));
        Student sv1 = new Student();
        sv1.setgroup("INT22041");
        Student sv2 = new Student();
        sv2.setgroup("INT22041");
        Student sv3 = new Student();
        sv1.setgroup("INT22042");
        System.out.println(sameGroup(sv1, sv2));
        System.out.println(sameGroup(sv2, sv3));
        Students.add(two);
        Students.add(sv1);
        Students.add(sv2);
        Students.add(sv3);
        for(int i=0; i<Students.size();i++)
            kiemtra.removeStudent("INT22042");
        for(Student elements: Students )
            System.out.println(elements.getinfo());
        kiemtra.StudentByGroup();

    }
}
