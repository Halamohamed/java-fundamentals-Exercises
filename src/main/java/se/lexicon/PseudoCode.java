package se.lexicon;

import java.util.Scanner;

public class PseudoCode {
    static Scanner scanner = new Scanner(System.in);

    /*
    Calculator pseudo code
*/
    public static int userInput(int input) {
        IO.println("Enter a number: ");
        input = scanner.nextInt();
        return input;

    }

    public static void menu() {
        //IO.println("Welcome to PseudoCode ");
        IO.println("choose an option ");
        IO.println("1- Addition ");
        IO.println("2- Substraction ");
        IO.println("3- Multiplication ");
    }

    public static void addition(int num1, int num2) {
        int  result;
        IO.println("Enter a number: ");

        userInput(num1);
        IO.println("Enter another number: ");

        userInput(num2);
        result = num1 + num2;
        IO.println("Addition of " + num1 + " + " + num2 + " = " + result);

    }

    public static void substraction() {
        int num1 = 0, num2 = 0, result;
        IO.println("Enter a number: ");

        userInput(num1);
        IO.println("Enter another number: ");

        userInput(num2);
        result = num1 - num2;
        IO.println("Substraction of " + num1 + " + " + num2 + " = " + result);

    }
    public static void Main(){

        IO.println(String.format("Hello and welcome!"));
        int i = 0, num1= 0, num2= 0,number = 0;
        String input = "";
        do {
            PseudoCode.menu();
            PseudoCode.userInput(number);
            if(number == 1){
                PseudoCode.addition(num1, num2);
            }else if(number == 2){
                PseudoCode.substraction();
            }else if(number == 3){
                PseudoCode.menu();
            }else {
                IO.println("Invalid number");
            }

        }while (i < 4) ;
        IO.println("Ended program");
    }
}
