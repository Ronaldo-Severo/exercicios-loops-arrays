import java.util.Scanner;

public class Exercicio_ParImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador = 1;

        int[] numero = new int[5];
        int par = 0;
        int impar = 0;
        
        do {
            System.out.print("Digite o numero " + contador + ": ");
            numero[contador - 1] = scan.nextInt();
            
            if ((numero[contador - 1] % 2) == 0) {
                par++;

            } else {
                impar++;
                
            }

            contador++;
        } while (contador <= 5);

        System.out.println("A quantidade de numeros IMPAR é: " + impar);
        System.out.println("A quantidade de numeros PAR é: " + par);

    }
}
