package se.lexicon.Exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class CollectionExercise {

    void main() {
        /*ex1();
        ex2();
        ex3();

        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();*/
        ex12();
        challenge1();
        challenge2();
        challenge3();
        challenge4();
    }

    void ex1() {
        List<DayOfWeek> days = new ArrayList<>();
        LocalDate date = LocalDate.now();
        for (int i = 0; i < 7; i++) {
            days.add(date.getDayOfWeek().plus(i));
        }
        IO.println(days);
    }

    void ex2() {
        List<DayOfWeek> days = new ArrayList<>();
        LocalDate date = LocalDate.now();
        for (int i = 0; i < 7; i++) {
            days.add(date.getDayOfWeek().plus(i));
        }
        IO.println("Days of week: ");
        for (Object day : days) {
            IO.print(day + " ");
        }
    }

    void ex3() {
        List<String> days = new ArrayList<>();

        days.add("MONDAY");
        days.add("TUESDAY");
        days.add("WEDNESDAY");
        days.add("FRIDAY");
        days.add("SATURDAY");
        days.add("SUNDAY");

        IO.println(days.remove("THURSDAY"));
        IO.println("Days of week with out Thursday: ");
        for (String day : days) {

            IO.print(day + " ");
        }
    }

    /**
     * Create a new list and populate it with the days of the week. Then create a new list out of the
     * first three elements of the first list using a subList
     */
    void ex4() {
        List<String> days = new ArrayList<>();

        days.add("MONDAY");
        days.add("TUESDAY");
        days.add("WEDNESDAY");
        days.add("FRIDAY");
        days.add("SATURDAY");
        days.add("SUNDAY");

        IO.println("\nSublist of days: ");
        List<String> firstThreeDays = new ArrayList<>(days.subList(0, 3));
        for (String day : firstThreeDays) {

            IO.print(day + " ");
        }
    }

    /**
     * Create a new hashset and populate it with the days of the week. Lastly, print the set out and
     * pay attention to the order of the elements.
     */
    void ex5() {

        Set<String> days = new HashSet<>();
        days.add("MONDAY");
        days.add("TUESDAY");
        days.add("WEDNESDAY");
        days.add("THURSDAY");
        days.add("FRIDAY");
        days.add("SATURDAY");
        days.add("SUNDAY");

        IO.println("\nDays of the week in HashSet: " + days);
    }

    /**
     * Create a new hashSet and populate it with the days of the week. Then convert the hashSet to
     * an arrayList.
     */
    void ex6() {
        Set<String> days = new HashSet<>();
        days.add("MONDAY");
        days.add("TUESDAY");
        days.add("WEDNESDAY");
        days.add("THURSDAY");
        days.add("FRIDAY");
        days.add("SATURDAY");
        days.add("SUNDAY");
        ArrayList<String> dayList = new ArrayList<>(days);

        IO.println("\nDays of the week in ArrayList: " + dayList);


    }

    /**
     * Create a new hashSet and populate it with random names. Then convert the hashSet to an
     * arrayList. Lastly, manually sort the list in alphabetical order and print it out.
     */

    void ex7() {

        Set<String> namesSet = new HashSet<>();
        namesSet.add("Hala");
        namesSet.add("Simon");
        namesSet.add("Sara");
        namesSet.add("Maya");
        IO.println("names in HashSet: " + namesSet);

        ArrayList<String> namesList = new ArrayList<>(namesSet);
        IO.println("names in ArrayList:" + namesList);

        for (int i = 0; i < namesList.size()-1; i++) {
            for (int j = i+1; j < namesList.size(); j++) {
                if(namesList.get(i).compareTo(namesList.get(j)) > 0){
                    String temp = namesList.get(i);
                    namesList.set(i, namesList.get(j));
                    namesList.set(j,temp);
                }
            }

        }
        IO.println("Sorted name list: " + namesList);
        IO.println("Sorted name list: " );
               IO.println();

    }

    /**
     * Create a new hashSet and populate it with random names. Lastly, sort the names in
     * alphabetical order using only a Set or a child of Set.
     */

    void ex8() {

        Set<String> namesSet = new HashSet<>();
        namesSet.add("Hala");
        namesSet.add("Simon");
        namesSet.add("Sara");
        namesSet.add("Maya");
        IO.println("names in HashSet: " + namesSet);

        Set<String> namesTreeSet = new TreeSet<>(namesSet);
        IO.println("\n TreeSet(sorted alphabetically): " + namesTreeSet);
    }

    /**
     * Create a new hashMap of type <Integer,String> and populate it with elements containing an
     * id(Integer) and a car brand(String). Lastly, print out the entire hashMap
     */

    void ex9() {

        Map<Integer, String> carBrand = new HashMap<>();
        carBrand.put(1,"Volvo");
        carBrand.put(2,"BMW");
        carBrand.put(3,"Toyota");
        carBrand.put(4,"Mercedes");

        IO.println(carBrand);
    }

    /**
     * Create a new hashMap of type <Integer,String> and populate it with elements containing an
     * id(Integer) and a car brand(String). Lastly, print out only the keys.
     */
    void ex10(){
        Map<Integer, String> carBrand = new HashMap<>();
        carBrand.put(1,"Volvo");
        carBrand.put(2,"BMW");
        carBrand.put(3,"Toyota");
        carBrand.put(4,"Mercedes");

        for (Integer key: carBrand.keySet()){
            IO.println(key);
        }
    }

    /**
     * Create a new hashMap of type <Integer,String> and populate it with elements containing an
     * id(Integer) and a car brand(String). Lastly, print out only the values.
     */
    void ex11(){
        Map<Integer, String> carBrand = new HashMap<>();
        carBrand.put(1,"Volvo");
        carBrand.put(2,"BMW");
        carBrand.put(3,"Toyota");
        carBrand.put(4,"Mercedes");

        for (String value: carBrand.values()){
            IO.println(value);
        }
    }

    /**
     * Create a new class and call it Car. Add fields for Id, Brand and Model + getters and setters
     * Create a new hashMap of type <Integer,Car> and populate it with elements containing an
     * id(Integer) and a car object(Car). Lastly, print out only the car's brand.
     */
    void ex12(){

        Car volvo = new Car(12,"Volvo", "V70");
        Car bmw = new Car(134,"BMW", "B20");
        Car mercedes = new Car(154,"Mercedes", "M60");

        HashMap<Integer, Car> carBrand = new HashMap<>();
        carBrand.put(1, new Car(1,"Volvo", "V70"));
        carBrand.put(2, new Car(2,"BMW", "B20"));
        carBrand.put(3, new Car(3,"Mercedes", "M60"));
        for (Map.Entry<Integer, Car> entry : carBrand.entrySet()){
            IO.println(entry.getValue().getBrand());
        }


    }

    /**
     * Create an empty set and populate it with the all the days of the week. Next create a second
     * set and populate it with ONLY the weekend days (SATURDAY and SUNDAY). Lastly, compare
     * the two sets and retain in the first set only those days that are the same in both sets.
     */
    void challenge1(){
        Set<DayOfWeek> days = new HashSet<>();
        for (int i = 0; i < 7; i++) {
            days.add(LocalDate.now().getDayOfWeek().plus(i));

        }
        IO.println("Days of week: ");
        for (DayOfWeek dayOfWeek: days){
            IO.print(dayOfWeek + " ");
        }
        Set<DayOfWeek> weekEnds =new HashSet<>();
        weekEnds.add(DayOfWeek.SATURDAY);
        weekEnds.add(DayOfWeek.SUNDAY);
        for (DayOfWeek dayOfWeek: weekEnds){
            IO.println("\n weekend " + dayOfWeek + " ");
        }
        days.retainAll(weekEnds);
        IO.println("common days: " + days);

    }

    /**
     * Create a new hashMap of types <String,String> and populate it with elements containing an
     * email (String) and a name (String). Next, create a new Set and populate it with the keys from
     * the hashMap you created.
     */
    void challenge2(){
        HashMap<String, String> contact = new HashMap<>();
        contact.put("example1@email.com", "example1");
        contact.put("example2@email.com", "example2");
        contact.put("example3@email.com", "example3");

        Set<String> contactSet = new HashSet<>();
        contactSet.add(contact.keySet().toString());

        IO.println("contact set: " + contactSet);


    }

    /**
     * Create a new class and call it SuperHero. Add fields for Id,Name and Age + getters and
     * setters. Have the class implement the Comparable interface. Implement the override method
     * and have it compare the AGE of the superhero. Next, create a new arrayList of type
     * SuperHero. Sort the list by age and print out each element
     */
    void challenge3(){

        ArrayList<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(new SuperHero(1,"Hala",35));
        superHeroes.add(new SuperHero(2,"Asil",25));
        superHeroes.add(new SuperHero(3,"Erik",33));
        Collections.sort(superHeroes);
        superHeroes.forEach(IO::println);
    }

    /**
     * Create an array of type int with numbers: {1,4,4,2,6,7}. Next, create an appropriate Collection
     * and populate it with the content of the int array. Lastly, print out each element in the
     * Collection without duplicates
     */
    void challenge4(){
        int[] numbers = new int[]{1,4,4,2,6,7};
        Set<Integer> numberSet = new HashSet<>();

        for (int number: numbers){
            numberSet.add(number);
        }
        IO.println(numberSet);
    }
}
