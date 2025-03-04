package Hierarchical_inheritance;

public class employee extends person {

	private int empid;
	private float salary;
	private String dept;
	
	//default construct
	public employee() {
		System.out.println("default constructor ");
		
		empid=1001;
		salary=50000f;
		dept="IT";
		
		
	}

	public employee(String name, String city,int empid, float salary, String dept) {
		super( name,  city);
		this.empid = empid;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	
	
	
	
}
	
	
	
	


