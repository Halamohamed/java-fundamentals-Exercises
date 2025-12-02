package se.lexicon.Exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Calendar2018 {

    void main() {
        int year = 2018;
        for (Month month : Month.values()) {
            LocalDate firstDay = LocalDate.of(year, month, 1);

            int lengthOfMonth = firstDay.lengthOfMonth();
            IO.println("\n" + month + " " + year);

            int dayOfWeek = firstDay.getDayOfWeek().getValue();
            IO.println("Mo Tu We Th Fr Sa Su");
            for (int i = 1; i < dayOfWeek; i++) {
                IO.print("   ");
            }
            for (int day = 1; day <= lengthOfMonth; day++) {
                IO.print(String.format("%2d ", day));
                LocalDate localDate = LocalDate.of(year, month, day);
                if (localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                    IO.println();
                }
            }
            IO.println();

        }
    }
}
