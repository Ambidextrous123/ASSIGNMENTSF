class ASSIGNMENT3 {

  public static void main (String args[]) {



     int age =20 ;



     // str1 holds "Age: 20" which is the concatenation of the

     // string literal "Age: " and the value stored in the variable

     // age.

     String str1 = "Age: " + age;

     System.out.println(str1);





     // str2 holds "Age: 201" which is the  concatenated of  the number " 1"

     // appending to the end of the value of  str1.

     String str2 = "Age: " + age + 1 ;

     System.out.println(str2);





   //str3 holds "Age: 22" which is the concatenation of the

   //string literal "Age: " and the value stord in the variable

   //(age +2).

     String str3 = "Age: " + (age + 2) ;

     System.out.println(str3) ;





    String player = "Bob";



   // This returns the length of the String variable named "player"

   // iniitiated to the string of character "Bob".

    int len = player.length();

   System.out.println(player.length());





   String str4 = "scattered" ;



  //This returns a new string beginning with substring '6' to the end of

  //str4.

   String str5 = str4.substring (6) ;

   System.out.println (str4.substring (6)) ;





  //This returns a new string that is between the 'first' and 'fourth'

  //'substring' of str4

   String str6 = str4.substring (1,4) ;

   System.out.println (str6);

 //This replaces the 'first' substring of  str4 with 'h'

  String str7 = str4.replace('c','h') ;

  System.out.println( str4.replace('c','h')) ;





  //This replaces the 'first and second' substring with 'ch'

  String str8 = str4.replace("sc" ,"ch") ;

  System.out.println(str8) ;





   String str9 = " something before me and after me " ;



   //This returns a copy of str9,with leading and whitespace omitted.

   String str10 = str9.trim();

   System.out.println(str10) ;





    String str11 = "one:two:three" ;

    //This returns the character value at the specified index.

    char ch = str11.charAt (4) ;

    System.out.println(  ch ) ;



String str12 = "peanut butter" ;



   //This tests if str12 starts with the prefix "pea".

   boolean found = str12.startsWith("pea") ;

    System.out.println( found) ;





    //This tests if the str12 starts with the prefix "nut".

     found = str12.startsWith("nut") ;

      System.out.println(found);





   //This returns the index of "u" within the str12 of the first occurrence

      int index = str12.indexOf('u');

       System.out.println(index);



 //This returns the index of "nut" which is a substring of the str12

    index = str12.indexOf("nut") ;

     System.out.println(index) ;



  //

    index = str12.indexOf('u',6);

     System.out.println(index);

         }

      }
 

