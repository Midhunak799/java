package Arithmetic;

interface subtraction{

        void result(int a, int b);

}

   public class sub implements subtraction{

                 
         public void result(int a,int b){
                
         System.out.println("---------SUBTRACTION----------");
         System.out.println("FIRST NUMBER:"+a);
         System.out.println("SECOND NUMBER:"+b);
         System.out.println("RESULT IS  :"+(a-b)+"\n----------------");
}
}
