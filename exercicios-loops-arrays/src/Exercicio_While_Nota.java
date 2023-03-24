import java.util.Scanner;

public class Exercicio_While_Nota {

    public static void main(String[] args) {

        int nota = 20;
        Scanner scan = new Scanner(System.in);

        while (nota < 0 || nota > 10) {

            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota Inválida! " + nota);

            }

        }

        System.out.println("Nota Válida Digitada: " + nota);
        scan.close();
    }
}