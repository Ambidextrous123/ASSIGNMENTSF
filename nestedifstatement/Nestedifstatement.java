import java .util.Scanner;   
    class Nestedifstatement {
       public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter total number of tickets perweek...");
       double totalticket = sc.nextDouble();
       double totalcost =  totalticket*20;
      
       if ( totalticket >= 5){
         totalcost = totalcost = totalcost*0.8;

       }   
       
        totalcost = totalcost *1.05;
        System.out.println("Totalcost:" + totalcost);    
        }
    }

