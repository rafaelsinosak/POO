package lista1.estruturaselecao;

import java.util.Scanner;

public class CFor {
	public static void main(String args[]){
		Scanner leitor = new java.util.Scanner(System.in);
		boolean executar = true;
		while(executar){
			System.out.println("Calculadora basica. Para fazer calculos com apenas dois numeros");
			System.out.println("Digite a opção que você deseja: ");
			System.out.println("1 - SOMA");
			System.out.println("2 - SUBTRAÇÃO");
			System.out.println("3 - MULTIPLICAÇÃO");
			System.out.println("4 - DIVISÃO");
			System.out.println("5 - SAIR");
			int opcao = leitor.nextInt();
			if (opcao == 1){
				System.out.println("Digite o valor do numero 1: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o valor do numero 2: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1+numero2);
			}
			if(opcao == 2){
				System.out.println("Digite o valor do numero 2: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o valor do numero 2: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1-numero2);
			}
			if(opcao == 3){
				System.out.println("Digite o valor do numero 1: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o valor do numero 2: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n", numero1*numero2);
			}
			if(opcao == 4){
				System.out.println("Digite o valor do numero 1: ");
				int numero1 = leitor.nextInt();
				System.out.println("Digite o valor do numero 2: ");
				int numero2 = leitor.nextInt();
				System.out.printf("Resultado %d\n", numero1/numero2);
			}
			if(opcao ==5){
				executar = false;
			}
		}
	}
}