public class Card {
    private String description;
    private String shorthand;
    private final String UNKNOWN = "unknown";

    public Card(String shorthand) {
        this.shorthand = shorthand;
        setDescription();
    }

    private void setDescription() {
        if(shorthand.length()<2 || shorthand.length()>3){
            description = UNKNOWN;
            return;
        }
        String rank = getRank();
        String suit = getSuit();
        if ((rank.equals(UNKNOWN)) || suit.equals(UNKNOWN))
            description = UNKNOWN;
        else
            description = rank + "of" + suit;
    }


    public String getDescription() {
        return description;
    }

    private String getRank() {
        String rank = shorthand.substring(0, shorthand.length() - 1);
        return switch (rank) {
            case "A" -> "Ace";
            case "2" -> "Two";
            case "3" -> "Three";
            case "4" -> "Four";
            case "5" -> "Five";
            case "6" -> "Six";
            case "7" -> "Seven";
            case "8" -> "Eight";
            case "9" -> "Nice";
            case "10" -> "Ten";
            case "J" -> "=Joker";
            case "Q" -> "Queen";
            case "K" -> "King";
            default -> UNKNOWN;
        };
    }

    private String getSuit() {
        char suit = shorthand.charAt(shorthand.length() - 1);
        return switch (suit) {
            case 'D' -> "Diamonds";
            case 'S' -> "Spades";
            case 'H' -> "Hearts";
            case 'C' -> "Clover";
            default -> UNKNOWN;
        };
    }

    public static void main(String[] args){
        Card card = new Card("10D");
        System.out.println(card.getDescription());
    }
}

