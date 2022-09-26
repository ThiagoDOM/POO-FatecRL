import java.util.Scanner;

public class Exe49 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int soma = 0, numinic, numfim;

    System.out.printf("Digite o numero inicial: ");
    numinic = ler.nextInt();
    System.out.printf("Digite o numero final: ");
    numfim = ler.nextInt();
    while (numfim <= numinic) {
      System.out.printf("O numero final deve ser maior que o inicial: ");
      numfim = ler.nextInt();
    }
    for (int i = numinic; i <= numfim; i++) {
      soma += i;
    }
    System.out.printf("A soma da sequencia de numeros entre %d e %d: %d", numinic, numfim, soma);
  }
}
