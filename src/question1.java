import java.util.Scanner;

/*
Amicable numbers are pair of numbers each of whose divisors are added to give the other
number

the smallest pair of amicable number is(220,2284).
they are amicable because the proper divisors of220 are 1,2,4,5,10,11,20,22,44,55,
and 110 of which the sum is 284 .and the proper divisor of 284 are 1,2,4,71 and
142 of which the sum is 220.
** 1 is inclded as divisor but the numbers are not included as their own divisors.
 */
public class question1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number :");
        int n1 = sc.nextInt();
        System.out.println("enter second number:");
        int n2 =sc.nextInt();
        int sum1=0;
        int sum2 =0 ;
        for (int i =1;i<=n1;i++){
            if(n1%i==0){
                sum1+=i;
            }
        }
        for (int i =1 ;i <=n2;i++){
            if (n2%i==0){
                sum2+=i;

            }
        }
        if (sum1==sum2){
            System.out.println(n1+"and"+n2+" are amicable numbers .");

        }else{
            System.out.println(n1+" and "+n2+" are not amicable numbers.");
        }


    }
}
