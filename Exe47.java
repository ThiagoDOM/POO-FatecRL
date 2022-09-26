import java.util.Scanner;

public class Exe47 {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    char continuar;
    do {
      int n = 0, total = 1;
      System.out.printf("Qual numero deseja o fatorial?: ");
      n = ler.nextInt();
      while (n < 1) {
        System.out.printf("Valor invalido! insira um numero maior que 1: ");
        n = ler.nextInt();
      }
      for (int i = n; i > 0; i--) {
        total *= i;
      }
      System.out.printf("fatorial foi de %d foi: %d\n", n, total);
      System.out.printf("Deseja continuar? (s/n): ");
      continuar = ler.next().charAt(0);
    } while (continuar == 's' || continuar == 'S');
  }
}
