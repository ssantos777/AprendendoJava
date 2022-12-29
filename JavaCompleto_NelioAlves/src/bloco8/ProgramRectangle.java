package bloco8;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		Rectangle r1 = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		r1.width = sc.nextDouble();
		r1.height = sc.nextDouble();
		System.out.println("AREA = " + r1.getArea());
		System.out.println("PERIMETER = " + r1.getPerimeter());
		System.out.println("DIAGONAL = " + r1.getDiagonal());
		
		sc.close();
	}
}
