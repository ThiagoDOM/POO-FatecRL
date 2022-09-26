import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double cotacao, dolares, reais;
		
		System.out.printf("Digite a cotacao do dolar: ");
		cotacao = ler.nextDouble();
		
		System.out.printf("Digite os dolares que desaja transformar em reais: ");
		dolares = ler.nextDouble();
		
		reais = cotacao*dolares;
		
		System.out.printf("Ficam %.2f reais.", reais);

	}

}
