import java.util.Arrays;

public class Grid {
    
    private String[][] grid;
    
    public Grid(){
        this.grid = new String[2][2];
        
        //00 01 02
        //10 11 12
        //20 21 22
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
    
    public boolean checkWinner(){
        if(this.grid[0][0] == "X" && this.grid[1][1] == "X" && this.grid[2][2] == "X"){
            return true;
        }
        if(this.grid[0][2] == "X" && this.grid[1][1] == "X" && this.grid[2][0] == "X"){
            return true;
        }
        if(this.grid[0][0] == "X" && this.grid[0][1] == "X" && this.grid[0][2] == "X"){
            return true;
        }
        if(this.grid[1][0] == "X" && this.grid[1][1] == "X" && this.grid[1][2] == "X"){
            return true;
        }
        if(this.grid[2][0] == "X" && this.grid[2][1] == "X" && this.grid[2][2] == "X"){
            return true;
        }
        if(this.grid[0][0] == "X" && this.grid[1][0] == "X" && this.grid[2][0] == "X"){
            return true;
        }
        if(this.grid[0][1] == "X" && this.grid[1][1] == "X" && this.grid[2][1] == "X"){
            return true;
        }
        if(this.grid[0][2] == "X" && this.grid[1][2] == "X" && this.grid[2][2] == "X"){
            return true;
        }
        
        if(this.grid[0][0] == "O" && this.grid[1][1] == "O" && this.grid[2][2] == "O"){
            return true;
        }
        if(this.grid[0][2] == "O" && this.grid[1][1] == "O" && this.grid[2][0] == "O"){
            return true;
        }
        if(this.grid[0][0] == "O" && this.grid[0][1] == "O" && this.grid[0][2] == "O"){
            return true;
        }
        if(this.grid[1][0] == "O" && this.grid[1][1] == "O" && this.grid[1][2] == "O"){
            return true;
        }
        if(this.grid[2][0] == "O" && this.grid[2][1] == "O" && this.grid[2][2] == "O"){
            return true;
        }
        if(this.grid[0][0] == "O" && this.grid[1][0] == "O" && this.grid[2][0] == "O"){
            return true;
        }
        if(this.grid[0][1] == "O" && this.grid[1][1] == "O" && this.grid[2][1] == "O"){
            return true;
        }
        if(this.grid[0][2] == "O" && this.grid[1][2] == "O" && this.grid[2][2] == "O"){
            return true;
        }
        else{
            return false;
        }
    }
}