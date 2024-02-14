package easy.animal;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);

        String word1 = t.next();
        String word2 = t.next();
        String word3 = t.next();

        Animal[] animals = {
                new Animal("aguia", "vertebrado", "ave", "carnivoro"),
                new Animal("pomba", "vertebrado", "ave", "onivoro"),
                new Animal("homem", "vertebrado", "mamifero", "onivoro"),
                new Animal("vaca", "vertebrado", "mamifero", "herbivoro"),
                new Animal("pulga", "invertebrado", "inseto", "hematofago"),
                new Animal("lagarta", "invertebrado", "inseto", "herbivoro"),
                new Animal("sanguessuga", "invertebrado", "anelideo", "hematofago"),
                new Animal("minhoca", "invertebrado", "anelideo", "onivoro")
        };

        for (Animal animal : animals) {
            if (animal.getTipo1().equals(word1) &&
                    animal.getTipo2().equals(word2) &&
                    animal.getTipo3().equals(word3)) {

                System.out.println(animal.getName());
            }
        }
    }
}

class Animal {

    private final String tipo1;
    private final String tipo2;
    private final String tipo3;

    private final String name;


    public Animal(
            String name,
            String tipo1,
            String tipo2,
            String tipo3
    ) {
        this.name = name;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.tipo3 = tipo3;

    }

    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public String getTipo3() {
        return tipo3;
    }

    public String getName() {
        return name;
    }
}