package ifElsePetlja;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int z;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite x: ");
		x = scn.nextInt();
		
		System.out.println("Unesite y: ");
		y = scn.nextInt();
		
		System.out.println("Unesite z: ");
		z = scn.nextInt();
		
		if (x < y && y < z) {
			System.out.println("Redosled je rastuæi.");
		} else if (x > y && y > z) {
			System.out.println("Redosled je opadajuæi.");
		} else {
			System.out.println("Niz nije ni rastuæi ni opadajuæi.");
		}
		System.out.println("Kraj programa.");
	}

}
//Napisati program koji proverava da li su unete
////vrednosti X, Y i Z u opadajucem ili rastucem redosledu ili nijedno od toga
////Ispisati odgovarajuce poruke.
////Primer izvrsenje:
////unesite x: 10
////unesite y: 23
////unesite z: 99
////Vrednosti su u rastucem redosledu.