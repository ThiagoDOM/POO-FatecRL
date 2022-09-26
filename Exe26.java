import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1;

        System.out.printf("Digite um valor: ");
        n1 = ler.nextDouble();

        if (n1 > 0) {
            n1 = n1 * 2;
            System.out.printf("%.2f", n1);
        } else if (n1 < 0) {
            n1 = n1 * 3;
            System.out.printf("%.2f", n1);
        } else {
            System.out.printf("Seu número é: %.2f", n1);
        }
    }
}
