import java.util.Scanner;



public class IMC {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     

        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = sc.nextDouble();

       System.out.print("Digite seu peso (ex: 70.5): ");
        double peso = sc.nextDouble(); 
     
       double imc = peso / (altura * altura);

        System.out.printf("\nSeu IMC é: %.2f%n", imc);

        if (imc <= 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II (Severa)");
        } else {
            System.out.println("Classificação: Obesidade III (Mórbida)");
        }

        sc.close();
     
     
     
     
      }







     
      }









