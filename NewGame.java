public class NewGame {

    public static void main(String[] args) {

        
        
//        test.insertX(1, 1);
//        test.insertX(2, 2);
        //System.out.println(test.onPosition(1, 1));
        Grid test = new Grid();    
        test.insertX(2, 1);
        test.insertO(0, 1);
        test.insertX(1, 2);
        
        GridRenderer.drawGrid(test);
    }
}
