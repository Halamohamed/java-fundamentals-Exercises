package se.lexicon.Exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysExercises {


    void main() {

        //Exercise 1
        ex1();

        //Exercise 2
        ex2();
        //findMax(new int[] { 299,456, 452, 987,432});

        //Exercise 3
        ex3(new String[]{"Paris","London", "New York", "Stockholm"});

        //Exercise 4
        ex4(new int[] {1,15,20});

        //Exercise 5
        ex5(new String[][]{{"France", "Paris"}, {"Sweden", "Stockholm"}});

        //Exercise 6
        ex6(new int[]{43, 5, 23,17,2, 14});

        //Exercise 7
        ex7(new int[] {1, 2, 4, 7, 9, 12});

        //Exercise 8
        ex8();

        //Exercise 9
         ex9(5);

        //Exercise 10
        ex10();

        //Exercise 11
        ex11();

        //Exercise 12
        ex12();

        //Exercise 13
        ex13();
    }

    void ex1() {
        int[] numbers = {11, 23, 39, 45};
        for (int i = 0; i < numbers.length; i++) {
            IO.println(numbers[i]);
        }


    }

    void ex2() {

        int[] numbers = {2, 3, 4, 5, 6};
        int number = 5;

        int index = indexOf(number, numbers);
        IO.println("Index position of number " + number + " is: " + index);
    }

    private int indexOf(int number, int[] numbers) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == number) {
                index = i;

            }

        }

        return index;
    }

    void ex3(String[] cities) {
        IO.println("String array: " + Arrays.toString(cities));
        Arrays.sort(cities);
        IO.println("Sorted string array: " + Arrays.toString(cities));
    }

    void ex4(int[] firstArray) {
        int[] secondArray = Arrays.copyOf(firstArray, firstArray.length + 1);
        IO.println("Elements from first array: " + Arrays.toString(firstArray));
        IO.println("Elements from second array: " + Arrays.toString(secondArray));

    }

    void ex5(String[][] dimentionString) {
        for (int i = 0; i < dimentionString.length; i++) {
            for (int j = 0; j < dimentionString.length; j++) {
                IO.print(" " + dimentionString[i][j]);
            }
            IO.println();

        }
    }

    void ex6(int[] numbers) {
        //int[] numbers= new int[]{43, 5, 23,17,2, 14};
        double average, sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / (numbers.length);
        IO.println("average of array of 6 is: " + average);
    }

    void ex7(int[] numbers) {
        int[] unevenNum = new int[3];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                unevenNum[j] = numbers[i];
                j++;
            }
        }
        IO.println(Arrays.toString(numbers));
        IO.println(Arrays.toString(unevenNum));
    }


    int findMax(int[] numbers) {
        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        IO.println("max number is: " + maxNumber);
        return maxNumber;
    }

     void ex8() {
        int[] arr = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int n = arr.length;
        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println("\nArray with out duplicate values: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");

        }
    }

     int[] ex9(int element) {

         int[] array = new int[]{1,2,3,4};
        int[] expandArray = Arrays.copyOf(array, array.length + 1);
        expandArray[expandArray.length - 1] = element;
        return expandArray;
    }

     void ex10() {
        int[] firstArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] secondArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] table = new int[firstArr.length][secondArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                table[i][j] = firstArr[i] * secondArr[j];
            }

        }
        System.out.println("Multiplication Table: ");
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }

     void ex11() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[1];
        int number = 1;
        while (number != 0) {
            // if(number == 0) break;
            System.out.println("Enter a number or 0 to exit!");
            number = scanner.nextInt();
            if (number != 0)
                array = expandArray(number,array);
        }
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + "  ");
        }
    }

    int[] expandArray(int element,int[] array){

        int[] expandArray = Arrays.copyOf(array, array.length + 1);
        expandArray[expandArray.length - 1] = element;
        return expandArray;
    }

    void ex12() {
        int[] row = {1, 2, 3};
        int[] col = {1, 2, 3};
        int[][] table = new int[row.length][col.length];
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                table[i][j] = row[i] * col[j];
            }

        }
        IO.println(" \nTable : ");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                IO.print(table[i][j] + " ");
            }
            IO.println();
        }
        IO.print("Dimensional array: ");
        for (int i = 0; i < table.length; i++) {
            IO.print(table[i][i] + " ");
        }

    }
    void ex13(){
        int size= 10;
        int[] randomArray = new int[size];
        int[] copyArray =new int[size];
        Random random = new Random();
        IO.println("\nRandom arrays: ");
        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(100);
            IO.print(randomArray[i] + " ");
        }
        int left = 0;
        int right = size-1;
        for (int i = 0; i < size; i++) {
            if(randomArray[i] % 2 != 0){
                copyArray[left++] = randomArray[i];
            } else {
                copyArray[right--] = randomArray[i];
            }
        }
        IO.println("\nArrays with odds left, evens right : ");
        for (int i = 0; i < size; i++) {
            IO.print(copyArray[i] + " ");
        }
    }
}
