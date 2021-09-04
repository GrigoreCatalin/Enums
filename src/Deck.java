import java.util.ArrayList;

public class Deck {
    public static void main(String[] args) {
        ArrayList<Card> deckOfCard = new ArrayList<>();
        for (Rank myRank : Rank.values()) {
            for (Suit mySuit : Suit.values()) {
                deckOfCard.add(new Card(myRank, mySuit));
            }
        }
        for (Card item : deckOfCard) {
            System.out.println(item.getMyRank() + " -> " + item.getMySuit());
        }
    }
}
