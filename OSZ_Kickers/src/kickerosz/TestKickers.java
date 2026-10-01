package kickerosz;

public class TestKickers {

  public static void main(String[] args) {
    
    Person a = new Person("Max","01502783274", true);
    Spieler mueller = new Spieler("Müller", "015123772193", true, 28, "Stürmer");
    Trainer jan = new Trainer("Jan", "016213674532", false, 'C', 450);
    Schiedsrichter johan = new Schiedsrichter("Johan", "0123233772193", true, 28);
    Mannschaft oszKICKS = new Mannschaft("OSZ_KICKERS", "D1");
    Mannschaftsleiter Max = new Mannschaftsleiter("Max", "9034834050", true, 7, "Stürmer", "OSZKIckers", 50, oszKICKS);
  }

}
