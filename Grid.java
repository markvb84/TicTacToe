public class Grid {
    
    private String[][] grid;
    
    public Grid(){
        this.grid = new String[3][3];
        
//        00 01 02
//        10 11 12
//        20 21 22
    }
    
    public String[][] getGrid() {
        return grid;
    }
    
    public String onPosition(int x, int y) {
        if(grid[x][y] == null){
            return " ";
        }
        else{
            return grid[y][x];
        }
    }
    
    public boolean insertX(int x, int y) {
        try{
            if(this.grid[y][x] == null){ 
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
        return false;
    }
        try{
            if(this.grid[y][x] == null){ 
            }
        }
        catch (NullPointerException e) {
        return false;
    }
        if(this.grid[y][x] == null){
            this.grid[y][x] = "X";
            return true;
        }
        else{
        return false;
        }
    }

    public boolean insertO(int x, int y){
        try{
            if(this.grid[y][x] == null){ 
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
        return false;
    }
        try{
            if(this.grid[y][x] == null){ 
            }
        }
        catch (NullPointerException e) {
        return false;
    }
        if(this.grid[y][x] == null){
            this.grid[y][x] = "O";
            return true;
        }
        else{
            return false;
        }
    }
}