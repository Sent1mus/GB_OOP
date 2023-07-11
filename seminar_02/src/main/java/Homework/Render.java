package Homework;

class Render {
    public void showIndicator(Object object, String className) {
        if (object instanceof Health) {
            Health healthObject = (Health) object;
            System.out.println("Текущее количество здоровья в классе " + className + ": " + healthObject.getCurrentHealthPoint() +
                    ", максимальное количество здоровья: " + healthObject.getMaxHealthPoint());
        }

        if (object instanceof MagicEnergy) {
            MagicEnergy energyObject = (MagicEnergy) object;
            System.out.println("Текущее количество энергии в классе " + className + ": " + energyObject.getCurrentManaPoint() +
                    ", максимальное количество энергии: " + energyObject.getMaxManaPoint());
        }
    }
}