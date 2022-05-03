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
		/*
		int same =0;
		for (int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				if(array1[i][j]==array2[i][j])
				{
					same = 1;							
				}
				else{
						same =0;
						break;					
					}
									
			}
			}
		if(same==1){
			System.out.println("It is a symmetric matrix");
		}
		else if(same==0){
				System.out.println("It is not a symmetric matrix");
			}*/
		
}
}

		
		
		
		
		
