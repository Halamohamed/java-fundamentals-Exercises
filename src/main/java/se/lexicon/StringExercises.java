package se.lexicon;

import java.util.Arrays;



public class StringExercises {

    void main(){
        //ex1
        String java = "java";


        IO.println(java.length());
        IO.println(java.toUpperCase());
        IO.println(java.concat(" ").concat("Programing"));

        String string1 = "Long example sentence";
        IO.println("Char at index 6 in Long example sentence: " + string1.charAt(6));


        //ex2
        String string2 = "Even longer example sentence";
        IO.println("the index of 'o' in 'Even longer example sentence: " + string2.indexOf('o') );

        //ex3
        String string3= "Ok this is not as long!";
        IO.println("substring of 'Ok this is not as long!':"+ string3.substring(10,22));

        //ex4
        String string4 = "CAPS EQUALS SCREAMING";
        IO.println(" \"CAPS EQUALS SCREAMING\" to lowercase: " + string4.toLowerCase());
        IO.println(" \"CAPS EQUALS SCREAMING\" to uppercase: " + string4.toUpperCase());

        //ex5
        String string5 = "Java is the worst programming language!";
        IO.println("Replacing worst with best in \"Java is the worst programming language!\": " + string5.replace("worst", "best"));

        //ex6
        String string6 = "\tJ\ta\tv\ta\t";
        IO.println("The output of" + string6 +" \"\\tJ\\ta\\tv\\ta\\t\" after trim: " + string6.trim().replaceAll("\t", ""));

        //ex7
        String string7 = "20";
        IO.println("added 20 to string 20 : " + string7.concat("20"));

        //ex8
        String string8 = "Oil and Water";

        String[] arr = string8.split(" and ");
        //arr[0] = string8.split("Oil",3);


        IO.println("split " + string8 + " up into the words \"Oil\",\"Water\"\n" +
                "and store them in a String array.\n" + Arrays.stream(arr).toList());

        // ex9
        String string9 = "Carl,Susie,Fredrick,Bob,Erik";
        String[] array = string9.split(",");

        IO.println("split the string \"" + string9 + "\" into an array: " + Arrays.stream(array).toList());

        //ex10
        String string10 =  "ThisShouldBeConverted";
        String[] arr10 = string10.split("", 21);

        IO.println("Convert the string " + string10 + " into a char array: " + Arrays.stream(arr10).toList());

        //ex11
        char[] chars = {'J','a','v','a'};
        StringBuilder string11 = new StringBuilder();
        for (char aChar : chars) {
            string11.append(aChar);
        }
        IO.println("Convert char[]: {'J','a','v','a'}: to string: " + string11);
    }
}
