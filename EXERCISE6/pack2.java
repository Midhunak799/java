import Arithmetic.*;
import java.util.*;
class pack2{


      public static void main(String arg[]){

              
                 Scanner sc = new Scanner(System.in);


      System.out.println("ENTER TWO NUMBERS ");
                  int a=sc.nextInt();
                  int b=sc.nextInt();

              Addition add=new Addition();
                add.result(a,b);

              sub sub= new sub();

                 sub.result(a,b);

               mul mul=new mul();

                  mul.result(a,b);


                div div=new div();

                  div.result(a,b);
}
}

/*

ENTER TWO NUMBERS 
10
20
---------ADDITION----------
FIRST NUMBER:10
SECOND NUMBER:20
RESULT IS  :30
----------------
---------SUBTRACTION----------
FIRST NUMBER:10
SECOND NUMBER:20
RESULT IS  :-10
----------------
---------MULTIPLICATION RESULT----------
FIRST NUMBER:10
SECOND NUMBER:20
RESULT IS  :200
----------------
---------DIVISION----------
FIRST NUMBER:10
SECOND NUMBER:20
RESULT IS  :0.5
*/
