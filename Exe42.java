import java.util.Scanner;

public class Exe42 {

  public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 Scanner ler = new Scanner(System.in);
    
    int n=0;
    float soma;
    
    do {
    	 System.out.printf("Digite a quantidade da sequencia:");
    	 n = ler.nextInt();
    } while(n<1 || n>=50);
    
    for (int i = 0; i < n; i++) {
    	soma = (float)(i+1)/(i+2);
    	System.out.printf("%dº valor: %.4f\n", i + 1, soma);
    }
  }
}