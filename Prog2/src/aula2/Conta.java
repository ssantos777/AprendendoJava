package aula2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Conta {
	public Integer numero;
	public String usuario;
	public Double limite;
	public Double saldo;
	
	public Conta() { // metódo construtor
		System.out.println("Criando uma nova conta.");
		this.saldo = 0.0;
		this.limite = 300.0;		

	}
	
	public Conta(Integer numero, String usuario) { // metódo construtor diferenciado
		System.out.println("Criando uma nova conta.");
		this.numero = numero;
		this.usuario = usuario;
		this.saldo = 0.0;
		this.limite = 300.0;
	}
	
	public void Depositar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a quantidade a depósitar??");
		this.saldo = scan.nextDouble();
		System.out.println(this.saldo);
	}
	
	public void Nomear() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		this.usuario = scan.next();
		System.out.println(this.usuario);
	}
	
	public void Verificar() {
		ArrayList<String> lista = new ArrayList();
		lista.add("numero");
		lista.add("usuario");
		lista.add("limite");
		lista.add("saldo");
	    Iterator<String> iterator = lista.iterator();
	    
	    while (iterator.hasNext()) {
	      System.out.printf("Posição %d- %s\n", i, iterator.next());
	      
	    }
	}
	
}
