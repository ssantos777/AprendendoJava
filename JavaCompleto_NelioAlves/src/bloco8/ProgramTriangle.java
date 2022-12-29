package bloco8;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangle {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		TriangleObject x, y;
		x = new TriangleObject();
		y = new TriangleObject();
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		x.calcArea();
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		y.calcArea();
		
		System.out.println("Triangle X area: " + x.area);
		System.out.println("Triangle Y area: " + y.area);
		
		if (x.area > y.area) {
			System.out.println("Larger area: X");
		} else  if (y.area > x.area){
			System.out.println("Larger area: Y");
		} else {
			System.out.println("Same areas.");
		}
		
		sc.close();
	}

}