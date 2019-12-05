class Exam3practice {
     public static void main ( String args[]){
      
         System.out.println(average(2,4,6));
 

          }
      static double average ( int ...args){
           double sum = 0.0;
      for ( int i = 0 ;i < args.length ; i++){
           sum = sum + args[i];
        }
      return sum/args.length;
       }
   
}




      
 
