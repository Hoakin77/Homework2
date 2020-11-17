package com.mkhasanovcorparation.lesson_6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");

        Dog dog = new Dog("Бобик");

        cat.info();
        System.out.println();

        dog.info();
        System.out.println();

        cat.run(1700);
        cat.swim(5);
        cat.jump(1.7);

        System.out.println();

        dog.run(400);
        dog.swim(5);
        dog.jump(0.3);
    }
}
