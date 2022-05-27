/* Write a user defined exception class to authenticate
the user name and password.*/

import java.util.*;

class myException extends Exception{

    public myException(String s){
    
          super(s);
          
          
          }
          }
          
          
          
       class main{
         
         
               public static void main(String arg[]){
               
               
                   String username="midhunak799";
                   
                   String password="akmidhun";
                   
                   Scanner sc=new Scanner(System.in);
                   
                   
                   
                   System.out.println("ENTER USERNAME:");
                    
                    String unm=sc.next();
                    
                   System.out.println("ENTER PASSWORD:"); 
                   
                    String psd=sc.next();
                    
                    
                  try{
                  
                  
                       if((unm.equals(username)) && (psd.equals(password))){
                       
                         System.out.println("AUTHENTICATION SUCCESS");
                         
                         
                         }
                         
                         
                         
                      else{
                      
                      
                          throw new myException("AUTHENTICATION FAILD ");
                          
                          }
                          }
                          
                     catch(myException ex){
                           
                           
                           System.out.print(ex.getMessage()+"/n");
                           
                           
                           }
                           } 
                           
                           }   
                           
                           
                           
 /* OUTPUT
ENTER USERNAME:
midhunak799
ENTER PASSWORD:
midhun
AUTHENTICATION FAILD 

ENTER USERNAME:
midhunak799
ENTER PASSWORD:
akmidhun
AUTHENTICATION SUCCESS                       
