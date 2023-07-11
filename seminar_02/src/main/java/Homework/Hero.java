package Homework;

class Hero implements Health, Homework.MagicEnergy {
    private int maxHealthPoint;
    private int currentHealthPoint;

    private int maxManaPoint;
    private int currentManaPoint;

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    @Override
    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    @Override
    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrentManaPoint() {
        return currentManaPoint;
    }

    @Override
    public int getMaxManaPoint() {
        return maxManaPoint;
    }
}