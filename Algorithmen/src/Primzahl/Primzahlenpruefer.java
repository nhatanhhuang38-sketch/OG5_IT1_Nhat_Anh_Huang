package Primzahl;

import java.util.*;

public class Primzahlenpruefer {

Scanner sn = new Scanner(System.in);

	private long zahl = sn.nextLong();
	
	
public static boolean isPrim(long zahl){
	
	if(zahl < 2) {
	return false;
	} 
	else {
	for (int i = 2; zahl != 0; i++) {
		long n = zahl/i;
		if(n == 0) {
			return false;}
	}
	
}
		
}	