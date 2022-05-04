/*Write a menu driven program that would choose either in-built
method or call a user defined method to sort an array of strings*/
import java.util.*;


class StrSort{   //define class StrSort


	 void SortAndDisp(String arr[]){   //sort and display array
	 
	 
		String temp;
		int len =arr.length;
			for(int i=0;i<len-1;i++){
				for(int j=i+1;j<len;j++){
						if(arr[i].compareTo(arr[j])>0)	//compare all elements in array 
						{
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
						
				}
			
			}
			for(int i=0;i<len;i++){  //loop for display sorted array
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
			
		
	
	}
	String[] insert(String arr[],int len){  //for read elements to array
		
		for(int i=0;i<len;i++){
		
			arr[i]=System.console().readLine();
		}
		return arr;
	
	}
	

	public static void main(String ar[]){ //main methord
	
		StrSort st =new StrSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF STRINGS: ");
		int num = sc.nextInt();
		String str[] = new String[num];		//initialize array
		System.out.println("ENTER THE ELEMENTS IN THE ARRAY: ");
		str=st.insert(str,num);
		
		while(true){
				
			
				System.out.println("1.ARRAY SORT BY USERDEFIND METHOD\n2.ARRAY SORT BY INBUILT METHOD\n3.EXIT");
				System.out.println("ENTER YOUR OPTION : ");
				int opt = sc.nextInt();
				
				
				if(opt==1){
						
						System.out.println("ARRAY SORT BY USERDEFIND METHOD");
						st.SortAndDisp(str);
				
					
				}
				else if(opt == 2){
					System.out.println("ARRAY SORT BY INBUILT METHOD");
					Arrays.sort(str);
					for(int i=0;i<num;i++){
						System.out.print(str[i]+"\t");
					}
					System.out.println();
				}
				else{
					System.out.println("EXIT");
					System.exit(0);
				}
		
		}
		
		
	
	}


}
/*
OUTPUT
ENTER THE NUMBER OF STRINGS: 

6
ENTER THE ELEMENTS IN THE ARRAY: 
ASWIN
ANAND
SANAN
JUNAID
JITHU
ALEN


1.ARRAY SORT BY USERDEFIND METHOD
2.ARRAY SORT BY INBUILT METHOD
3.EXIT

ENTER YOUR OPTION :
1

ARRAY SORT BY USERDEFIND METHOD
ALEN	ANAND	ASWIN	JITHU	JUNAID	SANAN

	
1.ARRAY SORT BY USERDEFIND METHOD
2.ARRAY SORT BY INBUILT METHOD
3.EXIT
ENTER YOUR OPTION : 
2

ARRAY SORT BY INBUILT METHOD
ALEN	ANAND	ASWIN	JITHU	JUNAID	SANAN

	
1.ARRAY SORT BY USERDEFIND METHOD
2.ARRAY SORT BY INBUILT METHOD
3.EXIT
ENTER YOUR OPTION : 
3
EXIT
*/
