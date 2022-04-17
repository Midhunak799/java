//add two complex numbers
import java.util.*;
class complex {
  
                                  
    int real, image;              //VARIABLES TO REAL AND IMAGINARY PART OF COMPLEX NUMBER
  
                                     
    public complex(int r, int i)
    {
        this.real = r;            //CONSTRUCTOR USED TO CREATING COMPLEX NUMBERS
        this.image = i;
    }
  
                                                 
    public void showC()
    {
        System.out.print(this.real + " +i" + this.image);
    }
  
                                                      
    public static complex add(complex n1, complex n2)      //FUNCTION FOR ADDITION
    {
  
      
        complex res = new complex(0, 0);      
  
                                         
        res.real = n1.real + n2.real;       // ADDING REAL PART OF BOTH COMPLEX NUMBERS
        res.image = n1.image + n2.image;   //ADDING IMAGINARY PART
  
                                                      // RETURNING RESULT
        return res;
    }
  
    public static void main(String arg[])
    {
  
                                                          // CREATING TWO COMPLEX NUMBERS
           complex c1 = new complex(4, 5);
           complex c2 = new complex(10, 5);
                                                              // PRINTING COMPLEX NUMBERS
          System.out.print("FIRST COMPLEX NUMBER: ");
        c1.showC();
          
        System.out.print("\nSECOND COMPLEX NUMBER: ");
        c2.showC();
  
                                                           //  add() PERFORM ADDITION
        complex res = add(c1, c2);
  
                                                              
        System.out.println("\nSUM OF TWO COMPLEX NUMBER IS :");// DISPLAY SUM OF TWO COMPLEX NUMBER
        res.showC();
    }
}

/*

FIRST COMPLEX NUMBER: 4 +i5
SECOND COMPLEX NUMBER: 10 +i5
SUM OF TWO COMPLEX NUMBER IS :14 +i10
*/

