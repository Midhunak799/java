import java.util.*;

class person{

      String name;
      String gender;
      int age;
      String address;
      
           person(String gdr,String nm,int age,String add){ 
            
            
               name=nm;
               gender=gdr;
               age=age;
               address=add;
               
               }
               }
               
               
 class employee extends person{
 
 
        int empid;
        String company_name;
        String qualification;
        double salary;
        
        
                    employee(String nm,String gdr,int age,String add,int eid,String cnm,String qfn,double sal){
                    
                       super(nm,gdr,age,add);
                    
                             empid=eid;
                             company_name=cnm;
                             qualification=qfn;
                             salary=sal; 
                             
                }
                }    
                    
                    
 class teacher extends employee{
 
 
         String subject;
         String department;
         int teacher_id;
         
         
                    teacher(String nm,String gdr,int age,String add,int eid,String cnm,String qfn,double sal,String sub,String dept,int tid){
                    
                    
                    
                    super(nm,gdr,age,add,eid,cnm,qfn,sal);
                    
                    
                    
                     subject=sub;
                     department=dept;
                     teacher_id=tid;
                     
                     }
                     
                     
                     
                 void display(){
                 
                 System.out.println("\nNAME:"+super.name+"\nGENDER:"+super.gender+"\nAGE:"+super.age+"\nADDRESS:"+super.address);
                   
                 
                  System.out.println("\nEMP ID:"+empid+"\nCOMPANY NAME:"+company_name+"\nQUALIFICATION:"+qualification+"\nSALARY:"+salary);
                  
                 System.out.println("\nTEACHERS ID:"+teacher_id+"\nDEPARTMENT:"+department+"\nSUBJECT:"+subject);
                 
                 }
                 }
                 
                 
                 
                 class main{
                 
                 
                 
                      public static void main(String args[]){
                      
                      
                       Scanner obj=new Scanner(System.in);
                       
                        System.out.println("\nENTER THE NUMBER OF TEACHERS:");
                     
                    
                                int n=obj.nextInt();
                                teacher[] arr=new
                                teacher[n]; 
                                
                                
                                for(int i=0;i<n;i++){
                          System.out.println("\nENTER THE DETAILS OF TEACHER "+(i+1));      
                                                
                      
                      System.out.println("\nENTER THE NAME:");
                      
                                String nm=obj.next();
                                
                       System.out.println("\nENTER GENDER:");
                       
                                String gdr=obj.next();         
                       
                        System.out.println("\nENTER AGE:");
                            
                                int age=obj.nextInt();
                        
                        System.out.println("\nENTER ADDRESS:");
                        
                                String add=obj.next(); 
                                
                        System.out.println("\nENTER EMP ID:");
                        
                                int eid=obj.nextInt();
                                
                        System.out.println("\nENTER COMPANY NAME:");  
                                String cnm=obj.next();
                                
                        System.out.println("\nENTER QUALIFICATION");      
                                String qfn=obj.next();
                                
                        System.out.println("\nENTER SALARY:");
                        
                                double sal=obj.nextDouble();
                                
                        System.out.println("\nENTER TEACHERS ID:");
                        
                                 int tid=obj.nextInt();
                                 
                        System.out.println("\nENTER DEPARTMENT:");
                                 String dept=obj.next();
                                 
                        System.out.println("\nENTER SUBJECT:");
                        
                                  String sub=obj.next();
                                  
                                  
                          arr[i]=new teacher(nm,gdr,age,add,eid,cnm,qfn,sal,dept,sub,tid);
                          }
                        
                                      for(int j=0;j<n;j++){
                                  
                           System.out.println("\nDETAILS OF TEACHER"+(j+1)+" ");
                           
                                 arr[j].display();
                                 
                                 }
                               }
                            
                            }
                            
                            
                            
 /*
 OUTPUT
 ENTER THE NUMBER OF TEACHERS:
2

ENTER THE DETAILS OF TEACHER 1

ENTER THE NAME:
SUMESH

ENTER GENDER:
MALE

ENTER AGE:
32

ENTER ADDRESS:
KOZHIKODE

ENTER EMP ID:
1

ENTER COMPANY NAME:
INFOSYS

ENTER QUALIFICATION
MCA

ENTER SALARY:
50000

ENTER TEACHERS ID:
1       

ENTER DEPARTMENT:
MCA 

ENTER SUBJECT:
JAVA

ENTER THE DETAILS OF TEACHER 2

ENTER THE NAME:
JYOTHI

ENTER GENDER:
FEMALE

ENTER AGE:
28

ENTER ADDRESS:
KOZHIKODE

ENTER EMP ID:
2

ENTER COMPANY NAME:
MAHINDRA

ENTER QUALIFICATION
MCA

ENTER SALARY:
60000

ENTER TEACHERS ID:
2

ENTER DEPARTMENT:
MCA

ENTER SUBJECT:
PYTHON


DETAILS OF TEACHER1 

NAME:MALE
GENDER:SUMESH
AGE:0
ADDRESS:KOZHIKODE

EMP ID:1
COMPANY NAME:INFOSYS
QUALIFICATION:MCA
SALARY:50000.0

TEACHERS ID:1
DEPARTMENT:JAVA
SUBJECT:MCA
 
 
 
DETAILS OF TEACHER2 

NAME:FEMALE
GENDER:JYOTHI
AGE:0
ADDRESS:KOZHIKODE

EMP ID:2
COMPANY NAME:MAHINDRA
QUALIFICATION:MCA
SALARY:60000.0

TEACHERS ID:2
DEPARTMENT:PYTHON
SUBJECT:MCA
                           
                 */          
