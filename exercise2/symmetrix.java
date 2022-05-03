/*
Read a matrix from the console and check whether it is
symmetric or not.
*/

import java.util.*;


public class symmetrix {
	
	public static void main(String args []) {			//main function
		Scanner obj = new Scanner(System.in);
		System.out.println("ENTER THE ROWS AND COLUMNS:");
		System.out.print("ROWS:");
		int rows=obj.nextInt();
		System.out.print("COLUMNS :");
		int cols=obj.nextInt();
		
		int array1[][]= new int[rows][cols];// array initialization
		
		
		System.out.println("ENTER THE ELEMENTS IN FIRST MATRIX:"); // insert elements
		for (int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				array1[i][j]=obj.nextInt();
				
			}
			
		}
		boolean same =false;
		for (int i=0;i<rows;i++) //creating transpose of the matrix
		{
			for(int j=0;j<cols;j++) 
			{
				if(array1[i][j]==array1[j][i]){
						same=true;
				
				}
				else{
						same=false;
						break;
						
				}
					
				
			}	
			
		}
		if(same){
			System.out.println("IT IS A SYMMETRIX MATRIX");

				
		}
		else{
				System.out.println("IT IS NOT A SYMMETRIX MATRIX");
		}
		
}
}
/*
ENTER THE ROWS AND COLUMNS:
ROWS:3
COLUMNS :3
ENTER THE ELEMENTS IN FIRST MATRIX:
1 2 3
4 5 6
7 8 9
IT IS NOT A SYMMETRIX MATRIX

ENTER THE ROWS AND COLUMNS:
ROWS:3
COLUMNS :3
ENTER THE ELEMENTS IN FIRST MATRIX:
1 2 3
2 3 4
3 4 5
IT IS A SYMMETRIX MATRIX
*/
		
		
		
		
		
