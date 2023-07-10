
public abstract class Animals implements SoundMake {

    int height;
    int weight;
    String colourEyes;

    public Animals(int height, int weight, String colourEyes) {
        this.height = height;
        this.weight = weight;
        this.colourEyes = colourEyes;
    }

    @Override
    public String toString() {
        return "\nРост животного, см.: " + height +
                "\nВес животного, кг.: " + weight +
                "\nЦвет глаз:          " + colourEyes;
    }

    public abstract void soundMake();
}