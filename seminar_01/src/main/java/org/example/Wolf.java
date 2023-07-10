
public class Wolf extends WildAnimals {

    private final boolean packLeader = true; // Вожак стаи - доступно пользователю только для чтения.

    public Wolf(int height, int weight, String colourEyes, String habitat, String locationDate) {
        super(height, weight, colourEyes, habitat, locationDate);
    }

    public String toString() {
        return "\nРост животного, см:   " + height +
                "\nВес животного, кг:    " + weight +
                "\nЦвет глаз:            " + colourEyes +
                "\nМесто обитания:       " + habitat +
                "\nДата нахождения:      " + locationDate +
                "\nВожак стаи:           " + packLeader;
    }

    public boolean getPackLeader() {
        return packLeader;
    }

    @Override
    public void soundMake() {
        System.out.println("Голос: волк рычит и воет!");

    }
}