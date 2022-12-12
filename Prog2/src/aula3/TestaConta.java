package aula3;

public class TestaConta {
	
	public static void main(String[] args) {
	
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.numero = 900;
		c1.saldo = 10.0;
		c1.limite = 100.0;
		c1.titular = new Cliente();
		c1.titular.nome = "Hugo";
		c1.titular.sobrenome = "Kuribayashi";
		c1.titular.email = "hugo@unifesspa.edu.br";
				
		System.out.println(c1);
				
		c1.saca(50.00);
		c1.deposita(60.00);
		c1.saca(30.00);
		
		c1.transfere(20, c2);
		
	}
}
