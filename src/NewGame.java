public class NewGame {

    public static void main(String[] args) {
        Grid grid = new Grid(3, 3);
        UI newgame = new UI();
        newgame.start(grid);
    }
} 
