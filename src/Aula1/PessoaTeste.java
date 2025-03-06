package Aula1;

import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Endereco end = new Endereco();
		Pessoa pessoa = new Pessoa();
		Scanner scan = new Scanner(System.in);
		pessoa.setEndereco(end);//se isso n�o for feito, n�o haveria ponteiro apontando para a classe Endere�o, e ele retornaria um erro dizendo que est� nulo

		System.out.println("Qual o nome da pessoa?");
		String p = scan.nextLine();
		pessoa.setNome(p);
		
		System.out.println("Qual o nome da rua?");
		String rua = scan.nextLine();
		pessoa.getEndereco().setRua(rua);
		
		System.out.println("Qual o n�mero da casa/apartamento?");
		int n = scan.nextInt();
		pessoa.getEndereco().setNumero(n);
		
		System.out.println("Pessoa: "+pessoa.getNome());
		System.out.println("Rua: "+pessoa.getEndereco().getRua());
		System.out.println("Rua: "+pessoa.getEndereco().getNumero());
		
		scan.close();
	}

}
