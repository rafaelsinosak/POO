package lista1.classe;

public class Aluno extends Pessoa {
	public int numeroMatricula;
	public String turma;
	public Aluno(String nome, int numeroMatricula, String turma){
		super(nome);
		this.numeroMatricula = numeroMatricula;
		this.turma = turma;
	}
}
