import java.util.Scanner;
     class Factorial{
           public static void main(String args[]){
             Scanner sc = new Scanner(System.in);

             System.out.println("enter the value of n ...");
               int n = sc.nextInt();
               int factorial = 1;

                while(n>1){
             factorial = factorial*n;
                  n--;
               }
             System.out.println("Factorial number :" + factorial);
              }
          } 
     

