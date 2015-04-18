import java.util.Scanner;

public class klasaLemur{
	public static void main(String [] args){
		System.out.println("Podaj imię");
		String imie;
		Scanner imieS = new Scanner(System.in);
		imie=imieS.nextLine();
		System.out.println("Witaj "+imie);
	}
}