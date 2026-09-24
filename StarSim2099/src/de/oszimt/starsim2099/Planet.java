package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet extends Himmelskoerper {

	// Attribute
	private int anzahlHafen;
	
	//Konstruktor
	public Planet(double posX, double posY, String name, int anzahlHafen) {
		super(posX, posY, name);
		this.anzahlHafen = anzahlHafen;
		
	}
	
	public Planet () {};
	
	// Methoden
		public void setAnzahlHafen(int nAnzahlHafen) {
		this.anzahlHafen = nAnzahlHafen;	
		}

		
		public int getAnzahlHafen() {
			return this.anzahlHafen;	
			}
	
	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', 'E', 'R', 'D', 'E', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
