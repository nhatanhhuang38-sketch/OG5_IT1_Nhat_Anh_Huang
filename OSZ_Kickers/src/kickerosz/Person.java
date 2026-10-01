package kickerosz;

public class Person {

//Attribute
private String name;
private String telefonnummer;
private boolean jahresbetrag_bezahlt;

//Konstruktor
  public Person(String name, String telefonnummer, boolean jahresbetrag_bezahlt) {
    this.name = name;
    this.telefonnummer = telefonnummer;
    this.jahresbetrag_bezahlt = jahresbetrag_bezahlt;
}

//Getter Setter
public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
public String getTelefonnummer() {
  return telefonnummer;
}
public void setTelefonnummer(String telefonnummer) {
  this.telefonnummer = telefonnummer;
}
public boolean isJahresbetrag_bezahlt() {
  return jahresbetrag_bezahlt;
}
public void setJahresbetrag_bezahlt(boolean jahresbetrag_bezahlt) {
  this.jahresbetrag_bezahlt = jahresbetrag_bezahlt;
}

}
