import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double A, B, C;

        System.out.printf("Digite um valor: ");
        A = ler.nextDouble();

        System.out.printf("Digite um valor: ");
        B = ler.nextDouble();

        System.out.printf("Digite um valor: ");
        C = ler.nextDouble();

        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            if ((A * A) == ((B * B) + (C * C)) || (B * B) == ((A * A) + (C * C)) || (C * C) == ((B * B) + (A * A))) {
                System.out.printf("É um triangulo retângulo");
            } else
                System.out.printf("Não é um triangulo retângulo");

        } else {
            System.out.printf("Não é um triangulo");
        }

    }
}