import java.util.Scanner;

/**
 * WAP to check whether a number is twisted prime or not. Twisted prime is a number if the
 * number and its reverse both are prime then it is called twisted prime.
 * Sample run 1:
 * Enter a number: 97
 * 97 is twisted prime.
 * Sample run 2: 43
 * 43 is not a twisted prime
 */
public class question2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int a = num;
        int reverse,sum=0;
        while(num!=0){
            reverse = num%10;
            sum = sum*10+reverse;
            num = num/10;

        }
         int flag = 0;
        for(int i = 2;i<=sum/2;i++){
            if (sum%i==0){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println(a+" is a twisted prime");

        }else {
            System.out.println(a+" is not a twisted prime");
        }





    }
}
