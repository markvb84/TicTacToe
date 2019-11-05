public class UI {

        private Reader reader = new Reader();
        private int count = 0;
        private Player playerOne;
        private Player playerTwo;
        private int columns;
        private int rows;
        
        public UI(){
            System.out.println("Welcome to Tic Tac Toe!");
            System.out.println("Player 1 (X), please enter your name:");
            playerOne = new Player(reader.readString(), "X");
            System.out.println("Player 2 (O), please enter your name:");
            playerTwo = new Player(reader.readString(), "O");
            System.out.println("To place your mark: enter a column letter, followed by a row number.");
        }
        
        public void start(Grid grid) {
            this.columns = grid.getColumns();
            this.rows = grid.getRows();
            GridRenderer.drawGrid(grid);
            while (true) {
                //playerOne's turn
                turnPlayer(grid, playerOne);
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
                turnPlayer(grid, playerTwo);
                //check for winner.
                //There is no check for draw since a draw always ends on X
                if (CheckWinConditions.checkWinner(grid, playerTwo)) {
                    scoreBoard();
                    break;
                }

            }
            continueGame();
        }

        public void turnPlayer(Grid grid, Player player){
        int coordinateOne;
        int coordinateTwo;

        System.out.println(player.getName() +": where goes the "+player.getPlayerIcon()+"? Enter coordinates:");
        coordinateOne = Coordinates.coordinateX(reader.readString());
        coordinateTwo = Coordinates.coordinateY(reader.readInteger());
        if(!grid.insertIcon(coordinateOne, coordinateTwo, player)){
            System.out.println("Invalid position, try again.");
            turnPlayer(grid, player);
        }
        else {
            GridRenderer.drawGrid(grid);
            count++;
            }
        }

        public void scoreBoard(){
            System.out.println(playerOne.getName() + ": " + playerOne.getScore() + " points.");
            System.out.println(playerTwo.getName() + ": " + playerTwo.getScore()+ " points.");
        }
                    
        public void continueGame(){
    
            System.out.println("Would you like to play again? Y/N");
            String option = reader.readString();
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
                        option = reader.readString();
                    }
                }
            }
        }
    } 
