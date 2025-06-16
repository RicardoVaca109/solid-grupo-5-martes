package lsp;

public class MainLsp {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        ((Walkable) dog).walk();

        fish.makeSound();
        if (fish instanceof Walkable) {
            ((Walkable) fish).walk();
        } else {
            System.out.println("This animal cannot walk.");
        }
    }
}
