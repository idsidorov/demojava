package com.t1.templates.decorator;

public class Garland extends TreeDecorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return decorateWithGarland() + super.decorate();
    }

    private String decorateWithGarland() {
        return " with Garland ";
    }
}