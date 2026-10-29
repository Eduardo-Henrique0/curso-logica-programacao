import java.util.Locale;
import java.util.Scanner;

public class comerciante {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, abaixo, entre, acima;
        double totalcompra, totalvenda, totallucro, percentuallucro, lucro;

        System.out.print("Serão digitados dados de quantos produtos? ");
        n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        double[] precocompra = new double[n];
        double[] precovenda = new double[n];

        for (int i=0; i<n; i++){
            System.out.println("Produto" + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Preço da compra: ");
            precocompra[i] = sc.nextDouble();
            System.out.print("Preço de venda: ");
            precovenda[i] = sc.nextDouble();
            sc.nextLine();

        }
        abaixo = 0;
        entre = 0;
        acima = 0;

        for (int i=0; i<n; i++){
            lucro = precovenda[i] - precocompra[i];
            percentuallucro = lucro * 100 / precocompra[i];
            if (percentuallucro < 10){
                abaixo = abaixo + 1;
            }else if (percentuallucro <= 20){
                    entre = entre + 1;
            }else {
                acima = acima +1 ;
            }
        }
        totalcompra = 0;
        totalvenda = 0;

        for (int i=0; i<n; i++){
            totalcompra = totalcompra + precocompra[i];
            totalvenda = totalvenda + precovenda[i];
        }

        totallucro = totalvenda - totalcompra;

        System.out.println("RELATORIO:");
        System.out.printf("Lucro abaixo de 10%%: %d%n", abaixo);
        System.out.printf("Lucro entre 10%% e 20%%: %d%n", entre);
        System.out.printf("Lucro acima de 20%%: %d%n", acima);
        System.out.printf("Valor total de compra: %.2f%n", totalcompra);
        System.out.printf("Valor total de venda: %.2f%n", totalvenda);
        System.out.printf("Lucro total: %.2f%n", totallucro);

        sc.close();
    }
}
