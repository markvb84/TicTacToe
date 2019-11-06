class Grid {

    private int columns;
    private int rows;
    private String[][] grid;

    Grid(int columns, int rows) {
        this.grid = new String[columns][rows];
        this.columns = columns;
        this.rows = rows;

//        00 01 02
//        10 11 12
//        20 21 22
    }

    String onPosition(int x, int y) {
        if (grid[y][x] == null) {
            return " ";
        } else {
            return grid[y][x];
        }
    }

    boolean insertIcon(int y, int x, Player player) {
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

    int getColumns(){
        return this.columns;
    }

    int getRows(){
        return this.rows;
    }
}
