import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posmaior, maior;

        System.out.print("Quantas pessoas você vai digitar? ");
        n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i=0; i<n; i++){
            System.out.println("DADOS DA " + (i +1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();
        }
        maior = idades[0];
        posmaior = 0;

        for (int i=0; i<n; i++){
            if (idades[i] > maior) {
                maior = idades[i];
                posmaior = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nomes[posmaior]);

        sc.close();
    }
}
