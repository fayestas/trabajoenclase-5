import java.util.Scanner;
public class Calcuu{
	public static void main(String args[]){
		Scanner fr= new Scanner(System.in);
		boolean continuar=false;
		//char cond;

		do{

		System.out.println("Ingrese el primer Valor");
		int valor1 =fr.nextInt();
		System.out.println("Ingrese el segundo Valor");
		int valor2 =fr.nextInt();
		System.out.println("---------------------------------------------------");
		System.out.println("Seleccione su opcion");
		System.out.println("1= sumar");
		System.out.println("2=resta");
		System.out.println("3=mult");
		System.out.println("4=div");
		System.out.println("5=exit");
		System.out.println("6=Cambiar valores");
		int menu=fr.nextInt();
		switch(menu){
			case 1 :System.out.println(valor1+valor2);
			break;
			case 2 :System.out.println(valor1-valor2);
			break;
			case 3 :System.out.println(valor1*valor2);
			break;
			case 4 :System.out.println(valor1/valor2);
			break;
			case 5:System.out.println("Bye");
			System.exit(0);
			case 6:Calcuu.main(null);
			
			default:break;

		}

		System.out.println("-------------------");
		System.out.println("Intentar de nuevo");
	
		char continuarChar=fr.next().charAt(0);
		continuar=false;
		if(continuarChar=='Y'||continuarChar=='y'){
			continuar=true;
		}
		//System.out.println("otravez? (s/n)");
			//cond = fr.next().charAt(0);
	}while(continuar);

		
		
	}
}