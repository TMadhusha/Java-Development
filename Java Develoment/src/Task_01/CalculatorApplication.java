package Task_01;
import java.util.Scanner;

public class CalculatorApplication {
    public static void add(int a, int b){
        try{
            System.out.println(a+b);
        }catch (Exception e){
            System.out.println("Error" + e);
        }
    }
    public static void sub(int a, int b){
        try{
            System.out.println(a-b);
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public static void mul(int a, int b){
        try{
            System.out.println(a*b);
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public static void div(int a, int b){
        try{
            System.out.println(a/b);
        }catch (Exception e){
            if(a/b)
        }
    }
    public static void main(String[] args) {
        //user inputs numbers
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int i=input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int j = input2.nextInt();

        //choose method
        System.out.println("Please choose and type the relevant number from below");
        System.out.println("1. Add");
        System.out.println("2.sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int k = input3.nextInt();

        switch (k){
            case 1:
                add(i,j);
                break;
            case 2:
                sub(i,j);
                break;
            case 3:
                mul(i,j);
            case 4:
                div(i,j);
            default:
                System.out.println("Invalid choose");
        }








    }
}
