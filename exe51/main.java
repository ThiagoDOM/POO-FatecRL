package exe48;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	       
        Pessoa[] listaPessoas = new Pessoa[5];

        for (int i=0; i<5; i++) {
            Pessoa p = new Pessoa();
           
            System.out.printf("Digite o id da pessoa: ");
            p.id = ler.nextInt();
            System.out.printf("Digite o nome da pessoa: ");
            p.nome = ler.next();
            System.out.printf("Digite a idade da pessoa: ");
            p.idade = ler.nextInt();
            System.out.printf("Digite o email da pessoa: ");
            p.email = ler.next();
   
            listaPessoas[i] = p;            
        }
       
        for (int i=0; i<5; i++) {
        	if(listaPessoas[i].idade > 18)
        		System.out.printf("\nPessoa %d criada com sucesso\nNome: %s\nIdade: %d\nEmail: %s\n\n", listaPessoas[i].id, listaPessoas[i].nome, listaPessoas[i].idade, listaPessoas[i].email);
        }

	}

}
