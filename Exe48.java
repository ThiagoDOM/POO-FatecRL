import java.util.Scanner;

public class Exe48 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.printf("Digite um numero: ");
    int n = ler.nextInt();
    for (int i = 1; i < 21; i++) {
      System.out.printf("%d\n", n + i);
    }
  }
}
