public class SnakeLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    public static void main(String[] args) {
        System.out.println("WELCOME TO SNAKE LADDERS");
        int firstPlayerPosition = 0;
        System.out.println("PLAYER STARTING POSITION "+firstPlayerPosition);
        int numberAfterRolling = (int) Math.floor(Math.random() * 10) % 6 +1;
        System.out.println("Number after rolling the dice by the player: " + numberAfterRolling);
        int checkOptions = (int) Math.floor(Math.random() * 10) % 3;
        switch (checkOptions) {
            case NO_PLAY:
                System.out.println("Player is not playing therefore stays in the same position");
                break;
            case LADDER:
                firstPlayerPosition += numberAfterRolling;
                System.out.println("Player got the ladder then position is: " + firstPlayerPosition);
                break;
            case SNAKE:
                firstPlayerPosition -= numberAfterRolling;
                System.out.println("Player got snake bite then position is: " + firstPlayerPosition);
                break;
        }
    }
}
