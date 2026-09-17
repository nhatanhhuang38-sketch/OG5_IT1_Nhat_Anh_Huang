package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet {

	// Attribute
	private double posX;
	private double posY;
	private int anzahlHafen;
	private String name;
	
	// Methoden
	public void setAnzahlHafen(int nAnzahlHafen) {
		this.anzahlHafen = nAnzahlHafen;	
		}
		
		public void setName(String nName) {
			this.name = nName;	
			}
		
		public void setPosX(double nPosX) {
			this.posX = nPosX;	
			}
		
		public void setPosY(double nPosY) {
			this.posY = nPosY;	
			}
		
		public int getAnzahlHafen() {
			return this.anzahlHafen;	
			}
		
		public String getName() {
			return this.name;	
			}
		
		public double getPosX() {
			return this.posX;	
			}
		
		public double getPosY() {
			return this.posY;	
			}
	
	
	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
