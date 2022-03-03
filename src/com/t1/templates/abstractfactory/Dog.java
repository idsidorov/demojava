package com.t1.templates.abstractfactory;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Bow-Wow";
    }
}