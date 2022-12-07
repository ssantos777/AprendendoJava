package aula1;

public class Exemplo {
	
	/* executa primeiro por causa do main. */
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.cor = "Vermelho";
		c1.modelo = "Gol";
		c1.ligaCarro();
		
		Carro c2 = new Carro();
		c2.cor = "Preto";
		c2.modelo = "Palio";
		c2.ligaCarro();
		c2.desligaCarro();
		
	}
}
