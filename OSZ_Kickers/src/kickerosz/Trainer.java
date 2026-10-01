package kickerosz;

public class Trainer extends Person{

//Attribute
private char lizenzklasse;
private double kosten;


//Konstruktor
public Trainer(String name, String telefonnummer, boolean jahresbetrag_bezahlt, char lizenzklasse, double kosten) {
  super(name, telefonnummer, jahresbetrag_bezahlt);
  this.lizenzklasse = lizenzklasse;
  this.kosten = kosten;
}

//Getter Setter
public char getLizenzklasse() {
  return lizenzklasse;
}


public void setLizenzklasse(char lizenzklasse) {
  this.lizenzklasse = lizenzklasse;
}


public double getKosten() {
  return kosten;
}


public void setKosten(double kosten) {
  this.kosten = kosten;
}



}
