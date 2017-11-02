package lista2;

public class Exercicio6 {
	public static void main(String[] args){
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int qtd;
		double total;
		System.out.println("Digite a qtd de itens vendidos na última semana: ");
		qtd = leitor.nextInt();
		System.out.println("Digite o valor total de suas vendas na última semana: ");
		total = leitor.nextDouble();
		leitor.close();

		Rendimento(qtd,total);
	}
	public static void Rendimento(int qnt, double total){
		System.out.printf("Salário dessa semana: %.2f",200+(total*0.09));
	}
}
