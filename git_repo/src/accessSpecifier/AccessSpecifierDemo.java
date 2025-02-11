package accessSpecifier;

public class AccessSpecifierDemo {

    // Variables with different access levels
    int varDefault = 0; // Default access
    public int varpublic = 10; // Public access
    private int varprivate = 12; // Private access
    protected int varProtected = 11; // Protected access

    // Default method (accessible within the same package)
    void defaultMethod() {
        System.out.println("Default method");
        System.out.println(varDefault);
    }

    // Public method (accessible from anywhere)
    public void publicMethod() {
        System.out.println("Public method");
        System.out.println(varpublic);
    }

    // Private method (only accessible within this class)
    private void privateMethod() {
        System.out.println("Private method");
        System.out.println(varprivate);
    }

    // Protected method (accessible within the package and subclasses)
    protected void protectedMethod() {
        System.out.println("Protected method");
        System.out.println(varProtected);
    }

    // Public method to access the private method
    public void accessPrivateMethod() {
        privateMethod(); // Calling the private method from within the same class
    }
}
