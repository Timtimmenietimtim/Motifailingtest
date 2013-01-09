package pandarole;

import java.lang.reflect.Array;

public class Karten {

	
	//----------Ein Deck erstellen-----------------------//
	public static int[] Deckerstellen() {
		int[] Karten = new int[52];
		for (int i = 0; i < Karten.length; i++) {
			Karten[i] = 1 * i;

		}
		return Karten;
	}

	// -------Werte der Karten-----------------------------//
	public static int wert(int n) {

		int w = n % 13;
		if (w <= 8) {
			return w + 2;
		} else if (w == 12) {
			return 11;
		} else {
			return 10;
		}

	}

	// ------------Karten mischen------------------------//

	public static void mische(int[] feld) {
		for (int i = 0; i < feld.length; i++) {
			int j = (int) (feld.length * Math.random());
			int dummy = feld[i];
			feld[i] = feld[j];
			feld[j] = dummy;
		}
	}

	// ------------Karten Name raus finden ------------------------//
	public static String cardname(int n) {
		String[] color = { "Karo ", "Herz ", "Pik ", "Kreuz " };
		String[] wert = { "2\n", "3\n", "4\n", "5\n", "6\n", "7\n", "8\n",
				"9\n", "10\n", "Bube\n\n", "Dame\n", "König\n", "Ass\n" };

		return color[n / 13] + "" + wert[n % 13];
	}

	// -----------------------------------//
	public static String takeCard(int[] Karten) {

		return null;

	}
}
