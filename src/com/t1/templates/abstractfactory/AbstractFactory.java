package com.t1.templates.abstractfactory;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}