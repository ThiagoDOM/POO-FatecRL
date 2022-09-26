import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double acel, vI, tP, vF;
        System.out.println(
                "Todas as métricas serão utilizadas em segundos, ou seja,\nm/s2 = metros por segundos ao quadrado\nm/s = metros por segundos\nt/s = tempo em segundos\nAs perguntas seguem exatamente estas ordens\n");
        System.out.printf("Digite a aceleração: ");
        acel = ler.nextDouble();

        System.out.printf("Digite a velocidade inicial: ");
        vI = ler.nextDouble();

        System.out.printf("Digite o tempo do percurso: ");
        tP = ler.nextDouble();

        vF = vI + acel * tP;

        if (vF > 0 && vF <= 40) {
            System.out.println("Veículo muito lento");
            System.out.printf("Velocidade do veículo: %.2f", vF);
        } else if (vF > 40 && vF <= 60) {
            System.out.println("Velocidade permitida");
            System.out.printf("Velocidade do veículo: %.2f", vF);
        } else if (vF > 60 && vF <= 80) {
            System.out.println("Velocidade de Cruzeiro");
            System.out.printf("Velocidade do veículo: %.2f", vF);
        } else if (vF > 80 && vF <= 120) {
            System.out.println("Veículo rápido");
            System.out.printf("Velocidade do veículo: %.2f", vF);
        } else if (vF > 120) {
            System.out.println("Veículo muito rápido");
            System.out.printf("Velocidade do veículo: %.2f", vF);
        } else {
            System.out.println("Veículo parado");
            System.out.printf("Velocidade do veículo: %.2f", vF);
        }
    }
}