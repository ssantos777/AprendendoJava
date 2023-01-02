package bloco10;

import java.util.Locale;
import java.util.Scanner;

public class SistemaQuartos {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int manyRooms = sc.nextInt();
		
		Quartos[] rooms = new Quartos[manyRooms];
		
		for (int i = 0; i < rooms.length; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d%n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rooms[room] = new Quartos(name, email, room);
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) { // importante isso aqui
				System.out.println(rooms[i].toString());
			} else {}
		}
				
		sc.close();
	}

}