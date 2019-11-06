public class UI {

        private int count = 0;
        private HumanPlayer playerOne;
        private HumanPlayer playerTwo;
        private int columns;
        private int rows;
        
        UI(){
            System.out.println("Welcome to Tic Tac Toe!");
            System.out.println("Player 1 (X), please enter your name:");
            playerOne = new HumanPlayer(Reader.readString(), "X");
            System.out.println("Player 2 (O), please enter your name:");
            playerTwo = new HumanPlayer(Reader.readString(), "O");
            System.out.println("To place your mark: enter a column letter, followed by a row number.");
        }
        
        void start(Grid grid) {
            this.columns = grid.getColumns();
            this.rows = grid.getRows();
            GridRenderer.drawGrid(grid);
            while (true) {
                //playerOne's turn
                playerOne.turnPlayer(grid, playerOne);
                //check for draw
                if(CheckWinConditions.checkDraw(count, grid)){
                    System.out.println("Draw!");
                    break;
                }
                //check for winner
                if (CheckWinConditions.checkWinner(grid, playerOne)) {
                    scoreBoard();
                    break;
                }
                //playerTwo's turn
                playerTwo.turnPlayer(grid, playerTwo);
                //check for draw
                if(CheckWinConditions.checkDraw(count, grid)){
                    System.out.println("Draw!");
                    break;
                }
                //check for winner.
                if (CheckWinConditions.checkWinner(grid, playerTwo)) {
                    scoreBoard();
                    break;
                }
            }
            continueGame();
        }

        private void scoreBoard(){
            System.out.println(playerOne.getName() + ": " + playerOne.getScore() + " points.");
            System.out.println(playerTwo.getName() + ": " + playerTwo.getScore()+ " points.");
        }
                    
        private void continueGame(){
    
            System.out.println("Would you like to play again? Y/N");
            String option = Reader.readString();
            while(true){
                if(option.toUpperCase().equals("Y")){
                    System.out.println("Starting new game: ");
                    this.count = 0;
                    Grid grid = new Grid(this.columns, this.rows);
                    start(grid);
                    break;
                }
                else {
                    if (option.toUpperCase().equals("N")) {
                        System.out.println("Thank you for playing!");
                        System.out.println("Final score:");
                        System.out.println(playerOne.getName() +": " +playerOne.getScore()+ " points." );
                        System.out.println(playerTwo.getName() +": " +playerTwo.getScore()+ " points." );
                        break;
                    }
                    else {
                        System.out.println("Invalid input, please type Y or N");
                        option = Reader.readString();
                    }
                }
            }
        }
    } 
