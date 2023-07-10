
public abstract class Pets extends Animals implements ShowAffection {

    String name; // Кличка.
    String species; // Порода.
    String coatColor; // Цвет шерсти.
    String birthDate; // Дата рождения.

    public Pets(int height, int weight, String colourEyes, String name, String species, String coatColor,
            String birthDate) {
        super(height, weight, colourEyes);
        this.name = name;
        this.species = species;
        this.coatColor = coatColor;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "\nРост животного, см.:    " + height +
                "\nВес животного, кг.:    " + weight +
                "\nЦвет глаз:             " + colourEyes +
                "\nКличка:                " + name +
                "\nПорода:                " + species +
                "\nЦвет шерсти:           " + coatColor +
                "\nДата рождения:         " + birthDate;
    }

    public abstract void showAffection(); // Метод проявления ласки.
}