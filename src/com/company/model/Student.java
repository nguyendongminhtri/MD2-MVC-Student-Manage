package com.company.model;

public class Student extends Human{
    private float avg;

    public Student(float avg) {
        this.avg = avg;
    }

    public Student(int id, String name, int age, float avg) {
        super(id, name, age);
        this.avg = avg;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }
}
