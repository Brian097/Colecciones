package poo.coleccionesejtresp.uno;

public class BlackJack extends Mazo {
    //CONSTRUCTOR HEREDADO
    public BlackJack() {
        super();
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
    
    /*
     * METODOS PARA MOLDEAR EL MAZO 
     */
    //METODO PARA MODIFICAR EL MAZO A UN MAZO INGLES DE 40 CARTAS
    public void modificarMazo() {
        for (int i = cantidad() -1; i >= 0; i--) {
            Carta carta = devolver(i);
            int numero = carta.getNumero();
            
            switch (numero){
                case 1:
                    carta.setPalo("As");
                    break;
                case 8:
                    eliminar(carta);
                    break;
                case 9:
                    eliminar(carta);
                    break;
                case 10:
                    carta.setPalo("J");
                    carta.setNumero(10);
                    break;
                case 11:
                    carta.setPalo("Q");
                    carta.setNumero(10);
                    break;
                case 12:
                    carta.setPalo("K");
                    carta.setNumero(10);
                    break;
                    
            }
            
        }
    }
}
