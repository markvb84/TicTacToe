class CheckWinConditions {

    static boolean checkWinner(Grid grid, Player player) {

        if (checkHorizontal(grid, player)) {
            announceWinner(player);
            return true;
        }
        else if (checkVertical(grid, player)){
            announceWinner(player);
            return true;
        }
        else if (checkDiagonalLeftToRight(grid, player)){
            announceWinner(player);
            return true;
        }
        else if (checkDiagonalRightToLeft(grid, player)){
            announceWinner(player);
            return true;
        }
        else {
            return false;
        }
    }

    private static boolean checkHorizontal(Grid grid, Player player) {
        ROW: for (int i = 0; i < grid.getColumns(); i++) {
            int count = 0;
            COLUMN: for (int j = 0; j < grid.getColumns(); j++) {
                if (grid.onPosition(i, j).equals(player.getPlayerIcon())) {
                    count++;
                    }
                    if (count == grid.getColumns()) {
                        return true;
                }
            }
        }
        return false;
    }

    private static boolean checkVertical(Grid grid, Player player) {
        ROW: for (int j = 0; j < grid.getRows(); j++) {
            int count = 0;
            COLUMN: for (int i = 0; i < grid.getRows(); i++) {
                if (grid.onPosition(i, j).equals(player.getPlayerIcon())) {
                    count++;
                }
                if (count == grid.getRows()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonalLeftToRight(Grid grid, Player player) {
        int count = 0;
        for (int i = 0, j = 0; i < grid.getRows(); i++, j++) {
            if (grid.onPosition(i, j).equals(player.getPlayerIcon())) {
                count++;
            }
            if (count == grid.getRows()) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonalRightToLeft(Grid grid, Player player) {
        int count = 0;
        for (int i = 0, j = grid.getColumns()-1; i < grid.getRows(); i++, j--) {
            if (grid.onPosition(i, j).equals(player.getPlayerIcon())) {
                count++;
            }
            if (count == grid.getRows()) {
                return true;
            }
        }
        return false;
    }

    private static void announceWinner(Player player){
            System.out.println(player.getName() + " wins!");
            player.increaseScore();
        }


    static boolean checkDraw(int turnCounter, Grid grid){
        return turnCounter == (grid.getColumns() * grid.getRows());
    }
}
