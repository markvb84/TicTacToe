import java.util.Scanner;

public class Reader {
    
    private Scanner sc = new Scanner(System.in);
    
    public String readString(){
        String readString = sc.nextLine();
        return readString;
    }
    
    public int readInteger(){
        String readInteger = sc.nextLine();
        int readInt = Integer.parseInt(readInteger);	
        return readInt;
    }
    
}
