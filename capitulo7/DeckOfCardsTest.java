package capitulo7;

public class DeckOfCardsTest {
    public static void main(String[] args) {

        DeckOfCards myDeck = new DeckOfCards();
        myDeck.shuffle(); // embaralha

        /*for(int i = 1; i <= 52; i++){
            System.out.printf("%-19s", myDeck.dealCard());
            if(i % 4 == 0){ //pular linha
                System.out.println();
            }
        }*/


        /*TRUCO System.out.print("O VIRA: " + myDeck.dealCard() + "\n");
        System.out.println("MÃO: ");
        for(int i = 1; i <= 3; i++){
            System.out.printf("%-19s", myDeck.dealCard());
            if(i % 4 == 0){
                System.out.println();
            }
        }*/

    }
}
