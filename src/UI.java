import java.util.Scanner;

public class UI {
        
        //private Grid grid = new Grid();
        private Reader reader = new Reader();
        private String namePlayerOne;
        private String namePlayerTwo;
        private int count = 0;
        private int scorePlayerOne;
        private int scorePlayerTwo;
        
        public UI(){
            System.out.println("Welcome to Tic Tac Toe!");
            System.out.println("Player 1 (X), please enter your name:");
            this.namePlayerOne = reader.readString();
            System.out.println("Player 2 (O), please enter your name:");
            this.namePlayerTwo = reader.readString();
            
            this.scorePlayerOne = 0;
            this.scorePlayerTwo = 0;
        }
        
        public void start(Grid grid) {

            GridRenderer.drawGrid(grid);
            while (true) {
                turnX(grid);
                if(winX(grid)){
                    break;
                }
                turnO(grid);
                if(winO(grid)){
                    break;
                }
            }
            continueFlow();
        }

        public boolean winX(Grid grid){
            if((CheckWinConditions.checkWinner(grid) == true)) {
                System.out.println(namePlayerOne + " wins!");
                scorePlayerOne++;
                System.out.println(namePlayerOne + ": " + scorePlayerOne + " points.");
                System.out.println(namePlayerTwo + ": " + scorePlayerTwo + " points.");
                return true;
            }
            else{
                return false;
            }
        }

        public boolean winO(Grid grid){
            if((CheckWinConditions.checkWinner(grid) == true)){
                System.out.println(namePlayerTwo +" wins!");
                scorePlayerTwo++;
                System.out.println(namePlayerOne +": " +scorePlayerOne+ " points." );
                System.out.println(namePlayerTwo +": " +scorePlayerTwo+ " points." );
                return true;
            }
            else{
                return false;
            }
        }

        public void turnX(Grid grid){
        int coordinateOne;
        int coordinateTwo;

        System.out.println(namePlayerOne +": where goes the X? Enter coordinates:");
        coordinateOne = Coordinates.coordinateX(reader.readString());
        coordinateTwo = Coordinates.coordinateY(reader.readInteger());
        if(!grid.insertX(coordinateOne, coordinateTwo)){
            System.out.println("Invalid position, try again.");
            turnX(grid);
        }
        else {
            GridRenderer.drawGrid(grid);
            count++;

            if (count == 9) {
                System.out.println("Draw!");
                continueFlow();
            }
        }
    }

    public void turnO(Grid grid){
        int coordinateOne;
        int coordinateTwo;

        System.out.println(namePlayerTwo +": where goes the O? Enter coordinates:");
        coordinateOne = Coordinates.coordinateX(reader.readString());
        coordinateTwo = Coordinates.coordinateY(reader.readInteger());
        if(!grid.insertO(coordinateOne, coordinateTwo)){
            System.out.println("Invalid position, try again.");
            turnO(grid);
        }
        else {
            GridRenderer.drawGrid(grid);
            count++;

            if (count == 9) {
                System.out.println("Draw!");
                continueFlow();
            }
        }
    }

                    
    public void continueFlow(){

        System.out.println("Would you like to play again? Y/N");
        String option = reader.readString();
        while(true){
            if(option.toUpperCase().equals("Y")){
                System.out.println("Starting new game: ");
                this.count = 0;
                Grid gridNew = new Grid();
                start(gridNew);
            }
            if(option.toUpperCase().equals("N")){
            break;
        }
            else{
                System.out.println("Please enter Y or N");
            }
    }
        System.out.println("Thank you for playing!");
        System.out.println("Final score:");
        System.out.println(namePlayerOne +": " +scorePlayerOne+ " points." );
        System.out.println(namePlayerTwo +": " +scorePlayerTwo+ " points." );
    }
}

