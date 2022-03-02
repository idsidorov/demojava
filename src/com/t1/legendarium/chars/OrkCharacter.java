package com.t1.legendarium.chars;

public class OrkCharacter extends DarkCharacter {
    private double axeLevel;

    public OrkCharacter(double axeLevel) {
        super(100);
        this.axeLevel = axeLevel;
    }


    public void russianRulette(int number) throws IllegalArgumentException {
        if (number < 0 || number > 5) {
            throw new IllegalArgumentException();
        }

        if (number == 0) {
            this.health = 0;
        } else {
            //lucky guy!
        }
    }
}
