import java.util.Arrays;

public class Grid {
    
    private String[][] grid;
    
    public Grid(){
        this.grid = new String[2][2];
        
        //00 01 02
        //10 11 12
        //20 21 22
    }
    
    public String[][] getGrid() {
        return grid;
    }
    
    public String onPosition(int x, int y) {
        return grid[x][y];
    }
    
    public boolean insertX(int x, int y) {
        if(this.grid[x][y] == null){
            this.grid[x][y] = "X";
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean insertO(int x, int y){
        if(this.grid[x][y] == null){
            this.grid[x][y] = "O";
            return true;
        }
        else{
            return false;
        }
    }
}
