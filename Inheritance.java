class Animal {
    String name;
    void eat() {
        System.out.println("eating");
    }
    String colour="brown";
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
    
}



public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat(); 
        dog.bark(); 
    }
}
