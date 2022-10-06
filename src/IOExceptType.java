import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExceptType {
    public static void main(String[] args) {
        FileInputStream fin = null;
        File fname = new File("C:\\Users\\Public\\Documents\\test.txt");
        try{
            fin = new FileInputStream(fname);
            System.out.println("File Opened from " + fname);
            int c;
            while((c=fin.read())!=-1){
                System.out.println();
            }
        }catch(IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
