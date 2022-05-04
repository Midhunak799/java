/*
Write a program to search an element in an array using
a) linear search
b) simple binary search
c) recursive binary search
d) using Arrays .binarySearch ()
*/


import java.util.*;
class ArraySearch{

	 int linear(int arr[],int item,int len){  //for linear search
		int j=0;
		while(j<len){
			if(arr[j]==item){
				return j;
			}
			j++;
		}
		return -1;
		
	
	
	}
	int binary(int arr[],int item,int low,int high){   // binary search
		while(low<=high){
			int mid=low+(high-low)/2;
			
			if(arr[mid]==item){
				return mid;
			
			}
			else if(arr[mid]<item){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return -1;
	
	}
	int recursiveBinarySearch(int arr[],int item,int low,int high){		//recursiveBinarySearch search
		
		if(low<=high){
		
			int mid=low+(high-low)/2;
			if(arr[mid]==item){
				
				return mid;
				
			}
			else if(arr[mid]<item){
				return recursiveBinarySearch(arr,item,mid+1,high);
			}
			else{
				return recursiveBinarySearch(arr,item,low,mid-1);							
			}
		}
		return -1;
	
	}
	
	
	
	
	
	
	public static void main(String args[]){		//main methord
		Scanner ob =new Scanner(System.in);//scanner object
		ArraySearch s= new ArraySearch();	//object for class ArraySearch
		System.out.print("ENTER NUMBER OF ELEMENTS IN THE ARRAY:");
		int n= ob.nextInt();
		int array[]=new int[n];  //initialise array 
		
		System.out.println("ENTER THE ELEMENTS:");
		for(int i=0;i<n;i++){
		
			array[i]=ob.nextInt();
		
		}
		Arrays.sort(array);
		
		System.out.print("ENTER THE ELEMENTS TO SEARCH:");
		int item=ob.nextInt();
		
		System.out.println("LINEAR SEARCH:");
		int result=s.linear(array,item,n);
		if(result==-1){
			System.out.println("ITEM NOT FOUND");
		}
		else{
			System.out.println("ITEM FOUND AT INDEX POSITION:"+result);
		}
		
		
		
		System.out.println("BINARY SEARCH:");
		int result1=s.binary(array,item,0,n-1);
		
		if(result1==-1){
			System.out.println("ITEM NOT FOUND");
		}
		else{
			System.out.println("ITEM FOUND AT INDEX POSITION:"+result1);
		}
		
		
		
		System.out.println("RECURSIVE BINARY SEARCH:");
		
		int result2=s.recursiveBinarySearch(array,item,0,n-1);
		
		if(result2==-1){
			System.out.println("ITEM NOT FOUND");
		}
		else{
			System.out.println("ITEM FOUND AT INDEX POSITION:"+result2);
		}
		
		
		System.out.println("USING ARRAY BINARY SEARCH():");
		int result3=Arrays.binarySearch(array,item);
		System.out.println("ITEM FOUND AT INDEX POSITION:"+result3);
		
		
		
		
	
	}


}
/*
ENTER NUMBER OF ELEMENTS IN THE ARRAY:6

ENTER THE ELEMENTS:
2 3 5 7 9 11

ENTER THE ELEMENTS TO SEARCH:5

LINEAR SEARCH:
ITEM FOUND AT INDEX POSITION:2

BINARY SEARCH:
ITEM FOUND AT INDEX POSITION:2

RECURSIVE BINARY SEARCH:
ITEM FOUND AT INDEX POSITION:2

USING ARRAY BINARY SEARCH():
ITEM FOUND AT INDEX POSITION:2
*/

