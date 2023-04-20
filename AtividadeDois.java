// 2 - Faça um programa que leia um nome de usuário e a sua senha e não aceite a
// senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
// pedir as informações.
import java.util.Scanner;

public class AtividadeDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, senha;
        do {
            System.out.println("Digite o nome de usuário:");
            nome = scanner.nextLine();

            System.out.println("Digite a senha:");
            senha = scanner.nextLine();

            if(senha.equals(nome)) { 
        
                System.out.println("Erro: a senha não pode ser igual ao nome do usuário");
            }
        } while (senha.equals(nome)); 

        System.out.println("Usuário cadastrado com sucesso.");
    }
}


    