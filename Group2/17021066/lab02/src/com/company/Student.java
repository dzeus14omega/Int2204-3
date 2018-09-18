package com.company;

public class Student {
    public String name;
    public String id;
    public String group;
    public String email;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getid() {
        return this.name;
    }

    public void setgroup(String group) {
        this.group = group;
    }

    public String getgroup() {
        return this.group;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getemail() {
        return this.email;
    }

    public String getinfo() {
        return "ten:" + this.name + "\n" + "mssv:" + this.id + "\n" + "email:" + this.email + "\n" + this.group;
    }

    public Student() {
        this.name = "student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "INT22041";
        this.email = email;
    }

    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
}
