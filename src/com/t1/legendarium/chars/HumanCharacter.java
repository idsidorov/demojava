package com.t1.legendarium.chars;

public class HumanCharacter extends LightCharacter {
    private double swordLevel;

    public HumanCharacter(Integer health, double swordLevel) {
        super(health);
        this.swordLevel = swordLevel;
    }
}
