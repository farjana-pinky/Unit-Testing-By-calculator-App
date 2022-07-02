import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        calculator.multiplication(10,6);
        calculator.add();
        calculator.subtraction(100, 50);
    }

    static int add(){

        int a = 10;
        int b = 10;
        int result = a+b;
        System.out.println("Hello world......... welcome to cisco calculator ");
        System.out.println("the add value is " + result);
        return result;

    }


    static int multiplication(int a, int b){
       /* Scanner input = new Scanner(System.in);
        System.out.println("enter the value");
        int a = input.nextInt();
        int b = input.nextInt();*/

        int result = a*b;
        System.out.println("Hello world......... welcome to cisco calculator ");
        System.out.println("the multiplication value is " + result);
        return result;

    }
    static int subtraction(int a, int b){

        int result = a-b;
        System.out.println("Hello world......... welcome to cisco calculator ");
        System.out.println("the subtraction value is " + result);
        return result;
    }
}

