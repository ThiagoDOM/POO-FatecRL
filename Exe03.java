import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, area;

		System.out.printf("Digite o valor da base do triângulo: \n");
		a = ler.nextInt();

		System.out.printf("Digite o valor da altura do triângulo: \n");
		b = ler.nextInt();

		area = (a * b) / 2;

		System.out.printf("A area do triângulo é: %d \n", area);

	}
}
