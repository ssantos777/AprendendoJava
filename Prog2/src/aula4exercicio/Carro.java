package aula4exercicio;

public class Carro {
	
	public String cor;
	public String modelo;
	public Double velocidadeAtual;
	public Double velocidadeMaxima;
	public Motor motor;
	
	public Carro() {
		this.cor = "Branco";
		this.modelo = "Gol";
		this.velocidadeAtual = 0.0;
		this.velocidadeMaxima = 180.0;
		this.motor = new Motor();
	}
	
	public Carro(String novaCor, String novoModelo, Double novaVelMax, Motor novoMotor) {
		this.cor = novaCor;
		this.modelo = novoModelo;
		this.velocidadeMaxima = novaVelMax;
		this.motor = novoMotor;
	}
	
	public void detalhes() {
		System.out.println(this.cor);
		System.out.println(this.modelo);
		System.out.println(this.velocidadeAtual);
		System.out.println(this.velocidadeMaxima);
		System.out.println(this.motor);
		System.out.println(this.motor.potencia);
		System.out.println(this.motor.tipo);
		System.out.println(this.motor.taLigado);
	}
	
	public void liga() {
		System.out.println("O carro está ligado.");
	}
	
	public void acelera(Double qtd){
		
	}
	
	public int pegaMarcha() {
		return 1;
	}

}
