package kickerosz;



public class main {

	public static void main(String[] args) {
		
		Fuehrerschein f1 = new Fuehrerschein("011");
		Person p1 = new Person("Max", "015670872", true, f1);
		
		Fuehrerschein f2 = new Fuehrerschein("0");
		p1.setFuehrerschein(f2);
		System.out.println(p1.getFuehrerschein().getNummer());
		System.out.println(f1.getNummer());
		System.out.println(f2.getNummer());

	}

}
