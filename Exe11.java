import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, area;

		System.out.printf("Digite o valor da base: \n");
		a = ler.nextInt();

		System.out.printf("Digite o valor da altura: \n");
		b = ler.nextInt();

		area = a * b;

		if (area > 100)
			System.out.printf("Terreno Grande.\n área= %d \n", area);

		else
			System.out.printf("Área de: %d m2 \n", area);

	}

}
