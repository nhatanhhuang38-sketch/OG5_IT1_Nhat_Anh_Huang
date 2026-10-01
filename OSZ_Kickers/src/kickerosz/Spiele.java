package kickerosz;

public class Spiele {
	
//Attribute
private String gastOderHeim;
private int gastTore;
private int heimTore;
private String date;

//Konstruktor
public Spiele(String gastOderHeim, int gastTore, int heimTore, String date) {
	super();
	this.gastOderHeim = gastOderHeim;
	this.gastTore = gastTore;
	this.heimTore = heimTore;
	this.date = date;
}

//Getter Setter
public String getGastOderHeim() {
	return gastOderHeim;
}
public void setGastOderHeim(String gastOderHeim) {
	this.gastOderHeim = gastOderHeim;
}
public int getGastTore() {
	return gastTore;
}
public void setGastTore(int gastTore) {
	this.gastTore = gastTore;
}
public int getHeimTore() {
	return heimTore;
}
public void setHeimTore(int heimTore) {
	this.heimTore = heimTore;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}



}
