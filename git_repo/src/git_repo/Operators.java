package git_repo;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("a and b values before the operator: " + a + " " + b);
        
        ++a; // Pre-increment a (a becomes 11)
        
        int c = ++a + b + a--; // c = 12 + 20 + 12 = 44
        System.out.println("Value of c is: " + c);
        
        int d = c++ + a + b--; // d = 44 + 11 + 19 = 74
        System.out.println("Value of d is: " + d);
    }
}

