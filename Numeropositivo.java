import java.util.Scanner;
public class Numeropositivo{
	public static void main(String args[]){
		Scanner fr= new Scanner(System.in);
			System.out.println("Ingrese Numero");
			


			int num=fr.nextInt();
			System.out.println("-------------------");
			

			
			
		if(num<1){
			System.out.println("Error");
			
		}else{
			int num2=1;
			while(num2<=num){
				
				System.out.println(num2);

				num2++;


			}
		}

		
		
	}
}