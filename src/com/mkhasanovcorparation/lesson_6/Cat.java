package com.mkhasanovcorparation.lesson_6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.maxJump = 2.0;
        this.maxRun = random.nextInt(45) + 155;
        this.type = "Cat";
    }

    @Override
    public void swim(int dist) {
        System.out.println("не может плавать!");
    }
}

