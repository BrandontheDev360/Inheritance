public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        Object[] list = {new Dog(), new DogFood(), new Cat(), };
        Dog dog2 = (Dog) list[0];
        dog2.makeSound();
        ((Dog) list[0]).makeSound();
        for (Object object : list) {
            if (object instanceof Animal) {
                ((Animal) object).makeSound();
            }
        }
        Dog dog3 = new Dog();
        System.out.println(dog.toString());
        Parent parent = new Parent();
        Child child = new Child();
        parent.sayHello();
        child.sayHello();
        System.out.println(parent);
        System.out.println(child);
        dog.makeSound();
        dog.findFood();
        dog2.sound = "dude";
        dog2.makeSound();
        ((Cat) list[2]).findFood();
    }
}

abstract class Animal {
    String sound = "";
    public Animal() {

    }
    public Animal(String sound) {
        this.sound = sound;
    }

    abstract void findFood();

    void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animal{
    public Dog() {
        super("bark");
    }

    public Dog(String sound) {
        super(sound);
    }

    @Override
    void findFood() {
        System.out.println("Looks at human");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "sound='" + sound + '\'' +
                '}';
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("wags tail");
    }
}

class Cat extends Animal {
    public Cat() {
        super("meow meow");
    }

    @Override
    void findFood() {
        System.out.println("MEOW");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "sound='" + sound + '\'' +
                '}';
    }
}

class DogFood {
    public DogFood() {
    }
}

class Parent {
    String saying = "Hello World";
    public Parent() {

    }
    public Parent(String saying) {
        this.saying = saying;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "saying='" + saying + '\'' +
                '}';
    }
    void sayHello() {
        System.out.println(saying);
    }

}

class Child extends Parent {
    public Child() {
        super("Bruh like why was I brought into this world sheesh");
    }

    public Child(String saying) {
        super(saying);
    }

    @Override
    public String toString() {
        return "Child{" +
                "saying='" + saying + '\'' +
                '}';
    }
}