package Task_01;
import java.util.Scanner;

public class CalculatorApplication {
    public static void add(int a, int b){
            System.out.println("Answer: " + (a+b));
    }
    public static void sub(int a, int b){
        System.out.println("Answer: " + (a-b));
    }

    public static void mul(int a, int b){
        System.out.println("Answer: " + a*b);
    }

    public static void div(int a, int b){
        if(b==0){
            System.out.println("Can't divide by zero");
        }else{
            System.out.println("Answer: " + a/b);
        }

    }
    public static void main(String[] args) {
        //user inputs numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int i=input.nextInt();
        System.out.println("Enter second number: ");
        int j = input.nextInt();

        //choose method
        System.out.println("Please choose and type the relevant number from below");
        System.out.println("1. Add");
        System.out.println("2. sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");

        System.out.println("Enter the number here: ");
        int k = input.nextInt();

        switch (k){
            case 1:
                add(i,j);
                break;
            case 2:
                sub(i,j);
                break;
            case 3:
                mul(i,j);
                break;
            case 4:
                div(i,j);
                break;
            default:
                System.out.println("Invalid choose");
        }








    }
}
