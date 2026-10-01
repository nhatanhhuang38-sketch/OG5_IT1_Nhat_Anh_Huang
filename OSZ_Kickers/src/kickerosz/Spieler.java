package kickerosz;

public class Spieler extends Person {

//Attribute
  
private int trikotnummer;
private String spielerposition;

//Konstruktor
public Spieler(String name, String telefonnummer, boolean jahresbetrag_bezahlt, int trikotnummer,
    String spielerposition) {
  super(name, telefonnummer, jahresbetrag_bezahlt);
  this.trikotnummer = trikotnummer;
  this.spielerposition = spielerposition;
}


//Getter Setter
public int getTrikotnummer() {
  return trikotnummer;
}

public void setTrikotnummer(int trikotnummer) {
  this.trikotnummer = trikotnummer;
}

public String getSpielerposition() {
  return spielerposition;
}

public void setSpielerposition(String spielerposition) {
  this.spielerposition = spielerposition;
}




}
