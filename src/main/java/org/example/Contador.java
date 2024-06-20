package org.example;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    saldo = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.printf("Saldo atual: %.1f\n", saldo);

                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    scanner.nextLine();

                    if(saldo < saque){
                        System.out.printf("Saldo insuficiente.\n");
                        break;
                    }

                    else{
                        System.out.printf("Saldo atual:  %.1f\n", saldo - saque);
                    }

                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.printf("Programa encerrado.\n");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.printf("Opção inválida. Tente novamente.\n");
            }
        }
        scanner.close();
    }
}