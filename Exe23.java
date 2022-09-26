import java.util.Scanner;

public class Exe23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a, b, c, r;
        System.out.printf("Digite o primeiro valor: ");
        a = ler.nextDouble();
        System.out.printf("Digite o segundo  valor: ");
        b = ler.nextDouble();
        System.out.printf("Digite o terceiro valor: ");
        c = ler.nextDouble();

        if (a + b < c) {
            r = a + b;
            System.out.printf("O valor %.2f é menor que o valor %.2f", r, c);
        } else if (a + b > c) {
            r = a + b;
            System.out.printf("O valor %.2f é maior que o valor %.2f", r, c);
        } else {
            System.out.printf("Os valores são iguais");
        }

    }
}
