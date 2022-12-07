package aula2;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		System.out.println(c1.saldo);
		System.out.println(c1.limite);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		c1.usuario = s.next();
		System.out.println(c1.usuario);
		
		// s = new Scanner(System.in);
		
		c1.Depositar();
		
		
		

	}

}
