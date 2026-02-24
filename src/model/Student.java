package model;

public class Student {

    // TODO: declare fields
    private int id;
    private String name;
    private double gpa;

    // TODO: create constructor
    public Student(){}
    public Student(int id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // TODO: create getters
    public double getGpa() { return gpa; }
    public String getName() { return name; }
    public int getId() { return id; }

    // TODO: override toString()
    public String toString(){
        return "Name: " + getName() + " || " + "Gpa: " + getGpa();
    }

}
