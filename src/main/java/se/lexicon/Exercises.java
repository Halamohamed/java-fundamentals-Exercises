package se.lexicon;

import java.util.Scanner;

public class Exercises {
    public void Greeting(){
        IO.println("Hello Hala and Welcome!");
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
        int number1= 45, number2= 11, result;
        result = number1 + number2;
        IO.println("The summation of " + number1 + " + " + number2 + " = " + result );
        number1= 55; number2 = 12;
        result = number1 - number2;
        IO.println("The substraction of " + number1 + " - " + number2 + " = "+ result );
        number1 = 12; number2 = 4;
        result = number1 * number2;
        IO.println("The Multiplication of " + number1 + " * " + number2 + " = "+ result );
        number1 = 24; number2 = 6;
        result = number1 / number2;
        IO.println("The Division of "+ number1 + " / " + number2 + " = " + result );
    }

    public void averageOfThreeNumbers(){
        int number1 = 23, number2 = 11, number3= 77;
        int average = (number1+number2+number3)/3;
        IO.println("The average of " + number1 +" ," + number2 + ", " + number3 + " is " + average);
    }

    public void inputFromUser(){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter your name " );
        String name = scanner.next();
        IO.println("Hello " + name);
    }
    public void calculateWithInput(){
        int number1= 45, number2= 11, result;
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter two number to calculate the sum/substraction/multiplication");
        IO.println("Enter First number: ");
        number1 = scanner.nextInt();
        IO.println("Enter Second number: ");
        number2 = scanner.nextInt();
        result = number1 + number2;
        IO.println("The summation of " + number1 + " + " + number2 + " = " + result );

        result = number1 - number2;
        IO.println("The substraction of " + number1 + " - " + number2 + " = "+ result );

        result = number1 * number2;
        IO.println("The Multiplication of " + number1 + " * " + number2 + " = "+ result );

        result = number1 / number2;
        IO.println("The Division of "+ number1 + " / " + number2 + " = " + result );
    }

    public void convertToSeconds(){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        IO.println(hours + ":" + minutes + ":" + seconds);
    }
}
