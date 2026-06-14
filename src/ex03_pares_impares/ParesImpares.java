package ex03_pares_impares;


import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int fim = sc.nextInt();

        System.out.println("Escolha: 1 - Pares | 2 - Ímpares");
        int opcao = sc.nextInt();

        System.out.println("\nResultado em ordem decrescente:");
        for (int i = fim; i >= inicio; i--) {
            if (opcao == 1 && i % 2 == 0) {
                System.out.println(i);
            } else if (opcao == 2 && i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}