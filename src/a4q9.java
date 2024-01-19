import java.util.Scanner;

/**
 * Write a program that will read the value of n from the user and calculate sum of the following
 * series:
 * 1/1^2+1/2^2+1/3^2+1/4^2+1/5^2......+1/n^2
 *
 */
public class a4q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        double count=0;

        for (int i =1 ;i<=n;i++){
            System.out.print  (1/(Math.pow(i,2))+"+");
            count=count+ (double) 1/(Math.pow(i,2));
        }
        System.out.println(" ");
        System.out.println("the value is "+count);


    }
}
