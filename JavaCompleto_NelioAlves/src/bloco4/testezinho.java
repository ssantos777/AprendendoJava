package bloco4;

import java.util.Scanner;

public class testezinho {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		double y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		y = Math.sqrt(y);
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		}
}
