class Finalexams {
      public static void main( String args[]){
            int[] array = new int [10];
        for( int i = 0;i < array.length;i++){
              double rand = 1 + Math.random()*10;
                array [i] = (int )( rand);
         }
          printArray(array);

 } 
       static void printArray(int [] a){
           for( int i = 0;i < a.length;i++){
          System.out.println(a[i]+ " "  );
       }
    }
}
// block ofcode iterating numbers between 1 and 10;

      
       


