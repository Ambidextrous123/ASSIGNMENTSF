import java.util.Scanner;
       class Sumpractice {
            public static void main (String args[]){
              Scanner sc = new Scanner(System.in);
              System.out.println("enter the value of a...");
               int a = sc.nextInt();
              System.out.println("enter the vaue of b...");
                int b = sc.nextInt();

                int sum = 0;


                  for(  ; a<=b ; a++){
                   sum = sum + a;
                    }
                    a++;

                System.out.println("Sum :" + sum);
              }
        }

