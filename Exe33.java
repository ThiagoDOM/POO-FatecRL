import java.util.Scanner;

public class Exe33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
	       
        char sexo;
        
        do {
       
    	System.out.printf("Digite seu sexo (f,m): ");
    	 sexo = ler.next().charAt(0);
        
        } while(sexo != 'f' && sexo != 'm');
        
        System.out.printf("\nSeu sexo: %c", sexo);

	}

}
