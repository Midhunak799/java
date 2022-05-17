package Graphics;

interface Arearect{

        void area(int length,int breadth);

}

   public class Rectangle implements Arearect{


         public void area(int length,int breadth){
         System.out.println("---------RECTANGLE----------");
         System.out.println("LENGTH OF THE SQUARE:"+length);
         System.out.println("BREADTH OF THE SQUARE:"+breadth);
         System.out.println("AREA OF RECTANGLE  :"+(length*breadth)+"\n----------------");
}
}
