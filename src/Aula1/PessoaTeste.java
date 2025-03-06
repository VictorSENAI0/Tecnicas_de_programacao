package Aula1;

import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Endereco end = new Endereco();
		Pessoa pessoa = new Pessoa();
		Scanner scan = new Scanner(System.in);
		pessoa.setEndereco(end);//se isso não for feito, não haveria ponteiro apontando para a classe Endereço, e ele retornaria um erro dizendo que está nulo

		System.out.println("Qual o nome da pessoa?");
		String p = scan.nextLine();
		pessoa.setNome(p);
		
		System.out.println("Qual o nome da rua?");
		String rua = scan.nextLine();
		pessoa.getEndereco().setRua(rua);
		
		System.out.println("Qual o número da casa/apartamento?");
		int n = scan.nextInt();
		pessoa.getEndereco().setNumero(n);
		
		System.out.println("Pessoa: "+pessoa.getNome());
		System.out.println("Rua: "+pessoa.getEndereco().getRua());
		System.out.println("Rua: "+pessoa.getEndereco().getNumero());
		
		scan.close();
	}

}
