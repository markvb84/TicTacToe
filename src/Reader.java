import java.util.Scanner;

public class Reader {
    
    private Scanner sc = new Scanner(System.in);
    
    public String readString(){
        String readString = sc.nextLine();
        return readString;
    }
    
    public int readInteger(){
        String readInteger = sc.nextLine();
        try {
            int readInt = Integer.parseInt(readInteger);
        }
        catch (NumberFormatException e) {
            return -1;
        }
        int readInt = Integer.parseInt(readInteger);
        return readInt;
    }
}
