import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1;

        System.out.printf("Digite um valor: ");
        n1 = ler.nextDouble();

        if (n1 % 2 == 0) {
            System.out.printf("Par");
        } else {
            System.out.printf("Impar");
        }
    }
}
