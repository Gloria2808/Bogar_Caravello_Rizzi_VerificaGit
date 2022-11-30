package bogar_caravello_rizzi_verificagit;
import java.util.*;

public class Bogar_Caravello_Rizzi_VerificaGit {

    
    public static void main(String[] args) {
        
        String citta=" ";
        float superficie=0;
        Aereo[] aerei = new Aereo[5];
        
        aerei[0]= new Aereo("A", 100, "ALITALIA", "FFF");
        aerei[1]= new Aereo("B", 200, "ALIBABA", "CCC");
        aerei[2]= new Aereo("C", 300, "RIZZI", "GGG");
        aerei[3]= new Aereo("D", 100, "NON", "EEE");
        aerei[4]= new Aereo("E", 100, "ECCOCI", "HHH");
        
            System.out.println("L?areoporto di "+citta+" ha una superficie di "+superficie+". Gli aerei disponibili sohno "+Arrays.toString(aerei));
    }
    
}
