import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double med, p1, p2;

        System.out.println("Coloque o valor da P1: ");
        p1 = ler.nextDouble();

        med = p1 / 3;
        p2 = (15 - p1) / 2;

        System.out.printf("\nA média atual do aluno é: %.2f", med);
        System.out.printf("\nQuanto ele precisa tirar: %.2f", p2);

    }
}
