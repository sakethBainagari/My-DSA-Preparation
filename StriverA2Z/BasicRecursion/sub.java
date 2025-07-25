public class sub {
    public static int subtract(int a, int b) {
        if (b == 0) return a;
        return subtract(a = a-1, b=b-1);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int result = subtract(a, b);
        System.out.println("Subtraction of " + b + " from " + a + " is: " + result);
    }
}