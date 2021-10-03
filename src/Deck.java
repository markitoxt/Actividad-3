import java.util.*;

public class Deck {

    public static void main(String[] args)
    {
        Card card = new Card();
        int PALOS = card.palo.length;
        int VALORES = card.valor.length;
        int COLORES = card.color.length;
        int N = PALOS * VALORES * COLORES; // se cálcula N que indicará el tamaño del array card.

        // initialize deck
        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < VALORES; i++) {
            for (int j = 0; j < PALOS; j++) {
                deck.add(card.palo[j]+ ", Rojo , " + card.valor[i]);//carga los valores en array para cartas Rojas.
                deck.add(card.palo[j]+ ", Negro , " + card.valor[i]);//carga los valores en array para cartas Negras.
            }
        }
        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<String> nombreIterator = deck.iterator();
        while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.print(elemento+" / ");
        }
        suflle(deck);
        head(deck);
        pick(deck);
        hand(deck);
    }

    // shuffle: mezclar el deck.
    //El método deberá imprimir en pantalla el siguiente mensaje "Se mezcló el Deck."
    public static void suflle(ArrayList deck){
        ArrayList<String> values = deck;
        Collections.shuffle(values);
        System.out.println("\n Se mezcló el Deck.");
        Iterator<String> nombreIterator2 = deck.iterator();
        while(nombreIterator2.hasNext()){
            String elemento = nombreIterator2.next();
            System.out.print(elemento+" / ");
        }
    }

    //head:  mostrar la primera carta del deck, la carta deberá removerse del deck.
    //El método deberá imprimir en pantalla un mensaje con el siguiente formato
    /*
        {Palo},{Color},{Valor}
        Quedan {número de cartas en deck}
     */
    public static void head(ArrayList deck){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas \n");
    }

    //pick: seleccionar una carta al azar, la carta deberá removerse del deck.
    //El método deberá imprimir en pantalla un mensaje con el siguiente formato
    /*
        {Palo},{Color},{Valor}
        Quedan {número de cartas en deck}
     */
    public static void pick(ArrayList  deck){
        Random aleatorio = new Random();
        System.out.println(deck.get(aleatorio.nextInt(deck.size())));
        deck.remove(aleatorio.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas \n");
    }

    //hand: regresará un arreglo de cinco cartas del deck, las cartas deberán removerse del deck.
    // El método deberá imprimir en pantalla un mensaje con el siguiente formato:
    /*
        {Palo},{Color},{Valor}
        {Palo},{Color},{Valor}
        {Palo},{Color},{Valor}
        {Palo},{Color},{Valor}
        {Palo},{Color},{Valor}
        Quedan {número de cartas en deck}
     */
    public static void hand(ArrayList deck){
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
        }
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
    }
}
