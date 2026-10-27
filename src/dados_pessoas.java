import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, contmulheres, conthomens;
        double menoraltura, maioraltura, soma, media;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();
        sc.nextLine();

        String[] generos = new String[n];
        double[] alturas = new double[n];

        for (int i=0; i<n; i++){
            System.out.print("Altura da " + (i +1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da " + (i +1) + "a pessoa: ");
            generos[i] = sc.nextLine();

        }
        menoraltura = alturas[0];
        maioraltura = alturas[0];

        for (int i=0; i<n; i++){
            if (alturas[i] < menoraltura){
                menoraltura = alturas[i];
            }
            if (alturas[i] > maioraltura){
                maioraltura = alturas[i];
            }
        }

        System.out.printf("Menor altura = %.2f%n", menoraltura);
        System.out.printf("Maior altura = %.2f%n", maioraltura);

        soma = 0;
        contmulheres = 0;

        for (int i=0; i<n; i++){
            if (generos[i].equals("F")){
                soma = soma + alturas[i];
                contmulheres = contmulheres + 1;

            }
        }
        if (contmulheres == 0){
            System.out.println("Impossivel calcular a altura media das mulheres");
        }else {
            media = soma / contmulheres;
            System.out.printf("Media das alturas das mulheres = %.2f%n", media);
        }
        conthomens = n - contmulheres;
        System.out.printf("Numero de homens = %d%n", conthomens);
        sc.close();
    }
}
