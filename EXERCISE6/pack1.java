import Graphics.*;

class pack1{


      public static void main(String arg[]){

              Square s=new Square();
                 s.area(10);


              Rectangle rct=new Rectangle();
                  rct.area(10,20);

              Triangle tri=new Triangle();
                  tri.area(8,6);

              circle cir=new circle();
                  cir.area(6);

}
}

/*

OUTPUT

--------SQUARE---------
SIDE OF THE SQUARE:10
AREA OF SQUARE :100
----------------------
---------RECTANGLE----------
LENGTH OF THE SQUARE:10
BREADTH OF THE SQUARE:20
AREA OF RECTANGLE  :200
----------------
-------TRIANGLE----------
BASE OF THE TRIANGLE:8
HEIGHT OF THE TRIANGLE:6
AREA OF TRIANGLE :24.0
--------------------
----------CIRCLE-----------
RADIOUS OF THE CIRCLE:6.0
AREA OF CIRCLE :113.03999999999999

*/
