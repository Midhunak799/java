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
                       
                         System.out.println("Authentication succes");
                         
                         
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
                           
                           
                           
                           /*
                           ENTER USERNAME:
ghfgjg
ENTER PASSWORD:
hgfjg
AUTHENTICATION FAILD 
ENTER USERNAME:
midhunak799
ENTER PASSWORD:
akmidhun
Authentication succes





*/

