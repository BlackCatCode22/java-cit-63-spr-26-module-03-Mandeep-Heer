package myanimals;

public class Animal {
    public static int numOfAnimals = 0;
    public Animal() {
        numOfAnimals++;
        System.out.println("Animals: " + numOfAnimals);
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;
        System.out.println("Cat count: " + Cat.getCatCount());
        Dog myDog = new Dog();
        myDog.bark();
        Cat secondCat = new Cat();
    }
}