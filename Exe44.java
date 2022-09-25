import java.util.Scanner;

public class Exe44 {

  public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 Scanner ler = new Scanner(System.in);
    
    float[] num = new float[10];
    float aux;

    float sum=0, avg, bigger=0;
    
    for(int i=0; i<10;i++) {
      aux = 0;
      do {
    	 System.out.printf("Digite o %dº nº positivo:",i+1);
    	 aux = ler.nextFloat();
      } while(aux <= 0);
       num[i] = aux;
    } 
    
    for (int i = 0; i < 10; i++) {
      if(i == 0)
        bigger = num[i];
      else if(num[i] > bigger){
        bigger = num[i];
      }
    	sum += num[i];
    }
    avg = sum/10;

    System.out.printf("O maior valor: %.2f:\nA soma dos valores: %.2f\nA média aritmetica: %.2f", bigger, sum, avg);

  }
}