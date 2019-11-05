public class NewGame {

    public static void main(String[] args) {
        Grid grid = new Grid(4, 4);
        UI newgame = new UI();
        newgame.start(grid);
    }
} 
