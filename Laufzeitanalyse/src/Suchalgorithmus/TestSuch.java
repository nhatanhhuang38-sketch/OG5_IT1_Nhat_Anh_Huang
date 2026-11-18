package Suchalgorithmus;

import java.util.*;

import Analyse.Stoppuhr;

public class TestSuch {

	public static void main(String[] args) {
		
		
		//Scanner und Stoppuhr
		Stoppuhr stop = new Stoppuhr();
		Scanner sn = new Scanner(System.in);
		
		//Liste erstellen
		long [] liste = SortedListGenerator.getSortedList(20000000);
		
		//Test
		System.out.println("Welche Zahl wollen sie in der Liste suchen?");
		int gesucht = sn.nextInt();
		
		//Stoppuhr
		stop.start();
		
		//Binäre Suche
		BinaereSuche.binSuch(liste, gesucht);
		
		//Stoppuhr
		stop.stopp();
		
		//Ausgabe
		System.out.println( "Die Laufzeit in Millisekunden beträgt " + stop.getMillis() + " ms" );
		System.out.println( "Die Laufzeit in Sekunden beträgt " + stop.getSeconds() + " s" );
		

	}

}
