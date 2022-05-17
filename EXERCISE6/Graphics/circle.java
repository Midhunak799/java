package Graphics;

interface AreaCir{

        void area(double r);

}

   public class circle implements AreaCir{


         public void area(double r){
         System.out.println("----------CIRCLE-----------");
         System.out.println("RADIOUS OF THE CIRCLE:"+r);

         System.out.println("AREA OF CIRCLE :"+(3.14*r*r)+"\n--------------------");
}
}
