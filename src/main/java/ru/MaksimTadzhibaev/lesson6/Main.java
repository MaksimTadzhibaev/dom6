package ru.MaksimTadzhibaev.lesson6;

public class Main {
    public static void main(String[] args) {
        Cat catMasya = new Cat("Мася", "бурый", 9);
        System.out.println("Кота зовут - " + catMasya.getName() + ". " + "Цвет кота - " + catMasya.getColor() + ". " + "Возраст кота - " + catMasya.getAge() + ".");
        catMasya.run(40);
        catMasya.sail(3);
        Cat.createdCat();
        Dog dogBoy = new Dog("Мальчик", "чёрный", 15);
        Dog dogSon = new Dog("Сын", "белый", 5);
        System.out.println("Собаку зовут - " + dogBoy.getName() + ". " + "Цвет собаки - " + dogBoy.getColor() + ". " + "Возраст собаки - " + dogBoy.getAge() + ".");
        dogBoy.run(501);
        dogBoy.sail(8);
        Dog.createdDog();
    }
}
