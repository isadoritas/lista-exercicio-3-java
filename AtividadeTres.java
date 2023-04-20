// 3 - Faça um programa que leia e valide as seguintes informações:
// Nome: maior que 3 caracteres;
//Idade: entre 0 e 150;
// Salário: maior que zero;
// Sexo: 'f' ou 'm';
// Estado Civil: 's', 'c', 'v', 'd'; 
import java.util.Scanner;

public class AtividadeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Digite o nome (deve ter mais de 3 caracteres):");
            nome = scanner.nextLine();
        } while(nome.length() <= 3);

        do {
            System.out.println("Digite a idade (entre 0 e 150):");
            idade = scanner.nextInt();
        } while(idade < 0 || idade > 150);

        do {
            System.out.println("Digite o salário (maior que zero):");
            salario = scanner.nextDouble();
        } while(salario <= 0);

        do {
            System.out.println("Digite o sexo (f ou m):");
            sexo = scanner.next().toLowerCase();
        } while(!sexo.equals("f") && !sexo.equals("m"));

        do {
            System.out.println("Digite o estado civil (s, c, v ou d):");
            estadoCivil = scanner.next().toLowerCase();
        } while(!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        System.out.println("Dados válidos:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: R$ " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }
}
