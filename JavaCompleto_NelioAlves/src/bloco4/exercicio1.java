package bloco4;

import java.util.Locale;

public class exercicio1 {

	public static void main(String[] args) {
	String product1 = "Computer";
	String product2 = "Office desk";
	
	int age = 30;
	int code = 5290;
	char gender = 'F'; // char deve estar entre aspas simples
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	System.out.println("Products:");
	System.out.printf("%s, which price is $ %.2f%n", product1, price1);
	System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
	System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender); // podia so usar print e dar %n no final
	System.out.printf("%nMeasure with eight decimal places: %f%nRounded (three decimal places): %.3f%n", measure, measure);
	Locale.setDefault(Locale.US);
	System.out.printf("Us decimal point: %.3f", measure);
	
	

	}

}
