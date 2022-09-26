import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double peso, altura, imc;
        String sexo;

        System.out.printf("Digite o seu peso: ");
        peso = ler.nextDouble();

        System.out.printf("Digite sua altura: ");
        altura = ler.nextDouble();

        System.out.printf("\n M = Masculino \n F = Feminino \nDigite seu sexo: ");
        sexo = ler.next();

        imc = peso / (altura * altura);

        switch (sexo) {
            case "M":
                if (imc < 20)
                    System.out.printf("Abaixo do peso");
                else if (imc >= 20 && imc < 25)
                    System.out.printf("Peso ideal");
                else if (imc >= 25)
                    System.out.printf("Acima do Peso");
                break;
            case "F":
                if (imc < 19)
                    System.out.printf("Abaixo do peso");
                else if (imc >= 19 && imc < 24)
                    System.out.printf("Peso ideal");
                else if (imc >= 24)
                    System.out.printf("Acima do Peso");
                break;
            default:
                System.out.printf("Não é a opção correta.");
                break;
        }

    }
}