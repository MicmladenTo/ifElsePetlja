package ifElsePetlja;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		num = scn.nextInt();
		
		if (num > 0) {
			System.out.println("Broj je pozitivan");
		} else if (num == 0) {
			System.out.println("Broj je 0");
		} else {
			System.out.println("Broj je negativan");
		}
		System.out.println("Kraj programa.");
	}
}
//Napisati program koji kada unesete neki broj kaze
		//da li je broj pozitivan ili negativan