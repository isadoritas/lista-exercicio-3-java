import java.util.Scanner;

public class AtividadeQuatro {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] digitos = new int[5];
        int soma = 0;

        for (int i = 0; i < digitos.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º dígito:");
            digitos[i] = scanner.nextInt();
            soma += digitos[i];
        }

        double media = (double) soma / digitos.length;
        System.out.println("\n A soma dos números é " + soma);
        System.out.println("A média aritmética desses números é " + media);
    }
}



