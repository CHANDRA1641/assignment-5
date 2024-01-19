import java.util.Scanner;

/**
 * WAP to enter the value of n and display find the following sum of the series:
 * 1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)
 */

public class a4q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for (int i = 1;i<=n;i++){
            System.out.print("(");
            for (int j = 1 ;j<=i;j++){
                count=count+j;
                System.out.print(j+"+");
            }
            System.out.println(")");
        }
        System.out.println("the value is"+count);
    }
}
