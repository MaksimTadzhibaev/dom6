package ru.MaksimTadzhibaev.lesson6;

public class Dog extends Animal {
    public static int countDog;
    public Dog (String name, String color, int age) {
        super(name, color, age);
        countDog++;
            }
    @Override
    public void run(int distanceOnTheGround) {
        if (distanceOnTheGround >= 0 && distanceOnTheGround <= 500) {
            System.out.println(getName() + " пробежала - " + distanceOnTheGround + " м.");
        } else {
            System.out.println(getName() + " не может бежать задом и больше 500 метров за один раз вперед");
        }
    }

    @Override
    public void sail(int distanceOnWater) {
        if (distanceOnWater >= 0 && distanceOnWater <= 10) {
            System.out.println(getName() + " проплыл(а) - " + distanceOnWater + " м.");
        } else {
            System.out.println(getName() + " не может плавать задом и больше 10 метров за один раз вперед");
        }
    }

    public static void createdDog () {
        System.out.println("Всего создано собак - " + countDog + " ед.");
    }
}
