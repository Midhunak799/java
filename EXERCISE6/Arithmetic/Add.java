package Arithmetic;

interface Add{

        void area(int a, int b);

}

   public class Addition implements Add{


         public void area(int a,int b){
         System.out.println("---------ADDITION----------");
         System.out.println("FIRST NUMBER:"+a);
         System.out.println("SECOND NUMBER:"+b);
         System.out.println("RESULT IS  :"+(a+b)+"\n----------------");
}
}
