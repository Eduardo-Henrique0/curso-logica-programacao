import java.util.Locale;
import java.util.Scanner;

public class negativos_matriz {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, m, qtdnegativos;

        System.out.print("Qual a quantidade de linhas da matriz? ");
        m = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        n = sc.nextInt();
        sc.nextLine();

        int[][] matriz = new int[m][n];

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.printf("Elemento [%d,%d]: ", i,j);
                matriz[i][j] = sc.nextInt();
            }
        }

        qtdnegativos = 0;

        System.out.println("VALORES NEGATIVOS: ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (matriz[i][j] < 0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }

        sc.close();

    }
}
