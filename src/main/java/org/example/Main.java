package org.example;

import org.example.model.Animal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("gato","viralata","Mingau","nenhum",2);
        System.out.println(animal.toString());

    }
}