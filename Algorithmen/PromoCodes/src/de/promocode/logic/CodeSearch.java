package de.promocode.logic;

public class CodeSearch {

	public static int NOT_FOUND = -1;

	/**
	 * Sucht einen Code in der Liste.
	 * 
	 * @param list
	 *            Liste der Codes im Long-Format
	 * @param searchValue
	 *            Gesuchter Code
	 * @return Index des Codes, wenn er vorhanden ist, NOT_FOUND wenn er nicht
	 *         gefunden werden konnte
	 */
	public static int findPromoCode(long[] list, long searchValue) {
		long links = 0;
		long rechts = list.length -1;
		while (links <= rechts) {

	        long mitte = (links + rechts) / 2;
	        
	        if (list[(int) mitte] == searchValue) {
	            return mitte;
	        }

	        else if (list[(int) mitte] < searchValue) {
	            links = mitte + 1;
	        }

	        else {
	            rechts = mitte - 1;
	}
	      
	    }
		  
		}

		return NOT_FOUND;
	}


