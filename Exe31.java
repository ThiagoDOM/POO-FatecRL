import java.util.Scanner;

public class Exe31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
	       
        int num = -1;
        
        do {
       
        System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();
        
        } while(num < 1);
        
        System.out.printf("O Valor Digitado foi: %d", num);

	}

}
