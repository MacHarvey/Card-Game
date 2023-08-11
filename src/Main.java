package src;
public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Card card = new Card();
        System.out.println(card.toString());

        Card anotheCard = new Card("4th", "clubs", 4);

        Card thirdCard = new Card("Sixth", "Spades", 3);

        if (anotheCard.isHigher(thirdCard))
        {
            System.out.println("Card is higher");
        }
        else
        {
            System.out.println("Card is lower");
        }

        // jfkdsfksjfdsj
    }
}