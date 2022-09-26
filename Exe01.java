import java.util.Scanner;
public class Exe01 {
    public static void main(String[] Args){
        Scanner ler = new Scanner(System.in);
        double a, b, area;
		
		System.out.printf("Digite o valor da base do retangulo: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor da altura do retangulo: ");
		b = ler.nextDouble();
		
		area = a * b;
		
		System.out.printf("A área do Retangulo é: %d ", area);

    }
}
