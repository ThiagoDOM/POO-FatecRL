import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double p, h, imc;

		System.out.printf("Digite o seu peso: ");
		p = ler.nextDouble();

		System.out.printf("Digite a sua altura: ");
		h = ler.nextDouble();

		imc = p / (h * h);

		System.out.printf("Seu imc é: %.1f kg/m²\n", imc);

		if (imc < 18.5)
			System.out.printf("Abaixo do peso");
		else if (imc < 25)
			System.out.printf("Peso normal");
		else if (imc < 30)
			System.out.printf("Sobrepeso");
		else if (imc < 35)
			System.out.printf("Obesidade grau 1");
		else if (imc < 40)
			System.out.printf("Obesidade grau 2");
		else
			System.out.printf("Obesidade grau 3");

	}
}
