package com.t1.legendarium.chars;

public abstract class AbstractCharacter implements Carrier {

    protected static final double G = 9.78;

    private int carryWeight;

    @Override
    public void load(int pounds) {
        //Загрузка
    }

    @Override
    public int unload(int pounds) {
        //выгрузка
        return 0;
    }

    protected Integer health;

    public Boolean getAlive() {
        return health > 0;
    }

    public AbstractCharacter(Integer health) {
        carryWeight = 0;
        this.health = health;
    }

}
