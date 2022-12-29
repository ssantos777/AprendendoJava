package bloco8;

import java.util.Locale;
import java.util.Scanner;

public class TrianglesWithoutObjects {
	
	// aplicação sem orientação a objetos

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		double areaX, areaY;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		areaX = area(xA, xB, xC);
		areaY = area(yA, yB, yC);
		
		System.out.println("Triangle X area: " + areaX);
		System.out.println("Triangle Y area: " + areaY);
	
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else  if (areaY > areaX){
			System.out.println("Larger area: Y");
		} else {
			System.out.println("Same areas.");
		}
		
		sc.close();
	}
	
	public static double area(double a, double b, double c) {
		double p, area;
		p = (a+b+c)/2;
		area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		return area;
	}
	
}