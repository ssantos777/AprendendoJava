package bloco10;

public class Quartos {
	
	private String name, email;
	private int room;
	

	public Quartos(String name, String email, int room) {
		setName(name);
		setEmail(email);
		setRoom(room);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getRoom() {
		return room;
	}


	public void setRoom(int room) {
		this.room = room;
	}
	
	public String toString() {
		return this.room +
				": " +
				this.name +
				", " +
				this.email;
	}

}
