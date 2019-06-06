public class GridRenderer {
 
//        00 01 02
//        10 11 12
//        20 21 22

    public static void drawGrid(Grid grid){
        System.out.println("  A   B  C");
        System.out.println("1 " +grid.onPosition(0, 0)+ " | " +grid.onPosition(0, 1)+ " | " +grid.onPosition(0, 2) +" ");
        System.out.println(" ---------");
        System.out.println("2 " +grid.onPosition(1, 0)+ " | " +grid.onPosition(1, 1)+ " | " +grid.onPosition(1, 2) +" ");
        System.out.println(" ---------");
        System.out.println("3 " +grid.onPosition(2, 0)+ " | " +grid.onPosition(2, 1)+ " | " +grid.onPosition(2, 2) +" ");
    }
}
