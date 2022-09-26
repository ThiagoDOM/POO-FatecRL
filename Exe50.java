import java.util.Scanner;

public class Exe50 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int numinic, numfim;

    System.out.printf("Digite o numero inicial: ");
    numinic = ler.nextInt();
    System.out.printf("Digite o numero final: ");
    numfim = ler.nextInt();

    while (numfim <= numinic) {
      System.out.printf("O numero final deve ser maior que o inicial: ");
      numfim = ler.nextInt();
    }
    System.out.printf("Os numeros pares inteiros maiores que 10 entre %d e %d são:\n", numinic, numfim);
    for (int i = numinic; i <= numfim; i++) {
      if (i > 10 && (i % 2) == 0) {
        System.out.printf("%d\n", i);
      }
    }
  }
}
