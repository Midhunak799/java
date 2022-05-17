package Arithmetic;

interface division{

        void result(int a, int b);

}

   public class div implements division{

                 double r=0;
         public void result(int a,int b){
                 r=(double)a/b;
         System.out.println("---------DIVISION----------");
         System.out.println("FIRST NUMBER:"+a);
         System.out.println("SECOND NUMBER:"+b);
         System.out.println("RESULT IS  :"+(r)+"\n----------------");
}
}
