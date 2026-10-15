import java.util.Locale;
import java.util.Scanner;

public class par_impar {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, valor;

        System.out.print("Quantos numeros você vai digitar: ");
        n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            valor = sc.nextInt();

            if (valor ==0){
                System.out.println("NULO");
            }
            else {
                if (valor % 2 == 0){
                    System.out.println("PAR");
                }
                else {
                    System.out.println("IMPAR");
                }
                if (valor > 0){
                    System.out.println("POSITIVO");
                }
                else {
                    System.out.println("NEGATIVO");
                }
            }

        }
        sc.close();

    }
}
