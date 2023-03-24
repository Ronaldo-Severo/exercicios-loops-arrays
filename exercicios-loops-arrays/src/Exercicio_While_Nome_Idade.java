import java.util.Scanner;

public class Exercicio_While_Nome_Idade {

    public static void main(String[] args) {

        String nome = "";
        int idade = 0;
        Scanner scan = new Scanner(System.in);

        while (! nome.equals(String.valueOf(0))) {

            System.out.print("Digite seu nome: ");
            nome = scan.next();
            System.out.print("Digite sua idade: ");
            idade = scan.nextInt();

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

        }
        scan.close();
        System.out.println("Programa Encerrado!");
    }

}