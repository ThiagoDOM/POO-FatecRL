import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double v1, v2, v3;

        System.out.printf("Digite um valor: ");
        v1 = ler.nextDouble();

        System.out.printf("Digite um valor: ");
        v2 = ler.nextDouble();

        System.out.printf("Digite um valor: ");
        v3 = ler.nextDouble();

        if ((v1 < v2 + v3) && (v2 < v1 + v3) && (v3 < v1 + v2)) {
            if (v1 == v2 && v1 == v3) {
                System.out.println("Triangulo Equilatero");
            } else if ((v1 == v2) || (v1 == v3)) {
                System.out.println("Triangulo Isosceles");
            } else
                System.out.println("Triângulo Escaleno");

        } else {
            System.out.printf("Não é um triangulo");
        }

    }
}