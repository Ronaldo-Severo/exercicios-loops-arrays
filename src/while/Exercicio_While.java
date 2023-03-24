import java.util.Scanner;

public class Exercicio_While {

    public static void main(String[] args) {

        // String nome="";
        // int idade=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scan.next();
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        while (nome != "0") {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

        }
        scan.close();
        System.out.println("Programa Encerrado!");
    }

}