package cardgames.application;
import java.util.ArrayList;

import cardgames.model.Card;
import cardgames.model.Rank;
import cardgames.model.Suit;


public class Main {
    public static void transformEachCardElementIntoRightCode() {
        Card ace = new Card(Rank.ACE, Suit.HEARTS);
        Card two = new Card(Rank.TWO, Suit.CLUBS);
        Card three = new Card(Rank.THREE, Suit.DIAMONDS);
        Card four = new Card(Rank.FOUR, Suit.HEARTS);
        Card five = new Card(Rank.FIVE, Suit.DIAMONDS);
        Card six = new Card(Rank.SIX, Suit.HEARTS);
        Card seven = new Card(Rank.SEVEN, Suit.CLUBS);
        Card eight = new Card(Rank.EIGHT, Suit.DIAMONDS);
        Card nine = new Card(Rank.NINE, Suit.HEARTS);
        Card ten = new Card(Rank.TEN, Suit.DIAMONDS);
        Card jack = new Card(Rank.JACK, Suit.HEARTS);
        Card queen = new Card(Rank.QUEEN, Suit.DIAMONDS);
        Card king = new Card(Rank.KING, Suit.HEARTS);

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        cards.add(two);
        cards.add(three);
        cards.add(four);
        cards.add(five);
        cards.add(six);
        cards.add(seven);
        cards.add(eight);
        cards.add(nine);
        cards.add(ten);
        cards.add(jack);
        cards.add(queen);
        cards.add(king);

        for (Card card : cards) {
            System.out.println("The display of this card is : " + card.toText());
        }
    }

    public static void main(String[] args) {
        Card aceOfHearts = new Card(Rank.ACE, Suit.HEARTS);
        System.out.println(aceOfHearts + " Created");
        System.out.println("with " + aceOfHearts.getRank() + " as rank and " + aceOfHearts.getSuit().getCode() + " as suit.");
        transformEachCardElementIntoRightCode();
    }
}