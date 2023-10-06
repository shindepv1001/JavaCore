package Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		Student std1 = new Student();
		std1.setId(1);
		std1.setName("Pradeep");
		std1.setCity("Pune..");
		
		Student std2 = new Student();
		std2.setId(2);
		std2.setName("Swapnil");
		std2.setCity("Nagar...");
		
		Student std3 = new Student();
		std3.setId(3);
		std3.setName("Mahesh");
		std3.setCity("Chinchwad..");
		
		Student std4 = new Student();
		std4.setId(4);
		std4.setName("Amol");
		std4.setCity("Solapur");
	
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.add(std4);
		
		list.forEach(
				(std)-> {
					System.out.println("STD_ID : "+std.getId());
					System.out.println("STD_NAME : "+std.getName());
					System.out.println("STD_ID : "+std.getCity());
					System.out.println("-------------------------------------");
				}
				);
		}
}