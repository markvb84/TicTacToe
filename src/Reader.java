import java.util.Scanner;

public class Reader {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static String readString(){
        String readString = sc.nextLine();
        return readString;
    }
    
    public static int readInteger(){
        String readInteger = sc.nextLine();
        try {
            int readInt = Integer.parseInt(readInteger);
            return readInt;
        }
        catch (NumberFormatException e) {
            return -1;
        }
    }
}
