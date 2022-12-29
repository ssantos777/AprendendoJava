package bloco8;

import java.util.Locale;
import java.util.Scanner;

public class ManageProducts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Product p1 = new Product();
		
		System.out.println("Enter product data");
		System.out.print("Name: ");
		p1.name = sc.nextLine();
		System.out.print("Price: ");
		p1.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		p1.quantity = sc.nextInt();
		
		System.out.println("Product data: " + p1); // nao é necessário colocar p1.toString() pois o java reconhece implicitamente
		
		System.out.print("Enter the number of products to be added in stock: ");
		p1.addProducts(sc.nextInt());
		
		System.out.println("Updated data: " + p1);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		p1.removeProducts(sc.nextInt());
		
		System.out.println("Updated data: " + p1);
		
		sc.close();
	}
}