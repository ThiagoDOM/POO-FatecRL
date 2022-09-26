import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double med, p1, p2;

        System.out.println("Coloque o valor da P1: ");
        p1 = ler.nextDouble();

        System.out.println("Coloque o valor da P2: ");
        p2 = ler.nextDouble();

        med = (p1 + (2 * p2)) / 3;

        if (med >= 5) {
            System.out.println("Aprovado");
            System.out.printf("Valor da média: %.2f", med);
        } else {
            System.out.println("Reprovado");
            System.out.printf("Valor da média: %.2f", med);
        }
    }
}
