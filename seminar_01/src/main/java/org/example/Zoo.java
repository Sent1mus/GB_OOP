import java.util.LinkedList;
import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {
    }

    public static void getData(LinkedList<Animals> animals) {

        // МЕНЮ ДЛЯ ВЗАИМОДЕЙСТВИЯ С ПОЛЬЗОВАТЕЛЕМ
        System.out.print("""
                Уважаемый пользователь,
                для управления базой данных "Зоопарк" выберете одно из следующих действий:

                Посмотреть информацию о животном с номером i                                   - нажмите 1
                Заставить животное с номером i издать звук                                     - нажмите 2
                Напечатать информацию о животных, которые есть на данный момент в зоопарке     - нажмите 3
                Заставить всех животных, которые на данный момент есть в зоопарке, издать звук - нажмите 4
                Ваше решение: \s""");
        Scanner aScanner = new Scanner(System.in);
        int decisionNumber = aScanner.nextInt();

        // ВАРИАНТЫ ВЗАИМОДЕЙСТВИЯ, ПРЕДЛАГАЕМЫЕ В ЗАВИСИМОСТИ ОТ РЕШЕНИЯ ПОЛЬЗОВАТЕЛЯ.
        switch (decisionNumber) {

            // МЕТОД ПОЛУЧЕНИЯ ДАННЫХ О ЖИВОТНОМ
            case 1 -> {
                System.out.println("\nУКАЖИТЕ № ЖИВОТНОГО, О КОТОРОМ ХОТИТЕ ПОЛУЧИТЬ ДАННЫЕ: ");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
                }
                System.out.print("\nВаше решение:  ");
                Scanner cScanner = new Scanner(System.in);
                int showIndex = cScanner.nextInt();
                if (showIndex - 1 <= animals.size()) {
                    System.out.printf("\nДанные по Вашему запросу:  %s %s",
                            animals.get(showIndex - 1).getClass().getSimpleName(), animals.get(showIndex - 1));
                } else
                    System.out.println("Такого номера нет в списке.");
            }

            // МЕТОД ПРОСЛУШИВАНИЯ ГОЛОСОВ ЖИВОТНЫХ
            case 2 -> {
                System.out.println("\nУКАЖИТЕ № ЖИВОТНОГО, ЧЕЙ ГОЛОС ВЫ ХОТИТЕ УСЛЫШАТЬ: ");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
                }
                System.out.print("\nВаше решение:  ");
                Scanner cScanner = new Scanner(System.in);
                int showIndex = cScanner.nextInt();
                if (showIndex - 1 <= animals.size()) {
                    System.out.printf("\nДанные по Вашему запросу:  %s %s",
                            animals.get(showIndex - 1).getClass().getSimpleName(), animals.get(showIndex - 1));
                } else
                    System.out.println("Такого номера нет в списке.");
            }

            // МЕТОД ВЫВОДА ДАННЫХ О ВСЕХ ЖИВОТНЫХ, НАХОДЯЩИХСЯ В ЗООПАРКЕ
            case 3 -> {
                System.out.println("\nНА ДАННЫЙ МОМЕНТ В ЗООПАРКЕ ИМЕЮТСЯ СЛЕДУЮЩИЕ ЖИВОТНЫЕ: ");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.printf("\n№ %s\n %s\n", i + 1 + " = " + animals.get(i).getClass().getSimpleName(),
                            animals.get(i));
                }
            }

            // МЕТОД ВЫЗОВА ЗВУКОВ, КОТОРЫЕ ИЗДАЮТ ВСЕ ЖИВОТНЫЕ ОДНОВРЕМЕННО
            case 4 -> {
                System.out.println("\nВСЕ ЖИВОТНЫЕ ЗООПАРКА ИЗДАЮТ ЗВУКИ: ");
                for (Animals animal : animals) {
                    ((SoundMake) animal).soundMake();
                }
            }
            default -> System.out.println("Такого номера нет в меню.");
        }
    }

    public static void doSomething(LinkedList<Animals> animals) {
        // МЕНЮ ДЛЯ ВЗАИМОДЕЙСТВИЯ С ПОЛЬЗОВАТЕЛЕМ
        System.out.println();
        System.out.print("""
                \nЖИВОТНЫЕ МОГУТ ПРОДЕМОНСТРИРОВАТЬ НЕКОТОРЫЕ ДЕЙСТВИЯ
                Выбирете активность, которую бы хотели увидеть:
                Проявлять ласку                     - нажмите 1
                Заниматься дрессировкой             - нажмите 2
                Ваше решение: \s""");
        Scanner aScanner = new Scanner(System.in);
        int userWishes = aScanner.nextInt();

        // ВАРИАНТЫ ВЗАИМОДЕЙСТВИЯ, ПРЕДЛАГАЕМЫЕ В ЗАВИСИМОСТИ ОТ РЕШЕНИЯ ПОЛЬЗОВАТЕЛЯ.
        switch (userWishes) {

            case 1 -> {
                System.out.println("\nДОМАШНИЕ ЖИВОТНЫЕ ПРОЯВЛЯЮТ ЛАСКУ\n");
                for (Animals animal : animals) {
                    if (animal instanceof ShowAffection) {
                        ((ShowAffection) animal).showAffection();
                    }
                }
            }
            case 2 -> {
                System.out.println("\nСОБАКИ ПОДДАЮТСЯ ДРЕССИРОВКЕ\n");
                for (Animals animal : animals) {
                    if (animal instanceof Training) {
                        ((Training) animal).training();
                    }
                }
            }
        }
    }
}