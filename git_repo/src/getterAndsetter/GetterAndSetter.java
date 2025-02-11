package getterAndsetter;

public class GetterAndSetter {
    public static void main(String[] args) {
        // Creating object using default constructor and setting values
        GetterAndSetterDemo P1 = new GetterAndSetterDemo();
        P1.setName("Ganesh");
        P1.setpCity("Pune");

        // Displaying first object
        System.out.println(P1);

        // Creating object using parameterized constructor
        GetterAndSetterDemo P2 = new GetterAndSetterDemo("Gayatri", "latur");

        // Displaying second object
        System.out.println(P2);
    }
}
