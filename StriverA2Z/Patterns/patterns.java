package Patterns;
import java.util.*;

public class patterns {
    //rectangle patterns
    public static void Pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }   

    public static void Pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
    
  public static void Pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }   
    
  public static void Pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }   
    
  public static void Pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
    

  public static void Pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }   
    
  public static void Pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }   

            System.out.println();
        }
    }   
    
  public static void Pattern8(int n) {
        for (int i = n; i>=1; i--) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }   

            System.out.println();
        }
    }   
    
    public static void Pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }   
            System.out.println();
        }
        for (int i = n; i>=1; i--) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }   

            System.out.println();
        }

    }   

    
    public static void Pattern10(int n) {

        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for(int j=n-1;j>=i;j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    public static void Pattern11(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if(i%2 != 0){
                start = 1;
            }else{
                start = 0;
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
               // start = (start == 0) ? 1 : 0; // Toggle between 0 and 1
            }
            System.out.println();
        }
    }   
    
    public static void Pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
   
   public static void Pattern13(int n) {
    int num = 1;
        for (int i = 1; i <= n; i++) {
           for(int j=1;j<=i;j++){
            System.out.print(num++ + " ");
           }
            System.out.println();
        }
    }
    


    //----------ALPHABET PATTERNS---------------
    public static void Pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            // Or we can loop direct character from 'A' to  i
            // for (char k = 'A'; k < 'A' + i; k++) {
            //     System.out.print(k + " ");
            // }
            System.out.println();
        }
    }
    
    public static void Pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(ch++ + " ");
            }
            // or another waty to print reverse
            // for (char k = 'A'; k < 'A' + n - i + 1; k++) {
            //     System.out.print(k + " ");
            // }
            System.out.println();
        }
    }   
    
    public static void Pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = (char)('A' + i - 1); // Start character for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            
            System.out.println();
        }
    }
    
    public static void Pattern17(int n) {
        for (int i = 1; i <= n; i++) {

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i-1)/2; // Calculate the breakpoint for each row
            for(int j=1;j<= 2*i-1;j++) {
                System.out.print(ch);
                if(j <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }

    public static void Pattern18(int n){
        for(int i=1;i<n;i++){
            for(char ch = (char)('E'-i+1); ch<='E'; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void Pattern19(int n){
        //stars
        int spaces = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }


            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }   

            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }
        //spaces
        spaces = 2 * (n - 1);
         //stars    
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }


            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }   

            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            spaces -= 2;
            System.out.println();
        }



    }
    
    public static void Pattern20(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            } 
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            } 
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
    public static void Pattern22(int n){
            
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int n = scanner.nextInt();
        Pattern22(n);
        scanner.close();
    }
}