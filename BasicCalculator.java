// Ömer Mindivanli - Basic Calculator 22/08/2017 - Java SE
package mndvn;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){
        String isMessageWelcome = "Welcome to Calculator Mndvn\nPlease enter two numbers";
        System.out.println(isMessageWelcome);

        Scanner inputNumber = new Scanner(System.in);

        double firstNumber = 0; // First Variable.
        System.out.print("Enter The First Number: ");

        // In order to control The user has add a number or not!
        if (inputNumber.hasNextDouble()){
            firstNumber = inputNumber.nextDouble();
        } else System.out.println("Please enter a number!");

        // Operator Definning
        System.out.println("Choose The Operation  +  -  / * x2 ex ");
        Scanner op = new Scanner(System.in);
        String operation = op.next();

        double secondNumber = 0; // and The second ones.
        System.out.println("Enter The Second Number: ");

        // In order to control The user has add a number or not!
        if (inputNumber.hasNextDouble()){
            secondNumber = inputNumber.nextDouble();
        } else System.out.println("Please enter a number!");

        // Lets Calculate Now!!
        if (operation.equals("+")) {
            System.out.println(firstNumber + secondNumber);
        }else if (operation.equals("-")) {
            System.out.println(firstNumber - secondNumber);
        }else if (operation.equals("*")) {
            System.out.println(firstNumber * secondNumber);
        }else if (operation.equals("x2")) {
            System.out.println(firstNumber * firstNumber);
        }/* else if (operation.equals("ex")) {
            System.out.println(firstNumber / secondNumber);
        }*/ else {
            System.out.println(firstNumber / secondNumber);
        }
        System.out.println("Thanks for Using See you soon!");
    }
}
