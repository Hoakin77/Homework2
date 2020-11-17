package com.mkhasanovcorparation.lesson_6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.type = "Dog";
        this.maxRun = 500;
        this.maxSwim = random.nextInt(6) + 5;
        this.maxJump = Math.random()* 0.7 + 0.1;
    }
}

