package poo.coleccionesejtresp.uno;

public class Principal {
    public static void main(String[] args) {
        BlackJack mazo = new BlackJack();
        
        mazo.crear();
        
        System.out.println("");                
        System.out.println("CARTAS SIN BARAJAR");
        System.out.println("");
        
        mazo.imprimirTodos();
        
        System.out.println("");
        System.out.println("CARYAS BARAJADAS");
        System.out.println("");
        
        mazo.barajar();
        mazo.imprimirTodos();
 
        
    }
}
