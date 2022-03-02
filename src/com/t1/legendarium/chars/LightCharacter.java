package com.t1.legendarium.chars;

public abstract class LightCharacter extends AbstractCharacter {
    private double divineMagicLevel;

    public LightCharacter(Integer health) {
        super(health);
        this.divineMagicLevel = 100.0;
    }

    public void light() {
        //Here is the light from Londeron
        double divineMagicLevel = 0;

        divineMagicLevel -= 10;
    }
}
