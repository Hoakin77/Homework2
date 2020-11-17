package com.mkhasanovcorparation.lesson_6;

import java.util.Random;

abstract class Animal {
   protected String name;
   protected String type;
   protected int maxRun;
   protected int maxSwim;
   protected double maxJump;
   public Random random = new Random();

   public Animal(String name){
    this.name = name;
   }
   public void run(int dist){
       if(this.maxRun >= dist){
           System.out.println(this.type + " " + this.name + " бежит " + dist + " М");
       } else {
           System.out.println(this.type + " " + this.name + " не может бежать так далеко");
       }
   }
   public void swim(int dist){
       if (this.maxSwim >= dist){
           System.out.println(this.type + " " + this.name + " плывет " + dist + " М");
       } else {
           System.out.println(this.type + " " + this.name + " не может плыть так далеко");
       }
   }
   public void jump(double height){
       if (this.maxJump >= height){
           System.out.println(this.type + " " + this.name + " прыгает " + height + " М");
       } else {
           System.out.println(this.type + " " + this.name + "не может прыгнуть так высоко");
       }
   }
   public void info(){
       System.out.println(this.type + " " + this.name + " бежит до " + this.maxRun + " М., плывет до " + this.maxSwim + " М., Прыгает " + this.maxJump + " М.");
   }
}


