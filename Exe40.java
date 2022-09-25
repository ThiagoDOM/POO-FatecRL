
public class Exe40 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] aux = new int[30];
    int soma;
    for (int i = 0; i < 20; i++) {
      if (i > 2) {
        soma = aux[i - 3] + aux[i - 2] + aux[i - 1];
        aux[i] = soma;
      } else {
        aux[i] = 1;
        soma = 1;
      }

      System.out.printf("%dº valor: %d\n", i + 1, soma);
    }
  }
}