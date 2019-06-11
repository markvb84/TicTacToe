
public class Coordinates {

    public static int coordinateY(int y){
        if(y >-1 && y <4){
            int axisY = y-1;
            return axisY;
        }
        else{
            return -1;
        }
    }

    public static int coordinateX(String x){

        int axisX = -1;

        if(x.equalsIgnoreCase("A")){
            axisX = 0;
        }
        if(x.equalsIgnoreCase("B")){
            axisX = 1;
        }
        if(x.equalsIgnoreCase("C")){
            axisX = 2;
        }
        return axisX;
    }
}
//         A  B  C
//      1 00 01 02
//      2 10 11 12
//      3 20 21 22