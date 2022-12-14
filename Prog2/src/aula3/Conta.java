package aula3;

public class Conta {
	public int numero;
	public double saldo;
	public double limite;
	public Cliente titular;
	
	
	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque Efetuado "+valor);
			return true;
		}else {
			System.out.println("Saque não Efetuado");
			return false;
		}
	}
	
	public void deposita(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
			System.out.println("Depósito Efetuado.");
		} else {
			System.out.println("Erro no Depósito.");
		}
	}
	
	@Override
	public String toString() {
		return "Conta [Numero = " +this.numero +
				" Saldo = " +this.saldo +
				" Limite = " +this.limite + "]";
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println("Transferência Efetuada de "+valor +"R$.");
			return true;
		}else {
			System.out.println("Transferência não Efetuada.");
			return false;
		}
	}
	
	
	
}
