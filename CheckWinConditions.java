import java.util.Arrays;

public class CheckWinConditions {
    
    private Grid grid;
    
    public CheckWinConditions(Grid grid){
        this.grid = grid;
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

