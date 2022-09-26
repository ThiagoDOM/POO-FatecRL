import java.util.Scanner;

public class Exe30 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double vlProduto, desc;
        int opc;

        do {
            System.out.printf("Digite o valor do Produto: ");
            vlProduto = ler.nextDouble();
        } while (vlProduto < 0);

        System.out.printf(
                "\n1 - Em dinheiro a vista\n2 - A vista no crédito\n3 - Em duas vezes\n4 - Em quatro vezes\nDigite a opção: ");
        opc = ler.nextInt();

        switch (opc) {
            case 1:
                System.out.printf("Em dinheiro a vista...\n");
                desc = vlProduto * 0.15;
                vlProduto -= desc;
                System.out.printf("O valor a ser pago é: R$%.2f", vlProduto);
                break;
            case 2:
                System.out.printf("Em cartão de crédito á vista...\n");
                desc = vlProduto * 0.10;
                vlProduto -= desc;
                System.out.printf("O valor a ser pago é: R$%.2f", vlProduto);
                break;
            case 3:
                System.out.printf("Em duas vezes...\n");
                desc = vlProduto / 2;
                System.out.printf("O valor a ser pago é: R$%.2f, em duas vezes sem juros tendo o valor final de R$%.2f",
                        desc, vlProduto);
                break;
            case 4:
                System.out.printf("Em quatro vezes...\n");
                vlProduto += vlProduto * 0.10;
                desc = vlProduto / 4;
                System.out.printf(
                        "O valor a ser pago é: R$%.2f, em quatro vezes sem juros tendo o valor final de R$%.2f", desc,
                        vlProduto);
                break;
            default:
                System.out.printf("Opção inválida");
                break;

        }

    }
}
