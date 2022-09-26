import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;

        System.out.printf("Digite um valor: ");
        a = ler.nextInt();
        System.out.printf("Digite um valor: ");
        b = ler.nextInt();
        System.out.printf("Digite um valor: ");
        c = ler.nextInt();

        if (a < b && a < c && b < c) {
            System.out.printf("Os números em ordem crescente %d, %d, %d", a, b, c);
        } else if (a < b && a > c) {
            System.out.printf("Os números em ordem crescente %d, %d, %d", c, a, b);
        } else if (b < a && b < c && a > c) {
            System.out.printf("Os números em ordem crescente %d, %d, %d", b, c, a);
        } else if (c < a && c < b && b > c) {
            System.out.printf("Os números em ordem crescente %d, %d, %d", c, b, a);
        } else if (b < a && a < c) {
            System.out.printf("Os números em ordem crescente %d, %d, %d", b, a, c);
        } else {
            System.out.printf("Os números são iguais.");
        }
    }
}