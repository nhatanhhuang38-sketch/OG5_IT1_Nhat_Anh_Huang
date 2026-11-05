package Analyse;

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
	if(isPrim == true) {
	System.out.println(primzahl + " ist eine Primzahl");
	}else if(isPrim == false){
	System.out.println(primzahl + " ist keine Primzahl");
	}
	stop.stopp();
	
	System.out.println("Die Laufzeit in Millisekunden beträgt " + stop.getMillis() + " ms");
	System.out.println("Die Laufzeit in Sekunden beträgt " + stop.getSeconds() + " s");
	
	}
	
	
	
	

}
