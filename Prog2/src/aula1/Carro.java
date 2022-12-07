package aula1;

public class Carro{
	
	public String cor;
	public String modelo;
	public Boolean taLigado; // boas maneiras: utilizar letras minusculas no inicio e depois usar maiuscúlas para evitar confusão
	
	public Carro() {
		System.out.println("Criando um novo carro"); // syso + ctrl + spacebar
		this.taLigado = false; // usar o this para facilitar o entendimento do atributo da classe (escopo) 
	}
	
	// public modificador de acesso
	// void tipo de retorno
	// ligaCarro nome do metódo
	// () argumentos
	public void ligaCarro() {
		this.taLigado = true;
	}
	
	public void desligaCarro() {
		this.taLigado = false;
	}
}