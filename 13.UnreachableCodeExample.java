public class UnreachableCodeExample {
    public static int getNumber() {
         System.out.println("Returning 42");
        return 42;
    }

    public static void main(String[] args) {
        System.out.println(getNumber());
    }
}
