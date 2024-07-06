package session_10_oop_concept.practice;

public class Animal {

    String name;
    double weight;
    int age;

    public Animal(String name,double weight, int age){

        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    String  getName(){
        return "Misha";
    }
    public String bark(){
        String bark = name;
        int dogAge = 14;
        return bark;
    }
}
