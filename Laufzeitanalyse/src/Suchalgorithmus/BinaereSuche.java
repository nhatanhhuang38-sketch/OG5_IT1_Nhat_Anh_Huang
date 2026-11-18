package Suchalgorithmus;

public class BinaereSuche {

public static long binSuch (long[] liste, long gesucht) {
	
	long links = 0;
	long rechts = liste.length -1;
	while (links <= rechts) {

        long mitte = (links + rechts) / 2;

        System.out.println("Links: " + links
                + " Rechts: " + rechts
                + " Mitte: " + mitte);

        if (liste[(int) mitte] == gesucht) {
            return mitte;
        }

        else if (liste[(int) mitte] < gesucht) {
            links = mitte + 1;
        }

        else {
            rechts = mitte - 1;
}
      
    }
	  return -1;
	}
}

