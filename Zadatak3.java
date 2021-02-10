package ifElsePetlja;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		num = scn.nextInt();
		
		if (num > 999) {
			System.out.println("Broj ima preko tri cifre");
		} else if (num > 99) {
			System.out.println("Broj je trocifren");
		} else if (num > 9) {
			System.out.println("Broj je dvocifren");
		} else if (num > 0) {
			System.out.println("Broj je jednocifren");
			} else {
				System.out.println("Broj nije validan.");
			}
		}
	}
	
	// Napisati prokram gde cete uneti tastaturom
	//broj a program ce ispisati da li je taj broj jednocifren,
	//dvocifren, trocifren ili veci od trocifrenih
	// gledamo samo pozitivne brojeve / gledamo samo pozitivne brojeve