import java.util.*;
class Card {
    private String suit;
    private String value;
    private String rank;
    private String color;

    public Card(String suit, String value, String rank, String color) {
        this.suit = suit;
        this.value = value;
        this.rank = rank;
        this.color = color;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public String getRank() {
        return rank;
    }

    public String getColor() {
        return color;
    }
}
class Deck {
    private List<Card> cards;

    public Deck() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] colors = {"Red", "Black"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        this.cards = new ArrayList<>();
        for (String suit : suits) {
            for (String color : colors) {
                for (String rank : ranks) {
                    for (String value : values) {
                        Card card = new Card(suit, value, rank, color);
                        cards.add(card);
                    }
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void sort() {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card c1, Card c2) {
                int suitCompare = c1.getSuit().compareTo(c2.getSuit());
                if (suitCompare != 0) {
                    return suitCompare;
                } else {
                    return c1.getValue().compareTo(c2.getValue());
                }
            }
        });
    }
}
public class Demo67 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle(); // 洗牌
        deck.sort(); // 排序
    }
}