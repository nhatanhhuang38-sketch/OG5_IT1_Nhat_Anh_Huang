package kickerosz;

public class Mannschaftsleiter extends Spieler {

//Attribute
private String mannschaftsname;
private double rabatt;
private Mannschaft mannschaft;

//Konstruktor
public Mannschaftsleiter(String name, String telefonnummer, boolean jahresbetrag_bezahlt, int trikotnummer,
    String spielerposition, String mannschaftsname, double rabatt, Mannschaft mannschaft) {
  super(name, telefonnummer, jahresbetrag_bezahlt, trikotnummer, spielerposition);
  this.mannschaftsname = mannschaftsname;
  this.rabatt = rabatt;
  this.mannschaft = mannschaft;
}

public Mannschaft getMannschaft() {
	return mannschaft;
}

public void setMannschaft(Mannschaft mannschaft) {
	this.mannschaft = mannschaft;
}

//Getter/Setter
public String getMannschaftsname() {
  return mannschaftsname;
}


public void setMannschaftsname(String mannschaftsname) {
  this.mannschaftsname = mannschaftsname;
}


public double getRabatt() {
  return rabatt;
}


public void setRabatt(double rabatt) {
  this.rabatt = rabatt;
}



}
