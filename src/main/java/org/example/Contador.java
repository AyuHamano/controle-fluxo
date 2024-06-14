package org.example;

import java.util.Scanner;
public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números mas o primeiro deve ser menor que o segundo:");

        try{
            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();

            if (numero1 > numero2) {
                throw new ExcecaoContagem();
            }
            for (int i = 1; i<=numero2-numero1; i++){
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ExcecaoContagem erro){
            System.out.println("Números inválidos: o primeiro deve ser menor que o segundo");
        }
    }
}
