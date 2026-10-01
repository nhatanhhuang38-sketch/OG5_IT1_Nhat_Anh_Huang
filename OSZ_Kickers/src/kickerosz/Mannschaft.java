package kickerosz;

public class Mannschaft {
	
//Attribute
private String name;
private String spielklasse;
private Mannschaftsleiter mannschaftsleiter;

//Konstruktor
public Mannschaft(String name, String spielklasse) {
	super();
	this.name = name;
	this.spielklasse = spielklasse;
}



//Getter Setter
public Mannschaftsleiter getMannschaftsleiter() {
	return mannschaftsleiter;
}

public void setMannschaftsleiter(Mannschaftsleiter mannschaftsleiter) {
	this.mannschaftsleiter = mannschaftsleiter;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSpielklasse() {
	return spielklasse;
}
public void setSpielklasse(String spielklasse) {
	this.spielklasse = spielklasse;
}



}
