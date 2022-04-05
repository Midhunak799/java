import java.util.*;


public class matrix1 {
	
	public static void main(String args []) {                           //MAIN FUNCTION

			                                 
		Scanner obj = new Scanner(System.in);


		System.out.println("ENTER THE ROWS AND COLUMNS:");          

		System.out.print(" ENTER THE NUMBER OF ROWS :");                          
                int rows=obj.nextInt();         

		System.out.print("ENTER THE NUMBER OF COLUMNS :");
		int cols=obj.nextInt();          

		int array1[][]= new int[rows][cols];     //DECLARING ARRAYS COLUMNS                   
		int array2[][]= new int[rows][cols];
		
		System.out.println("ENTER THE ELEMENTS OF MATRIX:");       //INSERTING ELEMENTS TO MATRIX
		
                        


                for (int i=0;i<rows;i++) 
		{
		   for(int j=0;j<cols;j++) 

		 {

		    array1[i][j]=obj.nextInt();
				
		   
                 }
			
		}
		for (int i=0;i<rows;i++)                             
		{
			for(int j=0;j<cols;j++) 
			{
				array2[i][j]=array1[j][i];
				
			}
			
		}
		
		if(Arrays.deepEquals(array1, array2))                    
		{ 
			System.out.println("THIS MATRIX IS A SYMMETRIC MATRIX");
		}
		else{
			System.out.println("THIS MATRIX IS NO A SYMMETRIC MATRIX");


		}
			
			
		
		
        }
    }



/*
OUTPUT

ENTER THE ROWS AND COLUMNS:
 ENTER THE NUMBER OF ROWS :3
ENTER THE NUMBER OF COLUMNS :3
ENTER THE ELEMENTS OF MATRIX:
1 2 3
3 4 5
5 6 7
THIS MATRIX IS NO A SYMMETRIC MATRIX
_____________________________



ENTER THE ROWS AND COLUMNS:
 ENTER THE NUMBER OF ROWS :3
ENTER THE NUMBER OF COLUMNS :3
ENTER THE ELEMENTS OF MATRIX:
4 5 6
5 6 7
6 7 8
THIS MATRIX IS A SYMMETRIC MATRIX
*/

