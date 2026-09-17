package de.oszimt.starsim2099;

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pilot {

	// Attribute
	private double posX;
	private double posY;
	private String grad;
	private String name;
	
	// Methoden
	
	
	public void setGrad(String nGrad) {
	this.grad = nGrad;	
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
	
	public String getGrad() {
		return this.grad;	
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
}
