import java.util.Scanner; 
 class leap { 


     public static void main(String[] args) { 
Scanner in = new Scanner(System.in);


System.out.println("enter the month : ");
String mname=in.nextLine();
System.out.println("enter the year : ");

int y=in.nextInt();
int f=0;

if ((y%400==0)||((y%100!=0)&&(y%4==0))){
    
      System.out.println(y + " is a leap year");
      f=1;
      }
else
    
    { 
              System.out.println(y + " is not a leap year"); 
          } 
 

switch(mname)
  {

 case "january":
              
          System.out.println("31 days in this month"); 
          break; 
  
case "february":
      if(f==1)
      { 


          System.out.println("29 days in this month");
  }


      else 
       {


         System.out.println("28 days in this month"); 
          break;
}

 case "march":
              
          System.out.println("31 days in this month"); 
          break; 

 case "april":
              
          System.out.println("30 days in this month"); 
          break; 

case "may":
              
          System.out.println("31 days in this month"); 
          break; 


case "june":
              
          System.out.println("30 days in this month"); 
          break;



case "july":
              
          System.out.println("31 days in this month"); 
          break; 


case "august":
              
          System.out.println("30 days in this month"); 
          break; 


case "sept":
              
          System.out.println("31 days in this month"); 
          break; 



case "october":
              
          System.out.println("30days in this month"); 
          break;  


case "november ":
              
          System.out.println("31 days in this month"); 
          break; 



case "december":
              
          System.out.println("31 days in this month"); 
          break;


}
}
}











/*

enter the month : 
08
enter the year : 
2022
2022 is not a leap year
*/ 
