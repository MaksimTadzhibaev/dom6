package ru.MaksimTadzhibaev.lesson6;



public class Cat extends Animal {
    public static int countCat;
    public Cat(String name, String color, int age) {
        super(name, color, age);
        countCat++;
    }


    @Override
    public void run(int distanceOnTheGround) {
        if (distanceOnTheGround >= 0 && distanceOnTheGround <= 200) {
            System.out.println(getName() + " пробежал(а) - " + distanceOnTheGround + " м.");
        } else {
            System.out.println(getName()+ " не может бежать задом и больше 200 метров за один раз вперед");
        }
    }

    @Override
    public void sail(int distanceOnWater) {
        System.out.println(getName() + " не умеет плавать");
    }

    public static void createdCat () {
        System.out.println("Всего создано котов - " + countCat + " ед.");
    }

}
