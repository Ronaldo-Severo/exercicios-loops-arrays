import java.util.Scanner;

public class Exercicio_DoWhile_Maior_Media {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador = 1;

        int[] nota = new int[5];
        double media = 0;
        int maior = 0;

        do {
            System.out.print("Digite a nota " + contador + ": ");
            nota[contador -1] = scan.nextInt();
            media = media+nota[contador -1];

            if (nota[contador -1] > maior) {
                maior = nota[contador -1];
            }

            contador++;

        } while (contador <= 5);

        System.out.println("A maior nota é: " + maior);
        System.out.println("A média é: " + (media / (contador -1)));

    }

}
