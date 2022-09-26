import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float a, b, c, d, media;

		System.out.printf("Digite o Primeiro valor: \n");
		a = ler.nextFloat();

		System.out.printf("Digite o Segundo valor: \n");
		b = ler.nextFloat();

		System.out.printf("Digite o Terceiro valor: \n");
		c = ler.nextFloat();

		System.out.printf("Digite o Quarto valor: \n");
		d = ler.nextFloat();

		media = (a + b + c + d) / 4;

		System.out.printf("A media dos quatro valores é: %.2f \n", media);
	}

}
