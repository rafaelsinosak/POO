package lista2;

public class Exercicio5 {
	public static void main(String[] args){
		int numeroConta, salInicioMes,itens,credito,creditoLimite;
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		System.out.println("Todos os valores devem ser apenas inteiros!");
		System.out.printf("Digite o n�mero da conta: ");
		numeroConta = leitor.nextInt();
		System.out.printf("Digite o saldo no inicio do m�s :");
		salInicioMes = leitor.nextInt();
		System.out.printf("Total de todos os itens cobrados nesse m�s: ");
		itens = leitor.nextInt();
		System.out.printf("Total de cr�ditos aplicados ao cliente nesse m�s: ");
		credito = leitor.nextInt();
		System.out.printf("Digite o limite de cr�dito autorizado");
		creditoLimite = leitor.nextInt();
		leitor.close();
		Conta(numeroConta,salInicioMes,itens,credito,creditoLimite);
	}

	public static void Conta(int numeroConta, int salInicioMes, int itens, int credito, int creditoLimite){
		int novoSaldo = salInicioMes + itens - credito;
		if(novoSaldo <= creditoLimite)
			System.out.println("O credito n�o foi excedido");
		else
			System.out.println("O credito foi excedido! ");
	}
}
