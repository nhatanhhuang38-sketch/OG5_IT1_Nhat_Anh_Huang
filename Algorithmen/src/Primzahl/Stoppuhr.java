package Primzahl;

public class Stoppuhr {
	  //Attribute
	  private long anfang;
	  private long ende;

	  //Methoden
	  public void start(){
	    this.anfang = System.currentTimeMillis();
	  }
	  
	  public void stopp(){
	    this.ende = System.currentTimeMillis();
	  }
	  
	  public void reset(){
	    this.anfang = 0;
	    this.ende = 0;
	  }
	  
	  public long getMillis(){
	    return ende - anfang;
	  }
	  
	  public long getSeconds(){
	    return Math.round((ende - anfang) /1000.0);
	  }
	}
