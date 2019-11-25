
import java .util.Scanner;
class Arraypractice {
         // to print out the content in an array
    //   public static void main ( String args[]){
      //      int [] array = {1,2,6,9,5};
        //          int content = 0;
          //     for( int i = 0; i < array.length ; i++){
            //         content =  array[i];
            //System.out.println( content);
         // }
    //}
//} 

     // to change the content in an array at a particular index
      //  public static void main ( String args[]){
        //      int [] array = {1,2,6,9,5}; 
          //            array[4] =  10;
            //System.out.println(array[4]);
              
        // to change the integer at the particular indices
         //public static void main ( String args[]){
           //int [] array = new int [10];
             //    array[2] = 20;   
          //   System.out.println(array[2]);

                //   to set  out the content to 13.
      //   public static void main ( String args[]){
        //  int [] array = {1,2,6,9,5};
          //       for( int i = 0; i < array.length ; i++){
            //         array[i] = 13;
            // System.out.println(array[i] );
 
           
             
        // printing out the array from the keyboard        
       // public static void main ( String args[]){
         //            int content = 0;
           //    Scanner sc = new Scanner(System.in);
       // System.out.println( "enter the value of n..");
         //          int length = sc.nextInt();
           //      int []array = new int[length];   
                       
                
           //for( int i = 0; i < array.length ; i++){
             //    content = array[i] + i;
            //System.out.println(content);


       // to calculate the sum of the even number in an array
          // public static void main ( String args[]){
           //     int content = 0  ;int sum = 0;
             //  Scanner sc = new Scanner(System.in);
      //  System.out.println( "enter the value of n..");
        //           int length = sc.nextInt();
          //       int []array = new int[length] ;  
            //  for( int i = 0; i < array.length ; i++){
               //       content = array[i] + i;
                 
               // if ( content % 2 == 0 ){
              
             //     sum = sum + content;
               //    }
               // System.out.println("Sum: " + sum);
                 
         // this is to imput integer read from the keyboard & print the reverse of the element .
     //       public static void main ( String args[]){
       //              int[]array1 = new int [10]   ;
         //         Scanner sc = new Scanner(System.in);
           //     System.out.println( "enter the values of the array...");
                
              
             //        for ( int i = 0 ; i < 10 ; i++)
               //         array1[i] = sc.nextInt();

                //System.out.println( "the reverse arrays values are ...");
                           
                  //   for ( int j =  array1.length -1 ;j >=0; j--)
                         
                  
                   //System.out.println(array1[j]);  
                   //}  
               
                
             
       //  }
//
        //public static void main( String args[]){
        //     int content = 0; int sum = 0;
          //      int array1[] = new int[10];
         // for (int i = 0; i < array1.length;i++){
           //   content = array1[i] + i;
           //if ( content % 2 == 0){
             //  sum = sum + content;
               // }
             //}                
         //System.out.println( "SUM: " + sum);
     
   // }           
                   
  //}                        
             
 
       
   
     //  public static void main ( String args[]){
             
       //     int array[] = {1,2,8,9,2,0,4,3,};
         //         int max = array[2];int content = 0;
           // for ( int i = 0;i < array.length ; i++){
             //          content = array[i];            
               //   if ( content  > max){
                 //     max = content ;
                   //}                        
               // }
             //System.out.println(max);
            
       //}
  //}
         // to imput values of an array and print the values out 
 
           //  public static void main( String args[]){
             //   Scanner sc = new Scanner(System.in);
          // System.out.println("the length of the array is  ...");
            //     int length = sc.nextInt();
              //   int array[] = new int[length];
           //System.out.println("enter the elements of the array");
           // for ( int i = 0; i < array.length ; i++){  
                 
             //    array[i] = sc.nextInt();
               //}
            //System.out.println( " the elements are ...");
                        
              //for ( int i = 0; i < array.length ; i++){
               //System.out.printf(  array[i]); 
          // }
           
              
           
                   
    //  } 
  //}

                 
              // public static void main( String args[]){
                //  Scanner sc = new Scanner(System.in);
             // System.out.println("enter the length of the array");
               //   int length = sc.nextInt();
               // int[] array = new int [length];
              //System.out.println("enter the elements of the array");
                //  for( int i = 0;i < array.length ;i++){
                  //array[i] = sc.nextInt();
                // } 
              // System.out.println("please give a number");
                //  int numBer = sc.nextInt(); int content = 0;
                // for ( int i = 0;i < array.length;i++){
                  //    content = array[i]; 
                 // if ( numBer == content){
                   //String str = "found";
                   
                 // System.out.println( str); 
                 
                 // }else{ 
                   //   String str2 = "not found";
                    // System.out.println(str2);
                         
                //}
           // } 
       // }
                
   // }
               

                // public static void main(String args[]){
                  //  Scanner sc = new Scanner(System.in);
                 // System.out.println("enter the elements of array");
                   //int[] array = new int[10];
                   //int [] array1 = new int[10];
             
                     //for ( int i = 0; i < array.length ; i++){
                       //  array[i] = sc.nextInt();
                   //} 
                     //  System.out.println(" the reverse order of array");
                       // int k = 0;
                    // for ( int i =  array.length-1; i >= 0; i--){
                          
                     
                   
                      //  System.out.println(array[i]);            
                         
                    
                    
                  //}
               // }
            // } 
                
                       public static void main ( String args[]){
                         Scanner sc = new Scanner(System.in);
                        int [] array1 = new int[10];
                    System.out.println("enter the elements");
                      for (int i = 0; i < array1.length ; i++){
                             array1[i] = sc.nextInt();
                          }  
                           int sum = 0; int product = 1;
                        for ( int i = 0 ; i < array1.length ; i++){
                             sum = sum + array1[i];
                         
                           product = product * array1[i];
                         }
                       System.out.println( "SUM:" + sum);

                         
                      System.out.println("PRODUCT;" + product);               
           
                        }                     
                    }                    
               
           


                   
                                 
               
       




                    
     






         
       
   
