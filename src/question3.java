import java.util.Scanner;

/**
 * WAP to enter the first number and second number. Display the prime numbers between the
 * first and second number.
 * Sample run:
 * Enter the first number: 4
 * Enter the second number: 15
 * Prime numbers between 4 and 15 are: 5 7 11 13
 */
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number :");
        int n = sc.nextInt();
        System.out.print("enter the second number :");
        int m = sc.nextInt();

        System.out.println("prime numbers between " + n + " and " + m + " are: ");
        for (int i = n; i < m; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count==0){
                System.out.println(i+" ");

            }

            }

        }
    }