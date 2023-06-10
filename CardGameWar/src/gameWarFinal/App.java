package gameWarFinal;


public class App  {
    public static void main(String[] args)   {
        Deck deck = new Deck();
         Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        deck.shuffle();

          for (int i = 0; i < 52; i++) {
            player1.draw(deck);
            player2.draw(deck);
               }

         for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.println("Player 1: " + card1.getName());
            System.out.println("Player 2: " + card2.getName());

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins the turn!");
             } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins the turn!");
               } else {
                System.out.println("It's a draw!");
             }

            System.out.println("Player 1 score: " + player1.getScore());
            System.out.println("Player 2 score: " + player2.getScore());
           }

         int player1Score = player1.getScore();
        int player2Score = player2.getScore();

        System.out.println("Final score:");
        System.out.println("Player 1: " + player1Score);
        System.out.println("Player 2: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
         } else if (player1Score < player2Score) {
            System.out.println("Player 2 wins!");
               } else {
            System.out.println("It's a draw!");
          }
      }
  }