package lista2;

public class Exercicio4 {
	public static void main(String args[]){
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int numero1 = 0, numero2 = 0;
		System.out.println("Digite um valor inteiro para o num1: ");
		numero1 = leitor.nextInt();
		System.out.println("Digite um valor inteiro para o num2: ");
		numero2 = leitor.nextInt();
		leitor.close();
		Multiplo(numero1,numero2);
	}

	public static void Multiplo(int numero1, int numero2){
		if(numero1 % numero2 == 0)
			System.out.println("Os numeros são multimos!");
		else
			System.out.println("Não são multiplos!");
	}
}