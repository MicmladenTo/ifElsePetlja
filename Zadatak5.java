package ifElsePetlja;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite x: ");
		x = scn.nextInt();
		
		System.out.println("Unesite y: ");
		y = scn.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("Brojevi su veæi od nule.");
		} else if (x > 0 || y > 0) {
			System.out.println("Samo je jedan broj veæi od nule.");
		} else {
			System.out.println("Oba broja su nula ili manje.");
		}
	}
}
/* Napisati program koji ucitava x i y sa tastature i ispisuje poruku "Brojevi su veci od nule",
ako su i x i y veci od nule, a ako je samo jedan veci od nule ispisati "samo je jedan veci od nule",
a ako su oba nula ili manje napisati "oba broja nisu veca od nule" */