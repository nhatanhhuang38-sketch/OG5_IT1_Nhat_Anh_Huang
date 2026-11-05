package Primzahl;

public class Primzahlenpruefer {

	public static boolean isPrim(long zahl) {
		zahl = Math.abs(zahl); // Eingabe negativer Zahlen wird abgefangen
		if (zahl < 2)
			return false;
		for (long teiler = 2; teiler < zahl; teiler++) {
			if (zahl % teiler == 0) {
				return false;
			}
		}
		return true;
	}
}