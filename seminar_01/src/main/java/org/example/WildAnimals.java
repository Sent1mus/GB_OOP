
public abstract class WildAnimals extends Animals {

    String habitat; // Место обитания.
    String locationDate; // Дата нахождения.

    public WildAnimals(int height, int weight, String colourEyes, String habitat, String locationDate) {
        super(hight, weight, colourEyes);
        this.habitat = habitat;
        this.locationDate = locationDate;
    }

    public String toString() {
        return "\nРост животного, см:   " + height +
                "\nВес животного, кг:    " + weight +
                "\nЦвет глаз:            " + colourEyes +
                "\nМесто обитания:       " + habitat +
                "\nДата нахождения:      " + locationDate;
    }
}