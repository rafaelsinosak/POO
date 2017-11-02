package lista2;

public class Exercicio1 {
	public static void main(String args[]){
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int numero1 = 0,numero2 = 0;
		System.out.println("Digite um valor inteiro para o numero 1: ");
		numero1 = leitor.nextInt();
		System.out.println("Digite um valor inteiro para o numero 2: ");
		numero2 = leitor.nextInt();
		Operacoes(numero1,numero2);	
	}

	public static void Operacoes(int numero1, int numero2){
		System.out.println("Soma: ");
		System.out.println(numero1+numero2);
		System.out.println("Subtração: ");
		System.out.println(numero1-numero2);
		System.out.println("Multiplicação: ");
		System.out.println(numero1*numero2);
		System.out.println("Divisão: ");
		System.out.println(numero1/numero2);
	}
}
