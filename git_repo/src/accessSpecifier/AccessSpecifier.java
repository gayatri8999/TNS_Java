package accessSpecifier;

public class AccessSpecifier {
    public static void main(String[] args) {
        AccessSpecifierDemo ac = new AccessSpecifierDemo();

        ac.accessPrivateMethod(); // ✅ Correct way to access private method
        ac.protectedMethod();
        ac.defaultMethod();
        ac.publicMethod();
    }
}