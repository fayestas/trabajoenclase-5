import java.util.Scanner;
public class Factorial{
	public static void main(String args[]){
		Scanner fr= new Scanner(System.in);
			int num;
			int factorial=1;
			int x=1;
			System.out.println("Ingrese un valor");
			num=fr.nextInt();
			
			
		while(x<=num){
			
			factorial=(factorial*x);
			x++;
			
			
		}
		
		System.out.println("factorial:"+factorial);
		
		
		
	}
}