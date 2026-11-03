import java.util.Locale;
import java.util.Scanner;

public class acima_diagonal {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, soma;

        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();
        sc.nextLine();

        int[][] matriz = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        soma = 0;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                soma = soma + matriz[i][j];
            }
        }

        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
    }
}
