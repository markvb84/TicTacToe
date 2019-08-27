public class UI {

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
            System.out.println("To place your mark: enter a column letter, followed by a row number.");
            this.scorePlayerOne = 0;
            this.scorePlayerTwo = 0;
        }
        
        public void start(Grid grid) {

            GridRenderer.drawGrid(grid);
            while (true) {
                //playerOne's turn
                turnX(grid);
                //check for draw
                if(CheckWinConditions.checkDraw(count)){
                    System.out.println("Draw!");
                    break;
                }
                //check for winner
                if(count >= 5) {
                    if (winX(grid)) {
                        break;
                    }
                }
                //playerTwo's turn
                turnO(grid);
                //check for winner.
                //There is no check for draw since a draw always ends on X
                if(count >= 5) {
                    if (winO(grid)) {
                        break;
                    }
                }
            }
            continueGame();
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
        }
    }

                    
    public void continueGame(){

        System.out.println("Would you like to play again? Y/N");
        String option = reader.readString();
        while(true){
            if(option.toUpperCase().equals("Y")){
                System.out.println("Starting new game: ");
                this.count = 0;
                Grid grid = new Grid();
                start(grid);
                break;
            }
            else {
                if (option.toUpperCase().equals("N")) {
                    System.out.println("Thank you for playing!");
                    System.out.println("Final score:");
                    System.out.println(namePlayerOne +": " +scorePlayerOne+ " points." );
                    System.out.println(namePlayerTwo +": " +scorePlayerTwo+ " points." );
                    break;
                }
                else {
                    System.out.println("Invalid input, please type Y or N");
                    option = reader.readString();
                }
            }
        }
    }
}
