package com.t1.legendarium.chars;

public abstract class DarkCharacter extends AbstractCharacter {
    private double arcaneMagicLevel;

    public DarkCharacter(Integer health) {
        super(health);
        arcaneMagicLevel = 100.0;
    }

    public void coldStrike() {
        // strike enemy with cold bolt
        arcaneMagicLevel -= 10;
    }
}
