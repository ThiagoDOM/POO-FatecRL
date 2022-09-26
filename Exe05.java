import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Double C, F;

		System.out.printf("Digite o valor da Temperatura em Graus Celcius (ºC): \n");
		C = ler.nextDouble();

		F = (C * 1.8) + 32;

		System.out.printf("A Temperatura equivalente em ºF é = %.2f. \n", F);
	}

}
