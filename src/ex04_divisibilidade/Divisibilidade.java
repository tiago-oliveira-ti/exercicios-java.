package ex04_divisibilidade;

import java.util.Scanner;

public class Divisibilidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial (divisor): ");
        int divisor = sc.nextInt();

        System.out.println("\nDigite os próximos números (o programa para quando o resto da divisão for ≠ 0):");

        while (true) {
            System.out.print("Número: ");
            int numero = sc.nextInt();

            if (numero < divisor) {
                System.out.println("Número ignorado (menor que o inicial).");
                continue;
            }

            if (numero % divisor != 0) {
                System.out.println(numero + " não é divisível por " + divisor + ". Encerrando.");
                break;
            }

            System.out.println(numero + " é divisível por " + divisor + ". Continue.");
        }

        sc.close();
    }
}
