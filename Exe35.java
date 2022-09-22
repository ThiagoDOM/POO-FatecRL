import java.util.Scanner;

public class Exe35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int num = -1;

	    do {
	        System.out.printf("Digite um número positivo: ");
	        num = ler.nextInt();
	        } while(num < 1);
	        
		for(int i = 0; i<10;i++) {
			System.out.printf("%d x %d = %d\n",num, i+1, num*(i+1));
		}
	}

}
