package capitulo7;

public class Card {
    private final String face;
    private final String naipe;

    public Card(String cardFace, String cardNaipe){
        this.face = cardFace;
        this.naipe = cardNaipe;
    }

    public String toString(){
        return face + " of " + naipe;
    }
}
