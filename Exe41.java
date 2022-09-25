import java.util.Scanner;

public class Exe41 {

  public static void main(String[] args) {
	// TODO Auto-generated method stub
		  Scanner ler = new Scanner(System.in);
	    
	    int n=0;
	    
	    do {
	    	 System.out.printf("Digite a quantidade da sequencia:");
	    	 n = ler.nextInt();
	    } while(n<1 || n>=100);
	    
	    int[] aux = new int[n];
	    int[] soma = new int[n];
	    
	    for (int i = 0; i < n; i++) {
	        if(i==0) {
	        	aux[i] = 3;
	            soma[i] = 2;
	        }
	        else {
	        	soma[i] = aux[i-1] + soma[i-1];
	        	aux[i] = aux[i-1]+2;
	        }
	        	

	      System.out.printf("%dº valor: %d\n", i + 1, soma[i]);
	    }
  }
}