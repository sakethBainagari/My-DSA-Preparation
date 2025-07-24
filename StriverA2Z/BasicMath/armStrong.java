import java.util.Scanner;

public class armStrong {
    public static boolean isArmstrong(int n) {
        int sum = 0;
        int count = 0;
        int temp = n;

        // Count number of digits
        int t = n;
        while (t > 0) {
            count++;
            t /= 10;
        }

        // Reset temp and calculate sum of powers
        temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
