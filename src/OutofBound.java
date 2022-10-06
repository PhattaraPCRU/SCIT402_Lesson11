public class OutofBound {
    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5};
        try{
            System.out.println(x[x.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}
