
import java.util.*;

public class TestPrimzahl {

	public static void main(String[] args) {
		
	Scanner sn = new Scanner(System.in);
	
	Stoppuhr stop = new Stoppuhr();
	

	System.out.println("Welche Zahl soll auf eine Primzahl geprüft werden?");
	long primzahl = sn.nextLong();
	stop.start();
	
	boolean isPrim = Primzahlenpruefer.isPrim(primzahl);
	System.out.println(isPrim);
	
	stop.stopp();
	
	System.out.println(stop.getMillis());
	System.out.println(stop.getSeconds());
	} 
	
	

}
