import java.util.Scanner;

/**
 * WAP to display the multiplication table from 2 to 15.
 * Sample run:
 * Multiplication table of 2
 * 2 × 1 = 2
 * 2 × 2 = 4
 * :
 * :
 * 2 × 10 = 20
 * Multiplication table of 3
 * 3 × 1 = 3
 * 3 × 2 = 6
 */

public class A4Q5 {
    public static void main(String[] args) {
        for (int i = 2;i<=15;i++){
            System.out.println("multiplication table of "+ i);
            for (int j = 1;j<=10;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }

    }
}
