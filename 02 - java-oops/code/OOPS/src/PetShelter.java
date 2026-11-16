class Animal {
    String name;

    Animal(){
        System.out.println("Animal constructor");
    }

    Animal(String name){
        this.name = name;
    }

    void sound(){
        System.out.println(name + " make a sound");
    }
}

class Dog extends Animal {
    String dogName;

    Dog(String dogName){
       super(dogName);
    }

    void sound(){
        System.out.println(super.name + " make a sound");
    }
}

class Cat extends Animal {
    @Override
    void sound(){
        super.sound();
        System.out.println("Cat says meow!");
    }
}


public class PetShelter {
    static void main() {
        Dog dog1 = new Dog("Alex");
        dog1.sound();
    }
}
