public class NewGame {

    public static void main(String[] args) {

        Grid test = new Grid();

        test.insertX(1, 0);

        System.out.println(test.onPosition(1, 1));
        CheckWinConditions.checkWinner(test);

        String blah[][] = test.getGrid();
    }
}
