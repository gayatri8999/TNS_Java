
package getterAndsetter;

public class GetterAndSetterDemo {
    
    private String name;
    private String pCity;

    // Default Constructor
    public GetterAndSetterDemo() {
    }

    // Parameterized Constructor
    public GetterAndSetterDemo(String name, String pCity) {
        this.name = name;
        this.pCity = pCity;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for pCity
    public String getpCity() {
        return pCity;
    }

    public void setpCity(String pCity) {
        this.pCity = pCity;
    }

    // Properly formatted toString() method
    @Override
    public String toString() {
        return "GetterAndSetterDemo{" +
                "name='" + name + '\'' +
                ", pCity='" + pCity + '\'' +
                '}';
    }
}
