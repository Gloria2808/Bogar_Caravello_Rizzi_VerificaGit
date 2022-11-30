
package bogar_caravello_rizzi_verificagit;


public class Pilota {
    
    private String nPatente;
    private String nome;
    private String cognome;
    private String ruolo;

public Pilota(){
    
}

public   Pilota(String nPatente, String nome,String cognome,String ruolo){
    
        this.nome=nome;
        this.cognome=cognome;
        this.nPatente=nPatente;
        this.ruolo=ruolo;
        
}

    public String getnPatente() {
        return nPatente;
    }

    public void setnPatente(String nPatente) {
        this.nPatente = nPatente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

   
}
