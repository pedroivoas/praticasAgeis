package praticasAgeis;

public class Card {

private String suit;
private Rank rank;
//isDealt: checks if the card is in play and out of the deck
private boolean isDealt;

public Card() {

}

public Card(String suit, Rank rank, boolean isDealt) {
    this.suit = suit;
    this.rank = rank;
    this.isDealt = isDealt;
}

public String getSuit() {
    return suit;
}

public void setSuit(String suit) {
    this.suit = suit;
}

public Rank getRankDescription() {
    return rank;
}

public void setRank(Rank rank) {
    this.rank = rank;
}

public boolean isIsDealt() {
    return isDealt;
}

public void setIsDealt(boolean isDealt) {
    this.isDealt = isDealt;
}

@Override
public String toString() {
    return suit + " " + rank;
}

}