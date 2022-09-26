import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b;

		do {
			System.out.printf("\nDigite um valor qualquer: ");
			a = ler.nextInt();

			System.out.printf("\nDigite um valor qualquer: ");
			b = ler.nextInt();

			if (a == b)
				System.out.printf("\nDigite dois valores distintos.\n");

		} while (a == b);

		if (a > b)
			System.out.printf("O menor valor é %d", b);

		else
			System.out.printf("O menor valor é %d", a);

	}
}
