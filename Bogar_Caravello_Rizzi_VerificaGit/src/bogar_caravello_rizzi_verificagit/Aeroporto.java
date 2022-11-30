/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bogar_caravello_rizzi_verificagit;

/**
 *
 * @author 4ib
 */
public class Aeroporto {
    private String citta;
    private float superficie;
    Aereo[] aerei = new Aereo[5];
    Pilota[] piloti = new Pilota[5];
    
    public Aeroporto(){
        
    }
    
    public Aeroporto(String citta, float superficie){
        this.citta = citta; 
        this.superficie = superficie;
    }
    
    public String getCitta(){
        return citta;
    }
    
    public void setCitta(String citta){
        this.citta = citta;
    }
    
    public float getSuperficie(){
        return superficie;
    }
    
    public void setSuperficie(float superficie){
        this.superficie = superficie;
    }
}

