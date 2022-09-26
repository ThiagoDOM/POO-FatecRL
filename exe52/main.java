package exe52;

import java.util.Scanner;


public class main {

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
		       
	        Produto[] listaProduto = new Produto[10];

	        for (int i=0; i<=1; i++) {
	            Produto p = new Produto();
	           
	            System.out.printf("Digite o id do produto: ");
	            p.id = ler.nextInt();
	            System.out.printf("Digite a descricao do produto: ");
	            p.descricao = ler.next();
	            System.out.printf("Digite o valor do produto: ");
	            p.valor = ler.nextDouble();
	            System.out.printf("Digite a quantidade do produto: ");
	            p.quantidade = ler.nextInt();
	   
	            listaProduto[i] = p;            
	        }
	       
	        for (int i=0; i<=1; i++) {
	        	if(listaProduto[i].valor < 100)
	        		System.out.printf("\nProduto %d criado com sucesso\nDescricao: %s\nValor: %f\nQuantidade: %d\n\n", listaProduto[i].id, listaProduto[i].descricao, listaProduto[i].valor, listaProduto[i].quantidade);
	        }

		}

	}

	


