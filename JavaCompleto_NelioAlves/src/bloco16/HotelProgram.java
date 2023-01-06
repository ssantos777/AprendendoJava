package bloco16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class HotelProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Room Number: ");
			Integer roomNumber  = sc.nextInt();
			System.out.print("Check-in date (DD/MM/YYYY): ");
			LocalDate checkIn = LocalDate.parse(sc.next(), formatter);
			System.out.print("Check-out date (DD/MM/YYYY): ");
			LocalDate checkOut = LocalDate.parse(sc.next(), formatter);
			
			Reservation reserva = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reserva);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (DD/MM/YYYY): ");
			checkIn = LocalDate.parse(sc.next(), formatter);
			System.out.print("Check-out date (DD/MM/YYYY): ");
			checkOut = LocalDate.parse(sc.next(), formatter);
			
			reserva.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reserva);
			} // catch (IllegalArgumentException e) {
			//System.out.println("Error in reservation: " + e.getMessage());
			//	} 
			catch (DomainException e) {
				System.out.println("Error in reservation: " + e.getMessage());
			}
		sc.close();
	}
}