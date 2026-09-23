package omnom;

public class Haustier {
	
	//Attribute
	private int hunger;
	private int muede;
	private int zufrieden;
	private int gesund;
	private String name;
	
	
	
	//Konstruktor
	public Haustier() {
	}
	
	public Haustier(String name) {
		this.hunger = 100;
		this.muede = 100;
		this.zufrieden = 100;
		this.gesund = 100;
		this.name = name;
	}
	
	//Eigenmethoden
	public void fuettern (int anzahl) {
		this.hunger = this.hunger + anzahl;
	}
	
	public void schlafen (int dauer) {
		this.muede = this.muede + dauer;
	}
	
	public void spielen (int dauer) {
		this.zufrieden = this.zufrieden + dauer;
	}
	
	public void heilen () {
		this.gesund = 100;
	}

	
	//Getter-Setter-Methoden
	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		if (hunger <= 100 && hunger >= 0) {
			this.hunger = hunger;
			}
		}

	public int getMuede() {
		return muede;
	}

	public void setMuede(int muede) {
		if (muede <= 100 && muede >= 0) {
			this.muede = muede;
			}
	}

	public int getZufrieden() {
		return zufrieden;
	}

	public void setZufrieden(int zufrieden) {
		if (zufrieden <= 100 && zufrieden >= 0) {
			this.zufrieden = zufrieden;
			}
	}

	public int getGesund() {
		return gesund;
	}

	public void setGesund(int gesund) {
		if (gesund <= 100 && gesund >= 0) {
			this.gesund = gesund;
			}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
