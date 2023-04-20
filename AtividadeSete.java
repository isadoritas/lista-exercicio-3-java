// 7 - Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
import java.util.Scanner;

public class AtividadeSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] digitos = new int[10];
        int pares = 0, impares = 0;
        
        for (int i = 0; i < digitos.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º dígito:");
            digitos[i] = scanner.nextInt();

            if( digitos[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

    } 
    System.out.println(pares + " números são pares");
    System.out.println(impares + " números são ímpares");
}
}