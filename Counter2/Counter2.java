import java .util.Scanner;
    class Counter2 {
       public static void main (String args[]){
       Scanner sc = new Scanner(System.in);


      System.out.println("enter the value of a...");
       int a = sc.nextInt();


        System.out.println("enter the value of x...");
        int x = sc.nextInt();


        int count = 0;

        while (a <= x){
               a++;
          int value = a++;

        System.out.println("Value:" + value);

         }


        if ( a % 2 == 1){
            count ++;

        System.out.println("Count:" + count);
         }
      }
   } 
