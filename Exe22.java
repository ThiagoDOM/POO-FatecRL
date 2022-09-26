
import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opc = 0;
        double b, a, result;
        while (opc != 5) {

            System.out.printf("\n1-Triângulo\n2-Quadrado\n3-Retângulo\n4-Círculo\n5-Sair\nEscolha uma opção: ");
            opc = ler.nextInt();

            switch (opc) {
                case 1:
                    System.out.printf("\nDigite a base: ");
                    b = ler.nextDouble();
                    System.out.printf("\nDigite a altura: ");
                    a = ler.nextDouble();
                    result = (a * b) / 2;
                    System.out.printf("O resultado final é: %.2f", result);
                    break;
                case 2:
                    System.out.printf("\nDigite a altura: ");
                    a = ler.nextDouble();
                    result = a * a;
                    System.out.printf("O resultado final é: %.2f", result);
                    break;
                case 3:
                    System.out.printf("\nDigite a base: ");
                    b = ler.nextDouble();
                    System.out.printf("\nDigite a altura: ");
                    a = ler.nextDouble();
                    result = a * b;
                    System.out.printf("O resultado final é: %.2f", result);
                    break;
                case 4:
                    System.out.printf("\nDigite o raio do círculo: ");
                    b = ler.nextDouble();
                    result = Math.pow(b, 2) * Math.PI;
                    System.out.printf("O resultado final é: %.2f", result);
                    break;
                case 5:
                    System.out.printf("Saindo...\n");
                    break;
                default:
                    System.out.printf("Opção invalida!\n");
            }
        }
    }
}
