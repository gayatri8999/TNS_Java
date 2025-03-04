package Hierarchical_inheritance;

public class hierarchical_demo {

	public static void main(String[] args) {
		person p1=new person();
		System.out.println("---Person Details ------");
		System.out.println(p1);
		
		person p;
		p=new person("vaishnavi", "Mumbai");
		System.out.println("person Details :"+ p);
		
		p=new student("Nikita", "Pune", "SY", 78.98f);
		System.out.println(p);
		
		p=new employee("ANiket", "Nashik", 1002, 60000f, "developer");
		System.out.println(p);
	}

}
