package lista2;

public class Exercicio3 {
	public static void main(String args[]){
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int[] cadeia = new int[5];
		for(int i = 0;i<5;i++){
			System.out.printf("Digite um valor inteiro para o numero %d: ",i + 1,"\n");
			cadeia[i] = leitor.nextInt();
		}
		leitor.close();
		MaiorMenor(cadeia);

	}
	public static void MaiorMenor(int cadeia[]){
		int maior = cadeia[0], menor = cadeia[0];
		for(int i = 1; i<cadeia.length;i++){
			if(menor > cadeia[i])
				menor = cadeia[i];
			if(maior < cadeia[i])
				maior = cadeia[i];
		}
		System.out.printf("Maior: %d\n",maior);
		System.out.printf("Menor: %d\n",menor);
	}
}