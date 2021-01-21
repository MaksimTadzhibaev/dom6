package ru.MaksimTadzhibaev.lesson6;

public class Animal {
    private String name;
    private String color;
    private int age;
    public static int countAnimal;



    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        countAnimal++;
    }

    public static void createdAnimal() {
        System.out.println("Всего создано - " + countAnimal + " животное(ых).");
    }

    public void run(int distanceOnTheGround) {

    }

    public void sail(int distanceOnWater) {

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
