package git_repo;

public class DecisionMakinng_withoutOperator {  // Class names should start with uppercase

    public static void main(String[] args) {
        int x = 8, y = 7;
        int a = 10;
        int b = 11;  // Removed incorrect text

        if (x >= y) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (!(a < b) || (a == b)) {  // Fixed the condition
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
