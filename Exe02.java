import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, area;

		System.out.printf("Digite o valor da aresta do quadrado: \n");
		a = ler.nextInt();

		area = a * a;

		System.out.printf("A area do quadrado é: %d. \n", area);

	}
}
