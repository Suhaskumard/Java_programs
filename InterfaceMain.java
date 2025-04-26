interface Animal {
    void makeSound();
    void eat();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bow Bow!");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow Meow!");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myDog.eat();

        myCat.makeSound();
        myCat.eat();
    }
}
