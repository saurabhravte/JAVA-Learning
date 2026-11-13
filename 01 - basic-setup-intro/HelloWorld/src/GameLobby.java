public class GameLobby {
    static void main() {
        int playerAge = 18;
        int coins = 120;
        int entryFee = 5;
        boolean isBanned =  false;

        int coinsAfterEntry = coins - entryFee;
        boolean hasEnoughCoins = coins >= entryFee;
        boolean isAdult = playerAge >= 18;

        boolean canPlayerEnter = isAdult && hasEnoughCoins && !isBanned;
        System.out.println(canPlayerEnter);

        double playerScore = 87.8;
        int roundedScore = (int) playerScore;
        System.out.println(roundedScore);
    }
}
