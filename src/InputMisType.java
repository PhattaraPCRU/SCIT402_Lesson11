import java.util.Scanner;

public class InputMisType {
    public static void main(String[] args) {
        try{
            System.out.print("Enter X : ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.print("Enter Y : ");
            sc = new Scanner(System.in);
            int y = sc.nextInt();
            System.out.println("X / Y = " + x/y);
        }catch(ArithmeticException e){
            System.out.println("Error : " + e.getMessage());
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}
