package com.company.creat;

public class Staff {
    private String name;
    private int id;
    private int age;
    private String telephone;
    private String email;
    private double timeWork;

    public Staff() {
    }

    public Staff(String name, int id, int age, String telephone, String email, double timeWork) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.timeWork = timeWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", timeWork='" + timeWork + '\'' +
                '}';
    }
}
