package edu.panov.spring.model;

public class Student {
    private String name;
    private int age;
    private double avgMark;

    public Student(String name, int age, double avgMark) {
        this.avgMark = avgMark;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgMark=" + avgMark +
                '}';
    }
}
