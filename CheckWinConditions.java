public class CheckWinConditions {

    public static boolean checkWinner(Grid grid){
        if(grid.onPosition(0,0).equals("X") && grid.onPosition(1,1).equals("X") && grid.onPosition(2,2).equals("X")){
            return true;
        }
        else{
            return false;
        }

    }
}
