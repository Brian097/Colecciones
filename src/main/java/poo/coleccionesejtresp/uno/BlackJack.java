package poo.coleccionesejtresp.uno;

public class BlackJack extends Mazo {
    //CONSTRUCTOR HEREDADO
    public BlackJack() {
        super();
    }
    
    //METODO PARAS SACAR LAS CARTAS 8 Y 9 DEL MAZO (SE VA A JUGAR CON 40 CARTAS)
    private void sacar8y9() {
        for (int i = cantidad() -1 ; i >= 0; i--) {
            Carta carta = devolver(i); 
            if ((carta.getNumero() == 8) || (carta.getNumero() == 9)) {
                eliminar(carta);
                        
            } else if (carta.getNumero() == 10 || carta.getNumero() == 11 || carta.getNumero() == 12) {
                System.out.println(carta.getNumero());
            }
        }e
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
        sacar8y9();
    }
    
    
}
