package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff {

	// Attribute
	private double posX;
	private double posY;
	private int maxKapazitaet;
	private String typ;
	private String antrieb;
	private int winkel;
	
	// Methoden
	public void setMaxKapazitaet(int nMaxKapazitaet) {
		this.maxKapazitaet = nMaxKapazitaet;	
		}
		
		public void setTyp(String nTyp) {
			this.typ = nTyp;	
			}
		
		public void setPosX(double nPosX) {
			this.posX = nPosX;	
			}
		
		public void setPosY(double nPosY) {
			this.posY = nPosY;	
			}
		
		public void setAntrieb(String nAntrieb) {
			this.antrieb = nAntrieb;	
			}
		
		public void setWinkel(int nWinkel) {
			this.winkel = nWinkel;	
			}
		
		public int getMaxKapazitaet() {
			return this.maxKapazitaet;	
			}
		
		public String getTyp() {
			return this.typ;	
			}
		
		public double getPosX() {
			return this.posX;	
			}
		
		public double getPosY() {
			return this.posY;	
			}
		
		public String getAntrieb() {
			return this.antrieb;	
			}
		
		public int getWinkel() {
			return this.winkel;	
			}
		
	// Darstellung
	public static char[][] getDarstellung() {
		char[][] raumschiffShape = { 
				{'\0', '\0','_', '\0', '\0'},
				{'\0', '/', 'X', '\\', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'/', '_', '_','_', '\\'},				
		};
		return raumschiffShape;
	}

}
