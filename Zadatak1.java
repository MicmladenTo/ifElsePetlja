package ifElsePetlja;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite broj godina: ");
		age = scn.nextInt();
		
		
		if (age<18) {
			System.out.println("Osoba je maloletna");
		} else {
			System.out.println("Osoba je punoletna");
		}
		System.out.println("Kraj programa.");
	}

}

//uneti vrednost promenjive kroz tastaturu i napisati da li je ta osoba punoletna ili maloletna
