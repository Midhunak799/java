package Arithmetic;

interface multiplication{

        void result(int a, int b);

}

   public class mul implements multiplication{

                
         public void result(int a,int b){
               
         System.out.println("---------MULTIPLICATION RESULT----------");
         System.out.println("FIRST NUMBER:"+a);
         System.out.println("SECOND NUMBER:"+b);
         System.out.println("RESULT IS  :"+(a*b)+"\n----------------");
}
}
