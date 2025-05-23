package org.tnsif.accenture.c2tc.oops;

class Animal1
{
    void eat()
    {
        System.out.println("Animals are eating");
    }
}

class Mammal extends Animal1 // Fixed inheritance: Mammal extends Animal1
{
    void sleep()
    {
        System.out.println("Mammal is sleeping");
    }
}

class Dog1 extends Mammal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}

public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        Dog1 obj = new Dog1();
        obj.eat();
        obj.sleep();
        obj.bark();
    }
}