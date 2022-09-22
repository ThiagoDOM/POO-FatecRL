import java.util.Scanner;

public class Exe36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int num = -1, a, b;
		

	    do {
	        System.out.printf("Digite um número positivo: ");
	        num = ler.nextInt();
	        } while(num < 1);
	    
	    System.out.printf("Digite o primeiro número do intervalo: ");
        a = ler.nextInt();
        
        do {
	        System.out.printf("Digite o segundo número do intervalo, maior que %d: ", a);
	        b = ler.nextInt();
	        } while(b < a);
	        
		for(int i = b; i>=a;i--) {
			System.out.printf("%d x %d = %d\n",num, i, num*(i));
		}
	}

}
