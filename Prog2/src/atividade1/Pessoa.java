package atividade1;

public class Pessoa {
	public String nome;
	public Integer idade;
	
	public Pessoa() {
		this.nome = "Gio";
		this.idade = 20;
	}
	 public void fazAniversario() {
		 this.idade++;
		 System.out.println(this.nome +" agora tem " +this.idade +" anos.");
	 }
	 
	 public static void main(String[] args) {
		 Pessoa p1 = new Pessoa();
		 p1.fazAniversario();
		 p1.fazAniversario();
	 }
	 
}
