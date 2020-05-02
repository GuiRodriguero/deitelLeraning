package capitulo7;
import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck; // array do objeto card
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumber = new SecureRandom();

    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] naipe = { "Hearts", "Diamonds", "Clubs", "Spades" };
        deck = new Card[NUMBER_OF_CARDS];

        currentCard = 0; //primeira carta a ser distribuida vai ser a deck[0]

        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count%13], naipe[count / 13]);
        }
    }

    public void shuffle(){
        currentCard = 0;

        for (int first = 0; first<deck.length; first++){
            int second = randomNumber.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard(){
        if (currentCard < deck.length){
            return deck[currentCard++];
        }else {
            return null;
        }
    }
}
