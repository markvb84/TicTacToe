public class HumanPlayer extends Player {

    HumanPlayer(String name, String icon){
        super(name, icon);
    }

    @Override
    public void turnPlayer(Grid grid, Player player){

        int coordinateOne;
        int coordinateTwo;

        System.out.println(super.getName() +": where goes the "+super.getPlayerIcon()+"? Enter coordinates:");
        coordinateOne = Coordinates.coordinateX(Reader.readString(), grid);
        coordinateTwo = Coordinates.coordinateY(Reader.readInteger(), grid);
        if(!grid.insertIcon(coordinateOne, coordinateTwo, player)){
            System.out.println("Invalid position, try again.");
            turnPlayer(grid, player);
        }
        else {
            GridRenderer.drawGrid(grid);
        }
    }
}
