

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
	Animal a = new Animal();
        d.sound();
        a.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}