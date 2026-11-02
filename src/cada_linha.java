import java.util.Locale;
import java.util.Scanner;

public class cada_linha {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maiorelemento;

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


        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
        for (int i=0; i<n; i++){
            maiorelemento = matriz[i][0];
            for (int j=1; j<n; j++){
                if (matriz[i][j] > maiorelemento){
                    maiorelemento = matriz[i][j];
                }
            }
            System.out.println(maiorelemento);
        }


        sc.close();
    }
}
