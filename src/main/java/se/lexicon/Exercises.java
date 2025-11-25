package se.lexicon;

import java.util.Scanner;

public class Exercises {
    public void Greeting(){
        IO.println("Hello and Welcome!");
    }
    public void leapYear(){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a Year to cheek if it is Leap year or not");
        int input = scanner.nextInt();
        if ( (input % 400 == 0) || (input % 4 == 0 && input % 100 != 0) ){
            IO.println("You typed " + input + " is a Leap year");
        }
        else {
            IO.println("You typed " + input + " is NOT a Leap year");
        }
    }
    public void calculate(){
        int number1= 12, number2= 6, sum, product, substraction, result;
        result = number1 + number2;
        IO.println("The summation of 12 + 6 = " + result );
        result = number1 - number2;
        IO.println("The substraction of 12 - 6 = " + result );
        result = number1 * number2;
        IO.println("The Multiplication of 12 * 6 = " + result );
        result = number1 / number2;
        IO.println("The Division of 12 / 6 = " + result );
    }

}
