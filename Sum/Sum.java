import java.util.Scanner;
       class Sum {
            public static void main (String args[]){
              Scanner sc = new Scanner(System.in);
              System.out.println("enter the value of a...");
               int a = sc.nextInt();
              System.out.println("enter the vaue of b...");   
                int b = sc.nextInt();
      
                int sum = 0;
                    while (a<=b){
                        sum = sum + a;
                   a++;
                  
                System.out.println("Sum: "+ sum);    
                   
                   }
             }
        } 
                
                
