/*3. Write a program has classes Publisher, Book, Literature and Fiction. Read the
information and print the details of books from either the category, using
inheritance
Class Publisher- Attribute PublisherName, Method display()
Class Book subclass of Publisher- Attribute- Title, Author, Method display()
Class Literature subclass of Book-Attribute-type, Method display()
Class Fiction subclass of Book-Attribute-genre, Method display()*/

import java.util.*;
class Publisher{
	String pname;

	Publisher(String pnm){
		pname=pnm;

	}
	void display(){
		System.out.println("PUBLISHER NAME :"+pname);
	} 
	

}

class Book extends Publisher {
	String title;
	String Author;

	Book(String pnm,String ttl,String atr){
		super(pnm);
		title=ttl;
		Author=atr;
		
	}
	void display(){
		super.display();
		System.out.println("TITLE :"+title);
                System.out.println("AUTHOR:"+Author);
	} 

	

}

class Literature extends Book{
	String type;
	Literature(String pnm,String ttl,String atr,String typ){
		super(pnm,ttl,atr);
		type=typ;

	}
	void display(){
		super.display();
		System.out.println("TYPE :"+type);
	} 
	

}

class Fiction  extends Book{
	
	String genre;

	Fiction(String pnm,String ttl,String atr,String gnr){
		super(pnm,ttl,atr);
		genre=gnr;
	
	}
	void display(){
		super.display();
		System.out.println("GENRE :"+genre);
	} 

}


class Main {
	public static void main(String ar[]){

		Scanner sc= new Scanner(System.in);
		System.out.print("ENTER THE NUMBER OF LITERATURE BOOKS:");
		int nlb=sc.nextInt();
		Literature [] arr= new Literature[nlb];
		
		System.out.println("ENTER THE DETAILS OF LITERATURE BOOK:");
		for(int i=0;i<nlb;i++){
			System.out.print("BOOK"+(i+1));	
			System.out.print("\nPUBLISHER NAME:");
			String pnm=sc.next();
			
			System.out.print("TITLE:");
			String title=sc.next();
			
			System.out.print("AUTHOR NAME:");
			String author=sc.next();

			System.out.print("TYPE:");
			String type=sc.next();

			arr[i] =new Literature(pnm,title,author,type);
	

		}

		
		





		System.out.print("ENTER THE NUMBER OF FICTION BOOKS:");
		int nfb=sc.nextInt();
		Fiction [] arr1= new Fiction[nfb];
		
		System.out.println("ENTER THE DETAILS OF FICTION BOOK:");
		for(int i=0;i<nfb;i++){
			System.out.print("BOOK"+(i+1));	
			System.out.print("\nPUBLISHER NAME:");
			String pnm=sc.next();
			
			System.out.print("TITLE:");
			String title=sc.next();
			
			System.out.print("AUTHOR NAME:");
			String author=sc.next();

			System.out.print("ENTER GENRE:");
			String gnr=sc.next();

			arr1[i] =new Fiction(pnm,title,author,gnr);
	

		}

		do{
					System.out.println("\n1.LITERATURE \n2.FICTION \n3.EXIT");
					System.out.println("SELECT OPTION: ");
					int opt =sc.nextInt();
					
		
					
					switch(opt){
						case 1:System.out.println("LITERATURE BOOKS\n");
							   for(int i=0;i<nlb;i++)
								{
									System.out.println("BOOK "+(i+1));
									arr[i].display();

								}
							   
								break;
						case 2:System.out.println("FICTION BOOKS\n");
								for(int i=0;i<nfb;i++)
								{
									System.out.println("BOOK "+(i+1));
									arr1[i].display();

								}
								break;
						default: System.out.println("EXITING");
								System.exit(0);
								break;
								
					
					
					}
					
					
			
			
			
			}while(true);






	}


}


/*
OUTPUT
ENTER THE NUMBER OF LITERATURE BOOKS:2
ENTER THE DETAILS OF LITERATURE BOOK:
BOOK1
PUBLISHER NAME:MDN
TITLE:DHONI
AUTHOR NAME:MIDHUN
TYPE:LITERATURE
BOOK2
PUBLISHER NAME:AKM
TITLE:SACHIN
AUTHOR NAME:JITHU
TYPE:LITERATURE
ENTER THE NUMBER OF FICTION BOOKS:2
ENTER THE DETAILS OF FICTION BOOK:
BOOK1
PUBLISHER NAME:AWM
TITLE:CAPTAIN
AUTHOR NAME:SURYA
ENTER GENRE:FICTION
BOOK2
PUBLISHER NAME:UMP
TITLE:COOL
AUTHOR NAME:ANAND
ENTER GENRE:FICTION

1.LITERATURE 
2.FICTION 
3.EXIT
SELECT OPTION: 
1
LITERATURE BOOKS

BOOK 1
PUBLISHER NAME :MDN
TITLE :DHONI
AUTHOR:MIDHUN
TYPE :LITERATURE
BOOK 2
PUBLISHER NAME :AKM
TITLE :SACHIN
AUTHOR:JITHU
TYPE :LITERATURE

1.LITERATURE 
2.FICTION 
3.EXIT
SELECT OPTION: 
2
FICTION BOOKS

BOOK 1
PUBLISHER NAME :AWM
TITLE :CAPTAIN
AUTHOR:SURYA
GENRE :FICTION
BOOK 2
PUBLISHER NAME :UMP
TITLE :COOL
AUTHOR:ANAND
GENRE :FICTION

1.LITERATURE 
2.FICTION 
3.EXIT
SELECT OPTION: 
3
EXITING
*/
