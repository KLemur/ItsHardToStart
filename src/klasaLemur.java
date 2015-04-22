import java.util.Scanner;

public class klasaLemur{
	public static void main(String [] args){
		//System.out.println("Podaj ilość kolumn");
		String dane[];
		dane = new String[3];

		//int n;
		//Scanner nS = new Scanner(System.in);
		//n=nS.nextInt();
		for (int i=0; i<dane.length; i++){
			System.out.println("Podaj "+i+" daną\n");
			Scanner tmpS=new Scanner(System.in);
			dane [i]=tmpS.nextLine();
		}
		System.out.println("WYŚWIETLENIE\n");
		for (int i=0; i<dane.length; i++){
			System.out.println(i+" dana:\n"+dane[i]+"\n");
		}
	}
}