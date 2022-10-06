import java.util.Scanner;
class OutOfRangeException extends Exception {
    void checkvalue(int value,int MIN,int MAX) throws OutOfRangeException {
        if (value < MIN || value > MAX) {
            throw new OutOfRangeException();
        }
    }
}
public class CreatingExceptions{
    public static void main(String[] args) {
        OutOfRangeException x = new OutOfRangeException();
        final int MIN = 0, MAX = 30; int value=0;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a value: ");
            value = input.nextInt();
            x.checkvalue(value, MIN, MAX);
        } catch (OutOfRangeException e) {
            System.out.println("Value is out of range");
            System.exit(0);
        }catch (Exception e) {
            System.out.println("Invalid input");
            System.exit(0);
        }finally{
            System.out.println("Value is: "+value*100.0f/MAX+"%");
        }
    }
}
