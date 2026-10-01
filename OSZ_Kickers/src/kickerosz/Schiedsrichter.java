package kickerosz;

public class Schiedsrichter extends Person {
  
//Attribute
private int anzahl_gepfiffeneSpiele;

//Konstruktor
public Schiedsrichter(String name, String telefonnummer, boolean jahresbetrag_bezahlt, int anzahl_gepfiffeneSpiele) {
  super(name, telefonnummer, jahresbetrag_bezahlt);
  this.anzahl_gepfiffeneSpiele = anzahl_gepfiffeneSpiele;
}


//Getter/Setters
public int getAnzahl_gepfiffeneSpiele() {
  return anzahl_gepfiffeneSpiele;
}

public void setAnzahl_gepfiffeneSpiele(int anzahl_gepfiffeneSpiele) {
  this.anzahl_gepfiffeneSpiele = anzahl_gepfiffeneSpiele;
}


}
