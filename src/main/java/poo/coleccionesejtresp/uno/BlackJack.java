package poo.coleccionesejtresp.uno;

import java.util.ArrayList;
import java.util.Random;

public class BlackJack extends Mazo {
    //CONSTRUCTOR HEREDADO
    public BlackJack() {
        super();
    }

    @Override
    public void barajar() {
        Random aleatorio = new Random();
        ArrayList<Carta> mazoAuxiliar = new ArrayList<>();
        
        //Voy copiando el mazo original en un orden aleatorio en mazoAuxiliar
        //Y voy borrando las cartas ya barajadas del mazo oiginal
        while (cantidad() > 0) {
            int indice = aleatorio.nextInt(cantidad());
            Carta cartaElegida = devolver(indice);
            mazoAuxiliar.add(cartaElegida);
            eliminar(cartaElegida); //Quitamos la carta de la baraja original
        }
        /*
        Cuando me quedo sin cartas en el mazo original recorro el 
        mazo auxiliar (ya barajdo) copiandolo devuielta al mazo original
         */
        for (Carta c : mazoAuxiliar) {
            insertar(c);
        }
    }


    //REESCRITURA DEL METODO CREAR, CREO UN MAZO PERO CON OTROS PALOS
    @Override
    public void crear() {
        String[] palos = {"Picas", "Corazones", "Diamantes", "Treboles"};
        
        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                Carta nuevaCarta = new Carta(i, palo);
                insertar(nuevaCarta); //Metodo heredado
            }
        }
        
        modificarMazo();
    }
    
    //METODO PARA MODIFICAR EL MAZO A UN MAZO INGLES DE 40 CARTAS
    public void modificarMazo() {
        for (int i = cantidad() -1; i >= 0; i--) {
            Carta carta = devolver(i);
            int numero = carta.getNumero();
            
            if (numero == 8 || numero == 9) {
                eliminar(carta);
            }
            
            switch (numero){
                case 1:
                    carta.setPalo("AS");
                    break;
                case 10:
                    carta.setPalo("J");
                    break;
                case 11:
                    carta.setPalo("Q");
                    break;
                case 12:
                    carta.setPalo("K");
                    break;
            }
            if (numero >= 10) {
                carta.setNumero(10);
            }
        }
    }
}
