/**
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 */
public class a4q7 {
    public static void main(String[] args) {

       //a

          for (int i=1;i<=5;i++){
                      char a =65;
                      for (int j = 1;j<=i;j++){
                          System.out.print(a);
                          a++;
                      }
                      System.out.println();
                  }


        //b  $ $ $ $ $
        //   $ $ $ $
        //   $ $ $
        //   $ $
        //   $



        for (int i=1;i<=5;i++) {

                      for (int j = 5; j >= i; j--) {
                          System.out.print("$");

                      }
                      System.out.println();
                  }





            //1
            //2 2
            //3 3 3
            //4 4 4 4
            //5 5 5 5 5

             int k = 1;
             for (int i=1;i<=5;i++){



            for (int j = 5;j>=1;j--){
                                  if (j>i)
                                      System.out.print(" ");
                                  else
                                      System.out.print(k);

                              }
                              k++;
                              System.out.println();




              }

            }}
