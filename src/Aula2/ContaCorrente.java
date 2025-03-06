package Aula2;

public class ContaCorrente implements Conta {
	
	private float saldo;

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public void depositar(float valor) {
		if(valor<=0) {
			System.out.println("Por favor, entre um valor maior que zero.");
		} else {
			saldo = saldo + valor;
			System.out.println("O valor "+valor+" foi depositado na conta!");
		}
	}
	
	@Override
	public boolean sacar(float valor) {
		if(valor<saldo) {
			System.out.println("Saldo insuficiente.");
			return false;
		} else {
			System.out.println("Saque realizado com sucesso!");
		    return true;
		}
	}
}
