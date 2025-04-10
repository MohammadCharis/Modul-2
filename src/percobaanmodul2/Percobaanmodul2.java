package percobaanmodul2;

public class Percobaanmodul2 {

    public static void main(String[] args) {
        int bil = 10;
        
        String b[] = {"a", "b", "c"};
        try {
            System.out.println(bil / 0);
            System.out.println(b[3]);
            
        } catch (ArithmeticException ai) {
            System.out.println("Eror Aritmatic");
            System.out.println("ai.getMessage()");
            
        } catch (ArrayIndexOutOfBoundsException n) {
            System.out.println("Eror karena melebihi kapasitas Array");
            System.out.println("n.getMassage()");
            
        } catch (Exception e){
            System.out.println("Ada Eror");
            System.out.println("e.getMassage");
        }
    }
    
}
