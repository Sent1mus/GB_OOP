
public class Dog extends Pets implements Training {

    private final boolean trainingAvailability = true; // Наличие дрессировки - доступно пользователю только для
                                                        // чтения.

    public Dog(int height, int weight, String colourEyes, String name, String species,
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
                "\nНаличие дрессировки:   " + trainingAvailability;
    }

    @Override
    public void soundMake() {
        System.out.println("Голос: собака лает!"); // Издает звуки.
    }

    @Override // Проявляет ласку.
    public void showAffection() { // Проявляет ласку.
        System.out.println("Собака машет хвостом.");
    }

    @Override
    public void training() { // Собака готова к дрессировке
        System.out.println("Собака выполнила команду сидеть и ждет дальнейших указаний.");
    }
}