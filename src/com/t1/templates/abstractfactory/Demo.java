package com.t1.templates.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory<Animal> factory = new AnimalFactory();

        Animal dog = factory.create("Dog");
        System.out.println(dog.getAnimal());
        System.out.println(dog.makeSound());

        Animal duck = factory.create("duck");
        System.out.println(duck.getAnimal());
        System.out.println(duck.makeSound());
    }
}
