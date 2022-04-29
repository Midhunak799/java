import java.util.*;

class employee{


int emp id;

String name;


double salary;


String address

   void employee (int eid,String nm,double sal,String add){


       emp id=eid;

       name=nm;

       salary=sal;

       address=add;


}
}


class teacher extends employee {



        String department;

        String subject taught;




     teacher(String dept,String sub,int eid,String nm,double sal,String add){
        

        department=dept;

        subject taught=sub;

        emp id=eid;

        name=nm;

        salary=sal;

        address=add;

} 
}



      void display(){



         System.out.println("DEPARTMENT:"+department+"/n SUBJECT TAUGHT:"+subject taught+);

}
}

     class main{

             public static void main(String args[]){


              Scanner.obj=new Scanner(System.in);

         System.out.println("ENTER THE NUMBER OF TEACHERS:");
 
                int n=obj.nextInt();


               teacher[]arr;

              arr=new teacher[n];

               for(int i=0; i<n; i++){


         System.out.println("ENTER THE DETAILS OF "+(i+1)+ "th TEACHER:");



             System.out.println("ENTER THE EMPLOYEE ID:");

                int eid=obj.nextInt();



            System.out.println("ENTER EMPLOYEE NAME:");
                String nm=obj.next();




