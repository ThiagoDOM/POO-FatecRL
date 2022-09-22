import java.util.Scanner;

public class Exe37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		for(int i = 0; i<10;i++) {
			System.out.printf("20 x %d = %d\n", i+1, 20*(i+1));
			 System.out.printf("Digite qualquer botao para continuar...");
			ler.nextLine();
		}
	}

}
