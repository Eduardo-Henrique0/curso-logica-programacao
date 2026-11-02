import java.util.Locale;
import java.util.Scanner;

public class diagonal_negativos {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdnegativos;

        System.out.print("Qual a ordem da matriz? ");
        n = sc.nextInt();
        sc.nextLine();

        int[][] mat = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.printf("Elemento [%d,%d]: ", i,j);
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("DIAGONAL PRINCIPAL: ");

        for (int i=0; i<n; i++){
            System.out.printf("%d ", mat[i][i]);
        }

        qtdnegativos = 0;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (mat[i][j] < 0) {
                    qtdnegativos = qtdnegativos +1;
                }
            }
        }

        System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d\n", qtdnegativos);

        sc.close();


    }
}
