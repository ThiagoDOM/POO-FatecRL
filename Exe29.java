import java.util.Scanner;

public class Exe29 {
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
            System.out.printf("Os números em ordem decrescente %d, %d, %d", c, b, a); // p1 = 1, p2 = 2, p3 = 3
        } else if (b > a && a > c) {
            System.out.printf("Os números em ordem decrescente %d, %d, %d", b, a, c);// p1 = 2, p2 = 3, p3 = 1
        } else if (a > b && b > c) {
            System.out.printf("Os números em ordem decrescente %d, %d, %d", a, b, c);// p1 = 3, p2 = 2, p3 = 1
        } else if (a > c && b < c) {
            System.out.printf("Os números em ordem decrescente %d, %d, %d", a, c, b);// p1 = 3, p2 = 1, p3 = 2
        } else if (c > a && b < a) {
            System.out.printf("Os números em ordem decrescente %d, %d, %d", c, a, b);// p1 = 2, p2 = 1, p3 = 3
        } else {
            System.out.printf("Os números são iguais.");
        }
    }
}