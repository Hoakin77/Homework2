package com.mkhasanovcorparation.constructors;
// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
public class Person {
  private String name;
  private String position;
  private String email;
  private int phone;
  private double salary;
  private int age;

    Person(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = 0;
        this.salary = salary;
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Сотрудник должен быть старше 18 лет");
        }
    }

    int GetAge() {
        return age;
    }

    void show(){
       System.out.println( name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
   }
    public static void main(String[] args) {
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "1892312312", 40000, 40);
        persArray[2] = new Person("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "2892312312", 50000, 50);
        persArray[3] = new Person("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "3892312312", 60000, 60);
        persArray[4] = new Person("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "4892312312", 70000, 70);

        for (Person item : persArray) {
            if (item.GetAge() > 40) item.show();
        }
    }
}