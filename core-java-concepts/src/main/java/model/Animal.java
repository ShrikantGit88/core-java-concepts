package model;

public class Animal extends Food{

    String name;
    public void makeSound() {
        System.out.println("yap yap yap");
    }

    public void eat(Food f) {
        System.out.println("..animal munch munch");
    }
}

