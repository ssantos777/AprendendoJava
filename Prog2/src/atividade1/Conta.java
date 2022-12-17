package atividade1;

public class Conta {
	public String titular;
	public int numero;
	public String agencia;
	public double saldo;
	public String datadeabertura;
	
	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque Efetuado "+valor);
		} else {
			System.out.println("Saque não Efetuado");
		}
	}
	
	public void depositar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
			System.out.println("Depósito Efetuado.");
		} else {
			System.out.println("Erro no Depósito.");
		}
	}
	
	public void calculaRendimento() {
		
	}
	
	public void recuperaDadosParaImpressao() {
		
	}
	
	
}
