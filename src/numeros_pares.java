import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtepares;

        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("\nNUMEROS PARES:");

        qtepares = 0;
        for (int i=0; i<n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d ", vetor[i]);
                qtepares++;
            }
        }
        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtepares);

        sc.close();

    }
}
