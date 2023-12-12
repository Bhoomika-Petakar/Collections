package List;

import java.util.Scanner;

import Sets.Customer;

public class Stack2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of objects that you want to create: ");
		int n=scan.nextInt();
		
		Customer[] ar=new Customer[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("ID: ");
			int id=scan.nextInt();
			System.out.println("Name: ");
			String name=scan.next();
			System.out.println("Email: ");
			String email=scan.next();
			
			Customer c=new Customer(id,name,email);
			ar[i]=c;
			}
			for(Customer c:ar) {
				System.out.println(c);
			}
	}
	
	
	
	
	
	
	

}
