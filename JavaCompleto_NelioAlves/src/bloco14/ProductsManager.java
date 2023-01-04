package bloco14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProductsManager {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		Integer productsNumber = sc.nextInt();
		
		List<Product> productsList = new ArrayList<>();
		
		for (int i = 1; i <= productsNumber; i++) {
			System.out.println("Product #" + i + " data.");
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (productType == 'i' || productType == 'I') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				productsList.add(new ImportedProduct(name, price, customsFee));
			} else if (productType == 'u' || productType == 'U'){ 
				System.out.print("Manufacture date (DD/MM/YYYY) : ");
				Date manufactureDate = sdf.parse(sc.next());
				productsList.add(new UsedProduct(name, price, manufactureDate));
			} else {
				productsList.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product i: productsList) {
			System.out.println(i.priceTag());
		}
		
		sc.close();
	}
}