
public class Coordinates {

    public static int coordinateY(int y, Grid grid){
        if(y >-1 && y <grid.getRows()+1){
            int axisY = y-1;
            return axisY;
        }
        else{
            return -1;
        }
    }

    public static int coordinateX(String x, Grid grid){

        int axisX = -1;
        char characterCoordinate = 'a';

        for(int i = 0; i < grid.getColumns()+1; i++) {
            if(x.equalsIgnoreCase(Character.toString(characterCoordinate))){
                axisX = i;
            }
            characterCoordinate++;
        }
        return axisX;
    }
}
//         A  B  C
//      1 00 01 02
//      2 10 11 12
//      3 20 21 22