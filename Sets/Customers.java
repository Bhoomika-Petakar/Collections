package Sets;

public class Customers implements Comparable<Customers> {
	int id;
	String name;
	String email;
	
	public Customers() {
		super();
	}
	
	public Customers(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id+","+name+","+email;
	}

	@Override
	public int compareTo(Customers c2) {
		Customers c1=this;
		return c1.id - c2.id;
		
	}

}
