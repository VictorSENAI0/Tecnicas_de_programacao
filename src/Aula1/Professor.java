package Aula1;

public class Professor extends Pessoa{
    private int salaQueDaAula;

    public Professor() {}
    
	public Professor(int salaQueDaAula) {
		super();
		this.salaQueDaAula = salaQueDaAula;
	}

	public int getSalaQueDaAula() {
		return salaQueDaAula;
	}

	public Professor(String nome, Endereco endereco, int idade, int telefone) {
		super(nome, endereco, idade, telefone);
		// TODO Auto-generated constructor stub
	}

	public Professor(String nome, Endereco endereco) {
		super(nome, endereco);
		// TODO Auto-generated constructor stub
	}

	public Professor(String nome, int idade, int telefone) {
		super(nome, idade, telefone);
		// TODO Auto-generated constructor stub
	}

	public void setSalaQueDaAula(int salaQueDaAula) {
		this.salaQueDaAula = salaQueDaAula;
	}
    
    
}
