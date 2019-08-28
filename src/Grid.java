public class Grid {

    private String[][] grid;

    public Grid() {
        this.grid = new String[3][3];

//        00 01 02
//        10 11 12
//        20 21 22
    }

    public String onPosition(int x, int y) {
        if (grid[y][x] == null) {
            return " ";
        } else {
            return grid[y][x];
        }
    }

    public boolean insertIcon(int y, int x, Player player) {
        try {
            if (this.grid[y][x] == null) {
                this.grid[y][x] = player.getPlayerIcon();
                return true;
            } else {
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
}
