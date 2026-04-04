package org.example;

import org.example.model.Animal;
import org.example.model.Ordem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("gato","viralata","Mingau","nenhum",2);
        System.out.println(animal.toString());
        Ordem ordem = new Ordem(32,"crédito",0);
        System.out.println("Valor do atendimento:");
        System.out.println("R$:"+ordem.calcularTotal(50));

    }
}