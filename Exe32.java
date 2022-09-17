import java.util.Scanner;

public class Exe32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
	       
        int num1, num2;
        
        System.out.printf("Digite um número: ");
        num1 = ler.nextInt();
        
        do {
       
    	System.out.printf("Digite outro número maior que %d: ", num1);
        num2 = ler.nextInt();
        
        } while(num2 <= num1);
        
        System.out.printf("\nPrimeiro Número: %d\nSegundo Número: %d", num1,num2);

	}

}
