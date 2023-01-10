package bloco23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "C:\\arquivo.txt";
		List<Product> productList = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String[] vetorConstrutor = new String[3]; 
			String line = br.readLine();
			
			while (line != null) {
				vetorConstrutor = line.split(",");
				Double valor = Double.parseDouble(vetorConstrutor[1]);
				Integer quantidade = Integer.parseInt(vetorConstrutor[2]);
				Product product = new Product(vetorConstrutor[0], valor, quantidade);
				productList.add(product);
				
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		File outFolder = new File("C:\\out");
		outFolder.mkdirs();
		File outPath = new File("C:\\out\\summary.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))) {
			
			for (Product prod: productList) {
				bw.write(prod.makeLine());
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}