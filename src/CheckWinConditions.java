public class CheckWinConditions {

    public static boolean checkWinner(Grid grid){
        //check X win conditions
        if(grid.onPosition(0,0).equals("X") && grid.onPosition(1,1).equals("X") && grid.onPosition(2,2).equals("X")){
            return true;
        }
        if(grid.onPosition(0,2).equals("X") && grid.onPosition(1,1).equals("X") && grid.onPosition(2,0).equals("X")){
            return true;
        }
        if(grid.onPosition(0,0).equals("X") && grid.onPosition(0,1).equals("X") && grid.onPosition(0,2).equals("X")){
            return true;
        }
        if(grid.onPosition(1,0).equals("X") && grid.onPosition(1,1).equals("X") && grid.onPosition(1,2).equals("X")){
            return true;
        }
        if(grid.onPosition(2,0).equals("X") && grid.onPosition(2,1).equals("X") && grid.onPosition(2,2).equals("X")){
            return true;
        }
        if(grid.onPosition(0,0).equals("X") && grid.onPosition(1,0).equals("X") && grid.onPosition(2,0).equals("X")){
            return true;
        }
        if(grid.onPosition(0,1).equals("X") && grid.onPosition(1,1).equals("X") && grid.onPosition(2,1).equals("X")){
            return true;
        }
        if(grid.onPosition(0,2).equals("X") && grid.onPosition(1,2).equals("X") && grid.onPosition(2,2).equals("X")){
            return true;
        }
        
        //check O win conditions
        if(grid.onPosition(0,0).equals("O") && grid.onPosition(1,1).equals("O") && grid.onPosition(2,2).equals("O")){
            return true;
        }
        if(grid.onPosition(0,2).equals("O") && grid.onPosition(1,1).equals("O") && grid.onPosition(2,0).equals("O")){
            return true;
        }
        if(grid.onPosition(0,0).equals("O") && grid.onPosition(0,1).equals("O") && grid.onPosition(0,2).equals("O")){
            return true;
        }
        if(grid.onPosition(1,0).equals("O") && grid.onPosition(1,1).equals("O") && grid.onPosition(1,2).equals("O")){
            return true;
        }
        if(grid.onPosition(2,0).equals("O") && grid.onPosition(2,1).equals("O") && grid.onPosition(2,2).equals("O")){
            return true;
        }
        if(grid.onPosition(0,0).equals("O") && grid.onPosition(1,0).equals("O") && grid.onPosition(2,0).equals("O")){
            return true;
        }
        if(grid.onPosition(0,1).equals("O") && grid.onPosition(1,1).equals("O") && grid.onPosition(2,1).equals("O")){
            return true;
        }
        if(grid.onPosition(0,2).equals("O") && grid.onPosition(1,2).equals("O") && grid.onPosition(2,2).equals("O")){
            return true;
        }
        
        //no winner yet
        else{
            return false;
        }
        
    }
}