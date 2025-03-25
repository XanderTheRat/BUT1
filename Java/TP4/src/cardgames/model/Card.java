package cardgames.model;

public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }
    public Suit getSuit() {
        return suit;
    }

    public String toText() {
        return rank.getRank() + " of " + suit.getCode();
    }


    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
