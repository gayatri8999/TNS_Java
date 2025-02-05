
public class Switch {

	public static void main(String[] args) {
		char x='H';
		switch(x)
		{
		
		case'l':
		case'L':
		     System.out.println(x +" is a leader");
		     break;
		     
		case'b':
		case'B':
			System.out.println(x + " is a BootStrap");
			break;
			
		case'h':
		case'H':
			System.out.println(x + " is a HTMl");
			break;
			
			default:
				System.out.println("Invalid input");
			
		}

	}

}
