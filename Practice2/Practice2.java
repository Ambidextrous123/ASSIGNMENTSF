import java .util.Scanner;
    class Practice2 {
      public static void main (String args[]) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the totalsales per week...");
         double totalsales = sc.nextDouble();
         double earns = totalsales*0.05;
      
           System.out.println("Earns: "  + earns);    
          
           if ( totalsales >= 1000.0){
            double earnings =  totalsales + 100.00;
           System.out.println("Earnings:" + earnings);
           } 
       }       
      
    }
        
        
