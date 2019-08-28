public class CheckWinConditions {

    public static boolean checkWinner(Grid grid, Player player) {

        boolean winnerAvailable = false;

        if (grid.onPosition(0, 0).equals(player.getPlayerIcon()) && grid.onPosition(1, 1).equals(player.getPlayerIcon()) && grid.onPosition(2, 2).equals(player.getPlayerIcon())) {
            winnerAvailable = true;
        }
        if (grid.onPosition(0, 2).equals(player.getPlayerIcon()) && grid.onPosition(1, 1).equals(player.getPlayerIcon()) && grid.onPosition(2, 0).equals(player.getPlayerIcon())) {
            winnerAvailable = true;
        }
        if (grid.onPosition(0, 0).equals(player.getPlayerIcon()) && grid.onPosition(0, 1).equals(player.getPlayerIcon()) && grid.onPosition(0, 2).equals(player.getPlayerIcon())) {
            winnerAvailable = true;
        }
        if (grid.onPosition(1, 0).equals(player.getPlayerIcon()) && grid.onPosition(1, 1).equals(player.getPlayerIcon()) && grid.onPosition(1, 2).equals(player.getPlayerIcon())) {
            winnerAvailable = true;
        }
        if (grid.onPosition(2, 0).equals(player.getPlayerIcon()) && grid.onPosition(2, 1).equals(player.getPlayerIcon()) && grid.onPosition(2, 2).equals(player.getPlayerIcon())) {
            winnerAvailable = true;
        }
        if (grid.onPosition(0, 0).equals(player.getPlayerIcon()) && grid.onPosition(1, 0).equals(player.getPlayerIcon()) && grid.onPosition(2, 0).equals(player.getPlayerIcon())) {
            winnerAvailable = true;
        }
        if (grid.onPosition(0, 1).equals(player.getPlayerIcon()) && grid.onPosition(1, 1).equals(player.getPlayerIcon()) && grid.onPosition(2, 1).equals(player.getPlayerIcon())) {
            winnerAvailable = true;
        }
        if (grid.onPosition(0, 2).equals(player.getPlayerIcon()) && grid.onPosition(1, 2).equals(player.getPlayerIcon()) && grid.onPosition(2, 2).equals(player.getPlayerIcon())) {
            winnerAvailable = true;
        }

        if (winnerAvailable == true) {
            announceWinner(player);
            return true;
        } else {
            return false;
        }
    }

    
    public static void announceWinner(Player player){
            System.out.println(player.getName() + " wins!");
            player.increaseScore();
        }


    public static boolean checkDraw(int turnCounter){
       if(turnCounter == 9){
           return true;
       }
       else{
           return false;
       }
    }
}
