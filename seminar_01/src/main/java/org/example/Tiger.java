public class Tiger extends WildAnimals {

    public Tiger(int height, int weight, String colourEyes, String habitat, String locationDate) {
        super(height, weight, colourEyes, habitat, locationDate);
    }

    @Override
    public void soundMake() {
        System.out.println("Голос: тигр громко рычит!");
    }
}