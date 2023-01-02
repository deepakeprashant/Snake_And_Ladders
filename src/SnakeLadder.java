public class SnakeLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("WELCOME TO SNAKE LADDERS");
        int firstPlayerPosition = 0;
        int counterRolling = 0;
        System.out.println("PLAYER STARTING POSITION " + firstPlayerPosition);
        while (firstPlayerPosition < WINNING_POSITION) {
            int numberAfterRolling = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Number after rolling the dice by the player: " + numberAfterRolling);
            int checkOptions = (int) Math.floor(Math.random() * 10) % 3;
            ++counterRolling;
            switch (checkOptions) {
                case NO_PLAY:
                    System.out.println("Player is not playing therefore stays in the same position");
                    break;
                case LADDER:
                    if (firstPlayerPosition + numberAfterRolling > 100)
                        break;
                    firstPlayerPosition += numberAfterRolling;
                    System.out.println("Player got the ladder then position is: " + firstPlayerPosition);
                    break;
                case SNAKE:
                    firstPlayerPosition -= numberAfterRolling;
                    if (firstPlayerPosition < 0) {
                        firstPlayerPosition = 0;
                    }
                    System.out.println("Player got snake bite then position is: " + firstPlayerPosition);
            }
        }
        System.out.println("\n:: Number of times dice was thrown by the players: " + counterRolling);
    }
}
