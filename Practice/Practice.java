import java .util.Scanner;

   class Practice {

       public static void main (String args[]) {



     Scanner sc = new Scanner(System.in);





     System.out.println("enter the quantity ...");
     double  quantity = sc.nextDouble();
     double cost = quantity*100.0;
     double discount = 0.1;

     System.out.println("Cost:" + cost);

     if (cost >1000){
      double totalcost = cost*discount;
     System.out.println("Totalcost:" + totalcost);
    
          }
       }
     }
   


