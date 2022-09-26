import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, estad;
        char sexo;
        double anos;

        System.out.printf("Digite o seu nome: ");
        nome = ler.next();
        System.out.printf("Digite seu sexo: ");
        sexo = ler.next().charAt(0);
        System.out.printf("Digite seu estado civil: ");
        estad = ler.next();

        if (sexo == 'F' || sexo == 'f') {
            if (estad.equals("CASADA") || estad.equals("Casada") || estad.equals("casada")) {
                System.out.printf("Digite seu tempo de casada(anos): ");
                anos = ler.nextDouble();
                System.out.printf("\nNome: %s\nSexo: %c\nEstado: %s\nTempo de casada: %.1f", nome, sexo, estad, anos);
            }
        } else {
            System.out.printf("\nNome: %s\nSexo: %c\nEstado: %s", nome, sexo, estad);
        }
    }
}
