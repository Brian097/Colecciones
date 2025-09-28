package poo.coleccionesejtresp.uno;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {
    //ATRIBUTOS
    private ArrayList<Carta> baraja;
    
    //CONSTRUCTORES
    public Mazo() {
        baraja = new ArrayList<>();
    }
    
    //METODOS PRIMITIVOS
    //void insertar(Carta a) (Recibe una carta y lo inserta en la baraja)
    public void insertar(Carta a) {
        baraja.add(a);
    }

    //void eliminar(Carta a) (Recibe una carta y lo elimina de la baraja)
    public void eliminar(Carta a) {
        baraja.remove(a);
    }

    //boolean seEncuentra(Carta a) (Devuelve true si “a” se encuentra en la baraha)
    public boolean seEncuentra(Carta a) {
        return baraja.contains(a);
    }

    //Carta devolver(int i) (Devuelve la carta en la posición i)
    public Carta devolver(int i) {
        return baraja.get(i);
    }

    //boolean esVacia() (Devuelve true si la baraja no tiene elementos)
    public boolean esVacia() {
        return baraja.isEmpty();
    }

    //int cantidad (Devuelve cantidad de elementos de la baraja)
    public int cantidad() {
        return baraja.size();
    }
    
    //METODOS ESPECIFICOS
    //crear() : void
    /*
    • El método crear genera un mazo de 48 cartas españolas (basto, copa, espada y oro,
    12 de cada una). Se recomienda crear el mazo en orden: 12 cartas de basto, 12 de copa, etc.
    */
    public void crear() {
        String[] palos = {"Basto", "Copa", "Espada", "Oro"};
        
        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                Carta nuevaCarta = new Carta(i, palo);
                baraja.add(nuevaCarta);
            }
        }
        
    }

    //void imprimir todos (extra)
    public void imprimirTodos() {
        for (Carta a : baraja) {
            System.out.println(a);
        }
    }
    
    //barajar() : void
    /*
    • El método barajar organiza las cartas del atributo baraja de forma aleatoria. 
    Se recomienda utilizar una baraja auxiliar, que utilice el método crear, 
    para luego guardar cartas de forma aleatoria al atributo baraja.
    */
    public void barajar() {
        Random aleatorio = new Random();
        
        int indice;
        Carta cartaElejida;
        
        //Creo el mazo auxiliar
        Mazo auxiliar = new Mazo();
        auxiliar.crear();
        
        //Aca guardo el mazo barajado
        ArrayList<Carta> mazoAuxiliar = new ArrayList<>(); 
        
        while (auxiliar.cantidad() > 0) {
            indice = aleatorio.nextInt(auxiliar.cantidad()); //Elijo un indice aleatorio
            
            //Obtengo la carta de ese indice
            cartaElejida = auxiliar.devolver(indice);
            
            //Añado la carta aleatoriamente al siguiente indice disponible
            mazoAuxiliar.add(cartaElejida); 
            
            //Elimino la carta ya colocada asi pasamos a otra
            //Ir borrando nos ayuda a la condicion en while
            auxiliar.eliminar(cartaElejida);
        }
        //Remplazo la baraja ordenada por la barajada
        baraja = mazoAuxiliar;        
    }
}
