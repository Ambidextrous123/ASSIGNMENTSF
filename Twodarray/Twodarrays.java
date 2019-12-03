import java .util.Scanner;
class Twodarrays {
       public static void main( String args[]){
            //  int [][]matrix  =  {
              //   {1, 2, 3},
                // {4, 5, 6},
                 //{7, 8, 9}
  // };
              
            // for( int i = 0; i < matrix.length; i++){
              
              //  for ( int j = 0; j < matrix[i].length ; j++){
                 
                
                // System.out.printf( matrix [i][j]  +  " " );
                //}
             
   
               // System.out.println();
         //}
    
 // }         
        
    
//} //printing 2 D array in the matrix form.
  

        //    Scanner sc = new Scanner ( System.in);
          //  System.out.println("enter row length of array");
            //int row = sc. nextInt();
           // System.out.println("enter column length of array") ;        
           // int column = sc.nextInt();
             
          //  int [][] array = new int[row][column];
         //  System.out.print("enter" +  row*column + "elements to store in array");
        //   for ( int i = 0;i < row; i++){
          //   for (int j = 0;j < column;j++){
            //    array[i][j] =  sc.nextInt();
              //  }
            // }

      // System.out.println("elements in array in the matrix form are :");
        //  for ( int i = 0;i < row; i++){
          //    for( int j = 0;j < column;j++){
            //   System.out.print(  "  " + array[i][+j]  );
              // }
              // System.out .println();
       // } 
  //  }
      
//}   reading the arrays from the keybord and printing it in the  matrix form 

  
            //     int[][] array = {{1,2,3},{4,5,6}};
           
         
         //  for( int i = 0;i < 2 ; i++){
           //  for ( int j = 0;j < 3 ; j++){
               
            //System.out.print( " " + array[i][j]);

           //}
           // System.out.println();
         // }
        // }
   // }  print arrays in matrix formm

           
           //     int [][]array =  {{1,2,3},{3,4,5}};
             //   int [][]array1 = {{6,7,8},{2,3,5}};         
       
            // for( int i = 0;i < 2;i++){
              // for ( int j = 0;j < 3;j++){
               //System.out.print( array[i][j]+ " ");
               //}
            
              // System.out.println();
                //}
              
                
            
                //for ( int k = 0;k < 2;k++){
                  //for( int b = 0;b < 3;b++){
                // System.out.print(" " + array1[k][b]);
                //  }
             
          
               // System.out.println();
         // }
       // }    
    // }     printing out the two arrays in the matric forms




               
             //  int[][]array =  {{1,2,3},{4,5,6},{7,8,9}};
               //int[][]array1 = {{0,1,2},{5,6,3},{4,3,2}};
              // int[][]sum = new int [3][3];

               //int rows,columns;
        
           // for( rows = 0; rows < array.length;rows++){
             //  for ( columns = 0;columns < array[0].length;columns++){
         //  sum[rows][columns] = array[rows][columns] + array1[rows][columns];
           //  }
         //  }
            
           // System.out.println(" sum of the arrays is:");
                    
            // for( rows = 0;rows < array.length ;rows++){
              //    for( columns = 0 ; columns < array[0].length;columns++){
           //  System.out.print(" \t " +   sum[rows][columns]);
           // }
           // System.out.println();
           // }
       // }
// } adding the sum of matrices


           int[][] a = {{1,2,3},{2,3,1},{3,4,1}};
            int[][] b = {{1,4,3},{2,1,4},{3,2,1}};
            int[][]c = {{1,2,3},{1,3,4},{1,2,3}};
            int[][]total  = new int[3][3];

            int rows,columns;
           for( rows = 0;rows < a.length ; rows++){
              for( columns = 0;columns < a[0].length;columns++){
           total [rows][columns] = a[rows][columns] + b[rows][columns] - c[rows][columns];
            }
          }
              System.out.println( "the total of the arrays is;");
                  for( rows = 0;rows < a.length ; rows++){
                      for( columns = 0;columns < a[0].length;columns++){
                 System.out.print( "  \t" + total [rows][columns]);
                   }
                 System.out.println();
                  }
                }
            } 

   



                              
               



















































































































 
                        
                         
                                                  




















        
                 























     























     
    
      
               










