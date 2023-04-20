// 6 - Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles
import java.util.Scanner;

public class AtividadeSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2; 

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = scanner.nextInt();

        System.out.println("O intervalo entre esses números é:");

        if(numero2 < numero1) {
            for(int i = numero1; i >= numero2; i--) {
                System.out.println(i + "");
            }
        } else {
            for( int i = numero2; i >= numero1; i--) {
                System.out.println(i + "");
            }
        }
    }
}