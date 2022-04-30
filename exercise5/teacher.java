/*Create a class ‘Employee’ with data members Empid,
Name, Salary, Address and constructors to initialize the
data members. Create another class ‘Teacher’ that inherit
the properties of class employee and contain its own data
members department, Subjects taught and constructors
to initialize these data members and also include display
function to display all the data members. Use array of
objects to display details of N teachers.*/


import java.util.*;

class employee{


int empid;

String name;


double salary;


String address;

   void employee (int eid,String nm,double sal,String add){


       empid=eid;

       name=nm;

       salary=sal;

       address=add;


}
}


class teacher extends employee {



        String department;

        String subject_taught;




     teacher(String dept,String sub,int eid,String nm,double sal,String add){
        

        department=dept;

        subject_taught=sub;

        empid=eid;

        name=nm;

        salary=sal;

        address=add;

} 




      void display(){


         System.out.println("EMPLOYEE ID:"+empid+"\nNAME:"+name+"\nSALARY:"+salary+"\nADDRESS:"+address);

         System.out.println("DEPARTMENT:"+department+"\n SUBJECT TAUGHT:"+subject_taught);

}
}

     class main{

             public static void main(String args[]){


              Scanner obj=new Scanner(System.in);

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


            System.out.println("ENTER EMPLOYEE SALARY:");
                double sal=obj.nextDouble();


           System.out.println("ENTER ADDRESS:");
                String add=obj.next();

          System.out.println("ENTER DEPARTMENT:");
                String dept=obj.next();

          System.out.println("ENTER SUBJECT TAUGHT:");
                String sub=obj.next();


            arr[i]=new teacher(dept,sub,eid,nm,sal,add);

           }
             for(int j=0;j<n;j++){

         System.out.println("\nDETAILS OF TEACHER"+(j+1)+"  ");



         arr[j].display();


        }
}
}
/*
ENTER THE NUMBER OF TEACHERS:
2
ENTER THE DETAILS OF 1th TEACHER:
ENTER THE EMPLOYEE ID:
1
ENTER EMPLOYEE NAME:
MIDHUN
ENTER EMPLOYEE SALARY:
50000
ENTER ADDRESS:
KOZHIKODE
ENTER DEPARTMENT:
SCIENCE
ENTER SUBJECT TAUGHT:
PHYSICS
ENTER THE DETAILS OF 2th TEACHER:
ENTER THE EMPLOYEE ID:
2
ENTER EMPLOYEE NAME:
JITHU
ENTER EMPLOYEE SALARY:
50000
ENTER ADDRESS:
WAYANAD 
ENTER DEPARTMENT:
SCIENCE
ENTER SUBJECT TAUGHT:
CHEMISTRY

DETAILS OF TEACHER1  
EMPLOYEE ID:1
NAME:MIDHUN
SALARY:50000.0
ADDRESS:KOZHIKODE
DEPARTMENT:SCIENCE
 SUBJECT TAUGHT:PHYSICS

DETAILS OF TEACHER2  
EMPLOYEE ID:2
NAME:JITHU
SALARY:50000.0
ADDRESS:WAYANAD
DEPARTMENT:SCIENCE
 SUBJECT TAUGHT:CHEMISTRY

*/
