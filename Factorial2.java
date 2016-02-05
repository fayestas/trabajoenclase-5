import java.util.Scanner;
public class Factorial2{
	public static void main(String args[]){
		Scanner fr= new Scanner(System.in);
			

			int factorial=1;
			int x=1;
		
			
			
		while(x<=10){
			
			factorial=(factorial*x);
			System.out.print(x );
			System.out.print("*");
			System.out.print(factorial );
			x++;
			//.out.println(x);
			
			
		}
		
		System.out.println("factorial:"+factorial);
		
		
		
	}
}