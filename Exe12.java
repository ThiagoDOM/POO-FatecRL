import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, area;

		System.out.printf("Digite o valor da base: \n");
		a = ler.nextInt();

		System.out.printf("Digite o valor da altura: \n");
		b = ler.nextInt();

		area = a * b;

		if (area > 100)
			System.out.printf("Terreno Grande.\n");

		else
			System.out.printf("Terreno pequeno. \n");

	}

}
