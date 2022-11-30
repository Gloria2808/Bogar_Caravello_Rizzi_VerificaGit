package bogar_caravello_rizzi_verificagit;

public class Aereo {
    private String codice;
    private int nPosti;
    private String marca;
    private String modello;
    
    public Aereo(){}

    public Aereo(String codice, int nPosti, String marca, String modello) {
        this.codice = codice;
        this.nPosti = nPosti;
        this.marca = marca;
        this.modello = modello;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public int getnPosti() {
        return nPosti;
    }

    public void setnPosti(int nPosti) {
        this.nPosti = nPosti;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
    
    
}
