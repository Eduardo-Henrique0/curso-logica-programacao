import java.util.Locale;
import java.util.Scanner;

public class aprovados {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media;

        System.out.print("Quantos alunos serão digitados? ");
        n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];

        for (int i=0; i<n; i++){
            System.out.println("Digite nome, " + "primeira e segunda nota do " + (i + 1) + "o aluno: ");
            nomes[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("ALUNOS APROVADOS: ");

        for (int i=0; i<n; i++){
            media = (notas1[i] + notas2[i]) / 2;
            if (media >= 6){
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
