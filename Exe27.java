import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1;

        System.out.printf("Digite um valor: ");
        n1 = ler.nextDouble();

        if (n1 % 2 == 0) {
            System.out.printf("Par");
            n1 += 5;
            System.out.printf("\nA soma final é: %.2f", n1);
        } else {
            System.out.printf("Impar");
            n1 += 8;
            System.out.printf("\nA soma final é: %.2f", n1);
        }
    }
}
