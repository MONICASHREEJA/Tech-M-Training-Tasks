import java.util.*;
public class Reciprocal {
    public static void main(String[] args){
        processInput();
    }

    public static void processInput(){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter a number: ");
            double input = sc.nextDouble();
            double reciprocal = 1/input;
            System.out.println(reciprocal);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero error");
        }

        catch(InputMismatchException e){
            System.out.println("Input should be a number");
        }

        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        finally{
            System.out.println("Executed");
        }
    }
}
