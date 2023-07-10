
public class Cat extends Pets {

    private final boolean woolPresence = true; // Наличие шерсти - доступно пользователю только для чтения.

    public Cat(int height, int weight, String colourEyes, String name, String species,
            String coatColor, String birthDate) {
        super(height, weight, colourEyes, name, species, coatColor, birthDate);
    }

    @Override
    public String toString() {
        return "\nРост животного, см.:   " + height +
                "\nВес животного,  кг.:   " + weight +
                "\nЦвет глаз:             " + colourEyes +
                "\nКличка:                " + name +
                "\nПорода:                " + species +
                "\nЦвет шерсти:           " + coatColor +
                "\nДата рождения:         " + birthDate +
                "\nНаличие шерсти:        " + woolPresence;
    }

    @Override
    public void soundMake() { // Издает звуки.
        System.out.println("Голос: котик мяукает!");
    }

    @Override // Проявляет ласку.
    public void showAffection() {
        System.out.println("Котик мурлыкает и трётся о Вашу ногу.");
    }
}