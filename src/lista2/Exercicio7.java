package lista2;

public class Exercicio7 {
	public static void main(String args[]){
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int horas;
		double valor;
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horas = leitor.nextInt();
		System.out.println("Digite o valor que recebe por horas trabalhadas: ");
		valor = leitor.nextDouble();

		Salario(horas,valor);
	}

	public static void Salario (int horas, double valor){
		double sal = 0, aux = 0;
		if ( horas <= 40)
			System.out.printf("Salario final: %.2f",valor*horas);
		else{
			aux+=40*valor;
			horas-=40;
			sal+=(valor * 0.50+valor)*horas;
			System.out.printf("Sálario final: %.2f",sal+aux);
		}
	}
}