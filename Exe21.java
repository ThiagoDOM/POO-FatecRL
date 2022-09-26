import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char opc = ' ';
        double v1, v2, result;
        while (opc != '5') {
            System.out.printf("\nDigite o primeiro valor: ");
            v1 = ler.nextDouble();
            System.out.printf("\nDigite o segundo valor: ");
            v2 = ler.nextDouble();

            System.out.printf("1-Multiplicação\n2-Adição\n3-Divisão\n4-Subtração\n5-Sair\nEscolha uma opção: ");
            opc = ler.next().charAt(0);

            switch (opc) {
                case '1':
                    result = v1 * v2;
                    System.out.printf("O resultado final é: %.2f", result);
                    break;
                case '2':
                    result = v1 + v2;
                    System.out.printf("O resultado final é: %.2f", result);
                    break;
                case '3':
                    if (v1 != 0 && v2 != 0) {
                        result = v1 / v2;
                        System.out.printf("O resultado final é: %.2f", result);
                        break;
                    } else {
                        System.out.printf("\nAmigão, não foi possível dividir por zero.");
                        break;
                    }
                case '4':
                    result = v1 - v2;
                    System.out.printf("O resultado final é: %.2f", result);
                    break;
                case '5':
                    System.out.printf("Saindo...\n");
                    break;
                default:
                    System.out.printf("Opção invalida!\n");
            }
        }
    }
}
