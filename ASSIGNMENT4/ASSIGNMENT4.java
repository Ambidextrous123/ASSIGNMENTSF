import java .util.Scanner;

   class ASSIGNMENT4 {

       public static void main (String args[]) {



     Scanner sc = new Scanner(System.in);

   

  

     System.out.println("enter your maxAge ...");

     int maxAge = sc.nextInt();

     System.out.println("enter your curAge...");

     int curAge = sc.nextInt();



     boolean process = (maxAge != curAge);

     if (process);

     System.out.println("Process:" + process);



 



     System.out.println("enter a decimal value...");

     double average =  sc.nextDouble();

     boolean pass = (average > 65);

     if (pass);

     System.out.println("Pass:"+ pass);


     System.out.println("enter grade...");
     char lettergrade = sc.next( ).charAt(0);
     
     if ( lettergrade == 'A'){
         int  point = 5;
      System.out.println("Point:" + point);

      }else if ( lettergrade == 'B'){
         int point = 4;    
       System.out.println("Point:" + point);

    }else if (lettergrade == 'C'){
         int point = 3;
      System.out.println("Point:" + point);
  
     }else if ( lettergrade == 'D'){
        int point = 2;
      System.out.println("Point:" + point);

     }else if ( lettergrade == 'F'){
        int point = 0;
      System.out.println("Point:" + point);


       System.out.println("enter the value of score1...");
       double score1 = sc.nextDouble();
       System.out.println("enter the value of score2...");
        double score2 = sc.nextDouble();

       double result = 0;
    
       if ( score1 > 0 && score1 > score2){
            result = score1;
       System.out.println("Result :" + result);

       
       }else if (score2 >= score1){
           result = score2;
        System.out.println("Result :" + result);

         
        }else if ( score1 < 0) {
             result = 0;
          System.out.println("Result :" + result);
             }

         }

       }
    } 
  


