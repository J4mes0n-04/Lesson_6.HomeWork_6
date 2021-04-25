//
//Created by Glazyrin Maksim!
//
package geekbrains_lesson6;

/*
1. +Создать классы Собака и Кот с наследованием от класса Животное.
2. +Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
   Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. +У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = 200;
        double distanceSwim =  0;
        Cat cat = new Cat(distanceRun, distanceSwim);

        distanceRun = 500;
        distanceSwim = 10;
        Animal dog = new Dog(distanceRun, distanceSwim);


        System.out.println("Кошка может пробежать: " + cat.getAnimalDistanceRun() +
                " м. \nСобака может пробежать: " + dog.getAnimalDistanceRun() + " м.");

        System.out.println("Введите дистанцию для бега:");
        double distance = scanner.nextDouble();

        System.out.println("Кошка пытается выполнить run(" + distance + "). Результат: " + cat.run(distance));
        System.out.println("Собака пытается выполнить run(" + distance + "). Результат: " + dog.run(distance));
        System.out.println("\n****************\n");

        System.out.println("Кошка может проплыть: " + cat.getAnimalDistanceSwim() +
                " м. \nСобака может проплыть: " + dog.getAnimalDistanceSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextDouble();

        System.out.println("Кошка пытается выполнить swim(" + distance + "). Результат: " + cat.swim(distance));
        System.out.println("Собака пытается выполнить swim(" + distance + "). Результат: " + dog.swim(distance));

    }
}
