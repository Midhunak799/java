package Graphics;

interface AreaSq{

        void area(int s);

}

   public class Square implements AreaSq{


         public void area(int s){
          System.out.println("--------SQUARE---------");
         System.out.println("SIDE OF THE SQUARE:"+s);
         System.out.println("AREA OF SQUARE :"+(s*s)+"\n----------------------");
}
}
