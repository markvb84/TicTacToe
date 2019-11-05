public class GridRenderer {
 
//        00 01 02
//        10 11 12
//        20 21 22

    public static void drawGrid(Grid grid){
        //Generate column letters
        char colLetter = 'A';
        for (int i = 0; i < grid.getColumns(); i++){
            System.out.print("  " +colLetter+ " ");
            colLetter++;
            if (i + 1 == grid.getColumns()) {
                System.out.println(" ");
            }
        }
        //Generate rows
        for (int i = 0; i < grid.getRows(); i++){
            System.out.print(i+1 +" ");
            for(int j = 0; j < grid.getColumns(); j++){
                System.out.print(grid.onPosition(i, j));
                if (j != grid.getColumns()-1) {
                    System.out.print(" | ");
                }
            }
            System.out.print("\n");
            if(i != grid.getRows()-1) {
                for (int k = 0; k < grid.getColumns(); k++) {
                    System.out.print(" ---");
                }
            }
            System.out.println(" ");
        }
    }
}
