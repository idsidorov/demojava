package com.t1.legendarium.chars;

public class ElvenCharacter extends LightCharacter {


    private double archeryLevel;

    public ElvenCharacter(Integer health, double archeryLevel) {
        super(health);
        this.archeryLevel = archeryLevel;
    }
}
