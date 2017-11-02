package lista2;

public class Exercicio2 {
	public static void main(String args[]){
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int numero1 = 0, numero2 = 0;
		System.out.println("Digite um valor inteiro para o numero 1: ");
		numero1 = leitor.nextInt();
		System.out.println("Digite um valor inteiro para o numero 2: ");
		numero2 = leitor.nextInt();

		Media(numero1,numero2);
	}

	public static void Media(int numero1, int numero2){
		System.out.println("Soma: ");
		System.out.println(numero1+numero2);
		System.out.println("Média: ");
		System.out.println((numero1 +numero2)/2);
		if(numero1 > numero2)
			System.out.printf("%d %d", numero1, numero2);
		else
			System.out.printf("%d %d",numero1,numero2);
	}
}
