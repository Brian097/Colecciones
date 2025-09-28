package poo.coleccionesejtresp.uno;

public class Carta {
    //ATRIBUTOS 
    private int numero;
    private String palo;
    
    //CONSTRUCTORES
    //Por defecto
    public Carta() {
        this.numero = 1;
        this.palo = "ORO";
    }
    
    //Especifico
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    //GETTERS Y SETTERS
    //Getters
    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }
    
    //Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    //Metodos
    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    } 

}
