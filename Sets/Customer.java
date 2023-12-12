package Sets;

public class Customer implements Comparable<Customer>{
	
		int id;
		String name;
		String email;
		
		public Customer() {
			super();
		}
		
		public Customer(int id, String name, String email) {
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
		public int compareTo(Customer c2) {
			Customer c1=this;
			return c1.id-c2.id;
		}
		
		//sorting based on names
//		public int compareTo(Customer c2) {
//			Customer c1=this;
//			return c1.name.compareTo(c2.name);
//		}
		
		
		//if both names are same then sort based on email
//		public int compareTo(Customer c2) {
//			Customer c1=this;
//			if(c1.name.compareTo(c2.name)==0) {
//				return c1.email.compareTo(c2.email);
//			}
//			else {
//				return c1.name.compareTo(c2.name);
//		}
		
		
		
		
		
		

	
}



