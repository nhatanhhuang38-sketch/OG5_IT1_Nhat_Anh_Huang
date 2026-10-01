package kickerosz;

public class Mannschaftsleiter extends Spieler {

//Attribute
private String mannschaftsname;
private double rabatt;

//Konstruktor
public Mannschaftsleiter(String name, String telefonnummer, boolean jahresbetrag_bezahlt, int trikotnummer,
    String spielerposition, String mannschaftsname, double rabatt) {
  super(name, telefonnummer, jahresbetrag_bezahlt, trikotnummer, spielerposition);
  this.mannschaftsname = mannschaftsname;
  this.rabatt = rabatt;
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
