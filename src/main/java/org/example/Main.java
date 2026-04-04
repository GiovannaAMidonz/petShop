package org.example;

import org.example.model.Animal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setEspecie("Gato");
        animal.setID(1);
        animal.setNome("Simba");
        animal.setRaca("viralata");

        System.out.println(animal.toString());

    }
}