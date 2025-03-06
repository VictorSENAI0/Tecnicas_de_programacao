package Aula1;

public class Aluno extends Pessoa{
     private int serie;

	public Aluno(String nome, Endereco endereco, int idade, int telefone) {
		super(nome, endereco, idade, telefone);
	}

	public Aluno(String nome, Endereco endereco) {
		super(nome, endereco);
	}

	public Aluno(String nome, int idade, int telefone) {
		super(nome, idade, telefone);
	}

	
}
