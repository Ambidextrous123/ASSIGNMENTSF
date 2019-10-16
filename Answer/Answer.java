import java .util.Scanner;

   class Answer {

       public static void main (String args[]){

       Scanner sc = new Scanner(System.in);
       
       System.out.println("enter year of service...");
       int year = sc.nextInt();
       System.out.println("enter amount of salary...");
       int amounTsalary = sc.nextInt();
       double bonus = 0.05*amounTsalary;

        if (year > 5){
      double netbonus = amounTsalary + bonus;
      System.out.println("Netbonus: " + netbonus);    
   
       
       }
     }
   }
