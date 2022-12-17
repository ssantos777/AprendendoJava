package atividade1;

public class Casa {
	public String cor;
	public Porta porta1;
	public Porta porta2;
	public Porta porta3;
	public Pessoa proprietario;
	
	public Casa() {
		this.cor = "Cinza";
		this.porta1 = new Porta();
		this.porta2 = new Porta();
		this.porta3 = new Porta();
		this.proprietario = new Pessoa();
	}
	
	public void pinta(String s) {
		this.cor = s;
		System.out.println("A casa está agora na cor " +cor +".");
	}
	
	public void alteraProprietario(Pessoa novoProprietario){
		this.proprietario = novoProprietario;
	}
	
	/*
	 public int qtdPortasEstaoAbertas() {
		int i;
		if (this.porta1.estaAberta() == true) { i++; } else {} 
		
		if (this.porta2.estaAberta() == true) { i++; } else {}
		
		if (this.porta3.estaAberta() == true) { i++; } else {}
		
		return i;
 	} 
	*/
	
	public static void main(String[] args) {
		Casa casa1 = new Casa();
		Pessoa novo = new Pessoa();
		casa1.pinta("Roxo");
		casa1.porta1.abre();
		casa1.porta2.abre();
		// casa1.qtdPortasEstaoAbertas();
		novo.nome = "Ester";
		casa1.alteraProprietario(novo);
	}
	
}
