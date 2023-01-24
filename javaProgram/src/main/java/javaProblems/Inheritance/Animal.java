package javaProblems.Inheritance;

public class Animal {

    String name;
    public Animal(){
    }

    public void setName(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println("The name of the animal is: " + name);
    }

    public void sound(){
        System.out.println("The animal makes a sound");
    }




}
