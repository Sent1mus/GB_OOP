 /**
     * Есть класс Фрукта. У фрукта есть вес. 
     * Есть 3 наследника: апельсин, яблоко и золотое яблоко.
     * 
     * Нужно создать класс "Коробка с фруктами", в которую можно класть фрукты какого-то типа. 
     * После создания коробка пустая. В нее можно добавлять фрукты с помощью метода add.
     * У коробки можно узнать сумарный вес с помощью метода #getWeight. 
     * Содержимое коробки можно пересыпать в другую коробку. При этом исходная коробка очищается, а вторая наполняется.
     */


package Homework;

public class Main {
    public static void main(String[] args) {


        Box<Homework.Orange> orangeBox = new Box<>();
        orangeBox.add(new Homework.Orange(3));
        orangeBox.add(new Homework.Orange(2));

        System.out.println("Cуммарный вес коробки с апельсинами составляет:" + orangeBox.getWeight()); // 5

        BoxApple<Apple> appleBox = new BoxApple<>();
        appleBox.add(new Apple(1));
        appleBox.add(new GoldenApple(2)); // допустимый вариант
        System.out.println("Cуммарный вес коробки с яблоками составляет:" + appleBox.getWeight()); // 3

        BoxApple<Apple> goldenAppleBox = new BoxApple<>();
        goldenAppleBox.add(new GoldenApple(4)); // допустимый вариант
        System.out.println("Cуммарный вес коробки с золотыми яблоками составляет:" + goldenAppleBox.getWeight()); // 4

        goldenAppleBox.pourTo(appleBox); // допустимый вариант


        Box<Homeworkwq.Orange> orangeBox2 = new Box<>();
        orangeBox.pourTo(orangeBox2);
        System.out.println("При пересыпании апельсинов из одной коробки в другую, в исходной коробке будет:" + orangeBox.getWeight()); // 0
        System.out.println("А в другой коробке станет:" + orangeBox2.getWeight()); // 5
    }
}