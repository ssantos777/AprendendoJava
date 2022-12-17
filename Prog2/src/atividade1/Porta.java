package atividade1;

public class Porta {
	public Boolean aberta;
	public String cor;
	public Double dimensaoX;
	public Double dimensaoY;
	public Double dimensaoZ;
	
	public Porta() {
		this.aberta = false;
		this.cor = "Marrom";
		this.dimensaoX = 210.0;
		this.dimensaoY = 82.0;
		this.dimensaoZ = 5.0;
	}
	
	public void abre() {
		this.aberta = true;
	}
	
	public void fecha() {
		this.aberta = false;
	}
	
	public void pinta(String s) {
		this.cor = s;
		System.out.println("A porta está agora na cor " +cor +".");
	}
	
	public boolean estaAberta() {
		if (this.aberta == false) {
			System.out.println("A porta está fechada.");
			return false;
		} else {
			System.out.println("A porta está aberta.");
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		Porta prt1 = new Porta();
		
		prt1.estaAberta();
		prt1.abre();
		prt1.estaAberta();
		prt1.pinta("Azul");
		prt1.dimensaoX = 82.0;
		prt1.dimensaoY = 210.0;
		prt1.dimensaoZ = 0.8;
		
		
	}
}
