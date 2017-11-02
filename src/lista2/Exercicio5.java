package lista2;

public class Exercicio5 {
	public static void main(String[] args){
		int numeroConta, salInicioMes,itens,credito,creditoLimite;
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		System.out.println("Todos os valores devem ser apenas inteiros!");
		System.out.printf("Digite o número da conta: ");
		numeroConta = leitor.nextInt();
		System.out.printf("Digite o saldo no inicio do mês :");
		salInicioMes = leitor.nextInt();
		System.out.printf("Total de todos os itens cobrados nesse mês: ");
		itens = leitor.nextInt();
		System.out.printf("Total de créditos aplicados ao cliente nesse mês: ");
		credito = leitor.nextInt();
		System.out.printf("Digite o limite de crédito autorizado");
		creditoLimite = leitor.nextInt();
		leitor.close();
		Conta(numeroConta,salInicioMes,itens,credito,creditoLimite);
	}

	public static void Conta(int numeroConta, int salInicioMes, int itens, int credito, int creditoLimite){
		int novoSaldo = salInicioMes + itens - credito;
		if(novoSaldo <= creditoLimite)
			System.out.println("O credito não foi excedido");
		else
			System.out.println("O credito foi excedido! ");
	}
}
