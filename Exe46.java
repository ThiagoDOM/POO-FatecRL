import java.util.Scanner;

public class Exe46 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner ler = new Scanner(System.in);
    char continuar = 's';
    do {
      float[] num = new float[20];
      int n = 0, qtd_pos = 0, qtd_neg = 0;
      float sum = 0, avg, bigger = 0, smaller = 0, pc_neg, pc_pos;

      do {
        System.out.printf("Digite a quantidade da sequencia, positivo e menor que 20:");
        n = ler.nextInt();
      } while (n < 1 || n >= 20);

      for (int i = 0; i < n; i++) {
        System.out.printf("Digite o %dº nº:", i + 1);
        num[i] = ler.nextFloat();
      }

      for (int i = 0; i < n; i++) {
        sum += num[i];
        if (i == 0) {
          bigger = num[i];
          smaller = num[i];
        }

        if (num[i] > bigger) {
          bigger = num[i];
        }

        if (num[i] < smaller) {
          smaller = num[i];
        }

        if (num[i] > 0)
          qtd_pos++;

        if (num[i] < 0)
          qtd_neg++;

      }
      avg = sum / n;

      pc_pos = (qtd_pos * 100) / n;
      pc_neg = (qtd_neg * 100) / n;

      System.out.printf(
          "O maior valor: %.2f:\nO menor valor: %.2f:\nA soma dos valores: %.2f\nA média aritmetica: %.2f\n", bigger,
          smaller, sum, avg);
      System.out.printf("A %% de valores positivos é: %.2f\nA %% de valores negativos é: %.2f\n", pc_pos, pc_neg);

      System.out.printf("\n Deseja Continuar?(s/n): ");
      continuar = ler.next().charAt(0);
    } while (continuar == 's' || continuar == 'S');
  }
}