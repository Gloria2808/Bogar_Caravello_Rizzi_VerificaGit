/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bogar_caravello_rizzi_verificagit;
import java.util.*;
/**
 *
 * @author 4ib
 */
public class Bogar_Caravello_Rizzi_VerificaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String citta=" ";
        double superficie=0.0;
        Aereo[] aerei = new Aereo[5];
        Pilota[] piloti = new Pilota[5];

        aerei[0]=new Aereo("A",100,"ALITALIA", "FFF");
        aerei[1]=new Aereo("B",200,"ALIBABA", "CCC");
        aerei[2]=new Aereo("C",300,"RIZZI", "GGG");
        aerei[3]=new Aereo("D",100,"NON", "EEE");
        aerei[4]=new Aereo("E",100,"ECCOCI", "HHH");

        piloti[0]=new Pilota("AB","MARIO","BIANCHI","CAPO");
        piloti[1]=new Pilota("CD","MARCO","NERO","COPILOTA");
        piloti[2]=new Pilota("EF","MAURO","VERDE","CAPETTO");
        piloti[3]=new Pilota("GH","MIMMO","BERARDI","CAPINO");
        piloti[4]=new Pilota("IL","GRAZIANO","PELLE","VICE");
    
        
        System.out.println("L'aereoporto di "+citta+"ha una superficie di "+superficie);
        
        for(int i = 0; i< 4; i++)
        {System.out.println("Gli aerei disponibili sono " + aerei[i]);
        }
        
        for( int i = 0; i< 4; i++){
            System.out.println("Ci lavorano i piloti"+piloti[i]);
        }
    }
    
}