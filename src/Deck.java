import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private int rank;
    private int suit;
    private ArrayList<String> deck;

    private static String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
    };

    private static String[] suits = {
            "Hearts", "Diamonds", "Clubs", "Spades"
    };

    public Deck() {
      deck = new ArrayList<>();

        for (int i = 0; i < 52; i++) {
            String card = ranks[i % 13] + " of " + suits[i / 13];
            this.deck.add(card);
        }
        Collections.shuffle(this.deck);
    }

    public String getRank() {
        return Deck.ranks[this.rank];
    }

    public String getSuit() {
        return Deck.suits[this.suit];
    }

    public String toString() {
        return "Dealt: " + getRank() + " of " + getSuit();
    }
}