// Создать класс Контейнер - Container.
// В контейнере могут быть ящики (класс Box).

// У каждого ящика есть вес.
// У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков, которые находятся в контейнере.

// Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера (чем меньше вес, тем меньше контейнер).
// Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
// Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.
//     Container c = new Container(...);
//     // ...
//     for (Box box: c) {
//         box - это контейнер
//     }


package org.example;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(254);
        Box box2 = new Box(184);
        Box box3 = new Box(164);
        Box box4 = new Box(468);
        Box box5 = new Box(725);
        Box box6 = new Box(150);

        List<Box> boxes1 = new ArrayList<>();
        boxes1.add(box1);
        boxes1.add(box2);
        boxes1.add(box3);
        List<Box> boxes2 = new ArrayList<>();
        boxes2.add(box4);
        boxes2.add(box5);
        boxes2.add(box6);

        Container container1 = new Container(boxes1);
        Container container2 = new Container(boxes2);

        System.out.println("Общий вес первого контейнера = " + container1.getTotalWeight());
        
        System.out.println("вес каждой коробки:");
        int count = 1;
        for (Box box : container1) {
            System.out.println(count + "я " + box);
            count += 1;
        }
        System.out.println();

        System.out.println("Общий вес второго контейнера = " + container2.getTotalWeight());

        System.out.println("вес каждой коробки:");
        int count1 = 1;
        for (Box box : container2) {
            System.out.println(count1 + "я " + box);
            count1 += 1;
        }

    }
}