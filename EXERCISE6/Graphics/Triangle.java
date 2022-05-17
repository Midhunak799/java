package Graphics;

interface Areatri{

        void area(int b ,int h);

}

   public class Triangle implements Areatri{


         public void area(int b,int h){
          System.out.println("-------TRIANGLE----------");
         System.out.println("BASE OF THE TRIANGLE:"+b);
         System.out.println("HEIGHT OF THE TRIANGLE:"+h);
         System.out.println("AREA OF TRIANGLE :"+(0.5*b*h)+"\n--------------------");
}
}
