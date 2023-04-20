// 1 - Faça um programa que peça uma nota, entre zero e dez. 
// Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
import java.util.Scanner;

public class AtividadeUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.println("Digite uma nota entre 0 e 10:");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                
            System.out.println("Valor inválido. Tente novamente.");
           } 
        } while (nota < 0 || nota > 10);
        System.out.println("Nota válida: " + nota);
        }
    }

