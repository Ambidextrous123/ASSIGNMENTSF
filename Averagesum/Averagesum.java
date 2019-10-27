import java.util.Scanner;
       class Averagesum {
            public static void main (String args[]){
              Scanner sc = new Scanner(System.in);
              System.out.println("enter the vaue of b...");
                int b = sc.nextInt();

                int a = 1;
                int sum = 0;



                  for(  ; a<=b ; a++){
                   sum = sum + a;
                    }
                    a++;
                 System.out.println("Sum :"+ sum);

                 System.out.println("Average :" + sum/b);
               }
          }
     
