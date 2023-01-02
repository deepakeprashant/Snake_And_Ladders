
public class SnakeAndLadder {

    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static final int WINNING_POSITION = 100;
    static final int FAIR_STARTING_CHANCE_FOR_PLAYER1 = 1;
    static final int FAIR_STARTING_CHANCE_FOR_PLAYER2 = 2;

    public static void main(String[] args) {
        System.out.println("\n\t\t Welcome to Snake and Ladder Project \n");

        int counterForRolling = 0;
        int player1Position = 0;
        int player2Position = 0;
        int diceCountForPlayer1 = 0;
        int diceCountForPlayer2 = 0;
        boolean upForPlayer1 = false;
        boolean upForPlayer2 = false;

        int randomNumForFairStartingChance = (int) (Math.floor(Math.random()*10 ) % 2 + 1);
        switch (randomNumForFairStartingChance) {
            case FAIR_STARTING_CHANCE_FOR_PLAYER1 :
                upForPlayer1 = true;
                upForPlayer2 = false;
                System.out.println("Player 1 is lucky because he won the toss therefore going to start playing first\n");
                break;
            case FAIR_STARTING_CHANCE_FOR_PLAYER2 :
                upForPlayer2 = true;
                upForPlayer1 = false;
                System.out.println("Player 2 is lucky because he won the toss therefore going to start playing first\n");
                break;
        }

        while ((player1Position < WINNING_POSITION && player2Position < WINNING_POSITION)) {

            int numberAfterRolling = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Number after rolling the dice by the player: " + numberAfterRolling);
            int checkOptions = (int) Math.floor(Math.random() * 10) % 3;
            ++counterForRolling;

            switch (checkOptions) {
                case NO_PLAY:
                    if (upForPlayer1) {
                        System.out.println("player 1 is playing and choose not to move");
                        upForPlayer2 = true;
                        upForPlayer1 = false;
                    } else {
                        System.out.println("player 2 is playing and choose not to move");
                        upForPlayer1 = true;
                        upForPlayer2 = false;
                    }
                    break;
                case LADDER:
                    if (upForPlayer1) {
                        ++diceCountForPlayer1;
                        System.out.println("player 1 is playing and got ladder");
                        player1Position += numberAfterRolling;
                        if (player1Position > WINNING_POSITION)
                            player1Position -= numberAfterRolling;
                        System.out.println("Player 1 moves ahead and his position is: " + player1Position);
                        if (player1Position == WINNING_POSITION) {
                            System.out.println("\n\n\t\tPlayer1 won");
                            System.out.println("Player1 throws the dice " + diceCountForPlayer1 + " times");
                            System.out.println("Player2 is runner up by " + (WINNING_POSITION - player2Position) + " position and his last position was " + player2Position + ", Even though he throws the dice " + diceCountForPlayer2 + " times");
                        }
                        break;
                    } else if (upForPlayer2) {
                        ++diceCountForPlayer2;
                        System.out.println("Player 2 is playing and got ladder");
                        player2Position += numberAfterRolling;
                        if (player2Position > WINNING_POSITION)
                            player2Position -= numberAfterRolling;
                        System.out.println("Player 2 moves ahead and his position is: " + player2Position);
                        if (player2Position == WINNING_POSITION) {
                            System.out.println("\n\n\t\tPlayer2 won");
                            System.out.println("Player2 throws the dice " + diceCountForPlayer2 + " times");
                            System.out.println("Player1 is runner up by " + (WINNING_POSITION - player1Position) + " position and his last position was " + player1Position + ", Even though he throws the dice " + diceCountForPlayer1 + " times");
                        }
                        break;
                    }
                case SNAKE:
                    if (upForPlayer1) {
                        System.out.println("player 1 is playing and got snake bite");
                        player1Position -= numberAfterRolling;
                        if (player1Position < 0)
                            player1Position = 0;
                        System.out.println("Player2 got behind then position is: " + player1Position);
                        upForPlayer2 = true;
                        upForPlayer1 = false;
                    } else {
                        System.out.println("Player 2 is playing and got snake bite");
                        player2Position -= numberAfterRolling;
                        if (player2Position < 0)
                            player2Position = 0;
                        System.out.println("Player2 got behind then position is: " + player1Position);
                        upForPlayer1 = false;
                        upForPlayer2 = true;
                    }
            }
            System.out.println();
        }
        System.out.println("Number of times dice was thrown by the players: " + counterForRolling);
    }
}