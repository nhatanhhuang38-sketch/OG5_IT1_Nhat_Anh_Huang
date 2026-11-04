package Primzahl;

import java.util.*;

public class Primzahlenpruefer {

Scanner sn = new Scanner(System.in);

	private long zahl = sn.nextLong();
	
	 public static boolean isPrim(long zahl) {

	        if (zahl < 2) {
	            return false;
	        }

	        for (long i = 2; i <= zahl / i; i++) {
	            if (zahl % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}