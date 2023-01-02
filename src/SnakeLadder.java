public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SNAKE LADDERS");
        int firstPlayerPosition = 0;
        System.out.println("PLAYER STARTING POSITION "+firstPlayerPosition);
        int numberAfterRolling = (int) Math.floor(Math.random() * 10) % 6 +1;
        System.out.println("Number after rolling the dice by the player: " + numberAfterRolling);
    }
}
