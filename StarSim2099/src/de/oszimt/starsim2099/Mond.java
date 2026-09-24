package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mond extends Himmelskoerper {

	// Attribute
	private String erzart;
	
	// Methoden
		public Mond(double posX, double posY, String name, String erzart) {
		super(posX, posY, name);
		this.erzart = erzart;
		}
		
		
			
		public Mond() {
			
		}



		public Mond(int universumHoehe, int universumHoehe2, Object name, int universumHoehe3) {
			// TODO Auto-generated constructor stub
		}



		public String getErzart() {
			return erzart;
		}

		public void setErzart(String erzart) {
			this.erzart = erzart;
		}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
