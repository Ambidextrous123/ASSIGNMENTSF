import java .util.Scanner;
   class Answer2 {
       public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the mark...");
       int mark = sc.nextInt();


       if (mark > 80){
        char grade = 'A';
      System.out.println("Grade :" + grade);

       }else if (mark <= 80 && mark >= 60){
         char grade = 'B';
       System.out.println("Grade :" + grade);

      }else if (mark <= 60 && mark >= 50){
         char grade = 'C';
       System.out.println("Grade :" + grade);

      }else if (mark <= 50 && mark >= 45){
       char grade = 'D';
      System.out.println("Grade :" + grade);

      }else if (mark <= 45 && mark >= 25){
        char grade = 'E';
       System.out.println("Grade :" + grade);
     }else if ( mark < 25){
        char grade = 'F';
       System.out.println("Grade :" + grade);
         }
      }
    }
