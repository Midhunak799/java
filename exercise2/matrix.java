import java.util.Scanner;
 
class matrix


{
public static void main(String args[])


{
int rows, cols,i,j;


Scanner in = new Scanner(System.in);
 
System.out.println("ENTER THE NUMBER OF ROWS : ");
rows = in.nextInt();
 
System.out.println("ENTER THE NUMBER OF COLOUMS : ");
cols = in.nextInt();
 
int matrix1[][] = new int[rows][cols];
int matrix2[][] = new int[rows][cols];
int result[][] = new int[rows][cols];
 
System.out.println("ENTER FIRST MATRIX : ");
 
for (i=0;i<rows;i++)
{ 
 for(j=0;j<cols;j++)
 matrix1[i][j]=in.nextInt();
 System.out.println();
}



System.out.println("ENTER SECOND MATRIX: ");
 
for (i=0;i<rows;i++)
{
 for (j=0;j<cols;j++)
 matrix2[i][j]=in.nextInt();
 System.out.println();
}
 for(i=0;i<rows;i++)
 for(j=0;j<cols;j++)
 result[i][j]=matrix1[i][j]+matrix2[i][j] ; 
 
System.out.println("SUM OF TWO MATRIX IS :-");




 
for(i=0;i<rows;i++)
{ 
for(j=0;j<cols;j++)
System.out.print(result[i][j]+"\t");
 System.out.println();
}
 
}
}




/*
OUTPUT

ENTER THE NUMBER OF ROWS : 
3
ENTER THE NUMBER OF COLOUMS : 
3
ENTER FIRST MATRIX : 
1 2 3

4 5 6

7 8 9

ENTER SECOND MATRIX: 
5 6 7

8 9 10

11 12 13

SUM OF TWO MATRIX IS :-
6	8	10	
12	14	16	
18	20	22	
*/

