package Hierarchical_inheritance;

public class person {
	private String name;
	private String city;
	
	
	public person()
	{
		System.out.println("Person class default constructtor");
		name="ABC";
		city="Pune";
		
		
	}


	public person(String name, String city) {
		
		this.name = name;
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "person [name=" + name + ", city=" + city + "]";
	}
	
	
	
	
}


