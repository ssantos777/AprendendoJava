package bloco16;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Reservation {
	
	protected DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	protected Integer roomNumber; 
	protected LocalDate checkIn;
	protected LocalDate checkOut;
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
		if (!(checkOut.isAfter(checkIn))) {
			throw new DomainException("Check-out date must be after check-in date.");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}
	
	public Integer duration() {
		 Period intervalPeriod = Period.between(checkIn, checkOut);
		   return intervalPeriod.getDays();  
	}
	
	/*
	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
		LocalDate now = LocalDate.now();
		
		if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
			throw new IllegalArgumentException("Reservation dates for update must be future dates.");
		} 
		if (!(checkOut.isAfter(checkIn))) {
			throw new IllegalArgumentException("Check-out date must be after check-in date.");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	*/
	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
		LocalDate now = LocalDate.now();
		
		if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
			throw new DomainException("Reservation dates for update must be future dates.");
		} 
		if (!(checkOut.isAfter(checkIn))) {
			throw new DomainException("Check-out date must be after check-in date.");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Room " + getRoomNumber());
		sb.append(", check-in: " + getCheckIn());
		sb.append(", check-out: " + getCheckOut());
		sb.append(", " + duration() + " nights.");
		return sb.toString();
	}
}