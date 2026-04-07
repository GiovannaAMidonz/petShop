package org.example;

import org.example.model.Animal;
import org.example.model.ClienteDono;
import org.example.model.Ordem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<ClienteDono> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao = 1;

        while (opcao != 4) {
            System.out.println("-------------------------");
            System.out.println("Seja bem-vindo ao PetShop");
            System.out.println("1 - Entrar ");
            System.out.println("2 - Cadastrar ");
            System.out.println("3 - Pesquisar Serviços ");
            System.out.println("4 - Sair ");
            System.out.println("Escolha uma opção");

            try {
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("entrar no sistema:");
                        //metodo login()
                        break;
                    case 2:
                        System.out.println("cadastrar o cliente ");
                        //adicionar na listar
                        break;
                    case 3:
                        System.out.println("Tabela de Serviços");
                        break;
                    case 4:
                        System.out.println("Obrigado volte sempre!");
                        break;
                    default:
                        System.out.println("-------Valor invalido!-------");
                }
            } catch (Exception e) {
                System.out.println("Erro: Por favor, digite apenas números!");
                sc.nextLine(); // LIMPA O BUFFER (Muito importante!)
                opcao = 0; // Reseta a opção para não sair do loop
            }
        }
    }
}





