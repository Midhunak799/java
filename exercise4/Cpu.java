/*
Create CPU with attribute price. Create inner class
Processor (no. of cores, manufacturer)and static nested class
RAM (memory, manufacturer). Create an object of CPU and
print information of Processor and RAM.
*/
class Cpu{
	double price=8000;
		void display(){
				System.out.println("CPU DETAILS\n\nPRICE="+price);
				Processor p=new Processor();
				Ram r= new Ram();
		
		
		}
			
			
			
			class Processor{
					int no_of_cores=5;
					String manifacture="AMD";
					Processor(){
						System.out.println("\nPROCESSOR");
						System.out.println("NUMBER OF CORES="+no_of_cores+"\nMANIFACTURE:"+manifacture);
						
					}
			
			}
			static class Ram{
					int memmory=8;
					String manifacture="BBK";
					Ram(){
							System.out.println("\nRAM");
							System.out.println("MEMMORY="+memmory+"\nMANIFACTURE:"+manifacture);
							
					
					}
					
			}
			

}



class Main{
	public static void main(String ar[]){
					Cpu cpu=new Cpu();
					cpu.display();
			
			}


}
/*
output
CPU DETAILS
PRICE=8000.0
PROCESSOR
NUMBER OF CORES=5
MANIFACTURE:AMD
RAM
MEMMORY=8
MANIFACTURE:BBK
*/

