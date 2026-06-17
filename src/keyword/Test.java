package keyword;
class Handling {

    public static void tiMethod(int num) {
        try {
            System.out.println("10000");
            tilMethod(num);
            System.out.println("Coders");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Coders");
        }
    }

    public static void tilMethod(int num) throws Exception {
        try {
            int result = 10 / num;
            System.out.println("Completed");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("ArithmeticException: / by zero");
        } finally {
            System.out.println("Finally");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Handling.tiMethod(0);
        System.out.println(); 
        
        Handling.tiMethod(1);
        System.out.println(); 
        
        Handling.tiMethod(10);
        System.out.println(); 
        
        Handling.tiMethod(15);
    }
}

