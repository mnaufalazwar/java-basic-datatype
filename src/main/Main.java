package main;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");
        System.out.println(sum(10));

        Animal animal = new Animal();
        Ayam ayam = new Ayam();

        suaraAnimal(animal);
        suaraAnimal(ayam);
    }

    public static int sum(int i){
        if(i > 0){
            return i + sum(i -1);
        }
        else {
            return 0;
        }
    }

    public static void suaraAnimal(Animal animal){
        animal.animalSound();
    }

}
