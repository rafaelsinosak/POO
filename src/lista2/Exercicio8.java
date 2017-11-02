package lista2;

public class Exercicio8 {
	public static void main(String[] args){
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int telCript[] = new int[4], telDescript[] = new int[4];
		System.out.println("Digite o número de telefone que deseja criptografar: ");
		for(int i=0; i<4;i++){
			System.out.printf("Digite o %d digito: ",i+1);
			telCript[i] = leitor.nextInt();
		}
		System.out.println("Digite o número de telefone que deseja Descriptografar: ");
		for(int i =0; i<4;i++){
			System.out.printf("Digite o %d digito: ",i+1);
			telDescript[i] = leitor.nextInt();
		}
		leitor.close();
		Criptografia(telCript);
		Descriptografia(telDescript);
	}

	public static void Criptografia(int telCript[]){
		int aux = 0;
		for(int i = 0; i<4;i++)
			telCript[i] = (telCript[i]+7)%10;

		for (int i = 0; i<4; i++){
			if (i==0){
				aux = telCript[2];
				telCript[2] = telCript[i];
				telCript[i] = aux;
			}
			if (i == 1 ){
				aux = telCript[3];
				telCript[3] = telCript[i];
				telCript[i] = aux;
			}
		}
		System.out.printf("Número Criptografado: %d%d%d%d ",telCript[0],telCript[1], telCript[2], telCript[3]);
	}

	public static void Descriptografia(int telDescript[]){
		for(int i=0; i<4;i++){
			telDescript[i] = telDescript[i] -7;
			if(telDescript[i]%10<0)
				telDescript[i] = 10+telDescript[i]%10;
			else
				telDescript[i] %=10;
		}
		System.out.printf("Numero Descriptografado: %d%d%d%d ",telDescript[2],telDescript[3],telDescript[0],telDescript[1]);
	}
}