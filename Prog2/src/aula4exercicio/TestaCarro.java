package aula4exercicio;

public class TestaCarro {
	
	public static void main(String[] args) {
		
		Motor m1 = new Motor(3.0, "8V");
		
		System.out.println(m1.tipo);
		System.out.println(m1.potencia);
		System.out.println(m1.taLigado);
		
		Motor m2 = new Motor();
		
		System.out.println(m2.tipo);
		System.out.println(m2.potencia);
		System.out.println(m2.taLigado);
		
		Carro c1 = new Carro();
		
		c1.detalhes();
		
		Motor novoMotor = new Motor(2.0, "12V");
		Carro c2 = new Carro("Azul", "Subaru", 220.0, novoMotor);
		
		c2.detalhes();
		
	}
	
}
