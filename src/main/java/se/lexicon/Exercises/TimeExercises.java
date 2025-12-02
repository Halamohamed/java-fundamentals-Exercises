package se.lexicon.Exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TimeExercises {

    void main() {

        //ex1

        LocalDate localDate = LocalDate.now();
        IO.println("Date and time now: " + localDate);


        //ex2
        LocalDate date1 = LocalDate.parse("2025-03-29");

        String dateFormat = date1.format(DateTimeFormatter.ISO_DATE);
        String date2 = date1.format(DateTimeFormatter.ofPattern("eeee dd MMM YYYY"));
        IO.println("DateTimeFormatter: " + date2);
        IO.println("DateTimeFormatter: " + localDate.format(DateTimeFormatter.ofPattern("eeee dd MMM ")));


        //ex3
        LocalDate lastMonday = LocalDate.now().minusWeeks(1);

        IO.println("Last monday as: " + lastMonday.format(DateTimeFormatter.ofPattern("eeee dd MMM")));

        //ex4
        LocalDate localDateObj = LocalDate.parse("2025-12-12");
        IO.println("LocalDate object from string: " + localDateObj);

        //ex5
        LocalDate birthday = LocalDate.parse("1985-12-24");
        IO.println("The day of week of my birthday:" + birthday + " is " + birthday.getDayOfWeek());

        //ex6
        LocalDate datePlus10YearsMinus10Month = LocalDate.now().plusYears(10).minusMonths(10);
        IO.println("LocalDate plus 10 years and minus 10 months:  " + datePlus10YearsMinus10Month);

        //ex7
        Period period = Period.between(birthday, datePlus10YearsMinus10Month);
        IO.println("period between birthday and exercise 6: " + period);
        IO.println("Elapsed years months days: " + period.getYears() + ":" + period.getMonths() + ":" + period.getDays());

        //ex8
        Period period1 = Period.of(4, 7, 29);
        LocalDate localDate1 = LocalDate.now().plus(period1);
        IO.println("Current date added period 4 years 7 months 29 days: " + localDate1);

        //ex9
        LocalTime localTime = LocalTime.now();
        IO.println("LocalTime object of current time: " + localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond());

        //ex10
        IO.println("The nanosecond of current time: " + localTime.getNano());

        //ex11
        LocalTime localTimeString = LocalTime.parse("08:50:24");
        IO.println("LocalTime from String using .parse() : " + localTimeString);

        //ex12
        // DateTimeFormatter dateTimeFormatter = localTime.format();
        IO.println("DateTimeFormatter from current time with pattern: " + localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        //ex13
        LocalDate date = LocalDate.of(2025, 12, 22);
        LocalTime time = LocalTime.of(10, 20);
        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        IO.println("LocalDateTime with the date and time components: " + localDateTime);

        //ex14
        String dateTimeFormatter = localDateTime.format(DateTimeFormatter.ofPattern("eeee dd MMMM ")) + localDateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
        IO.println("DateTimeFormatter for localDateTime: " + dateTimeFormatter);

        //ex15
        LocalDateTime localDateTimeObj = LocalDateTime.of(2025, 12, 1, 10, 47);
        IO.println("LocalDateTime By combining LocalDate and LocalTime: " + localDateTimeObj);

        //ex16
        LocalDateTime localDateTimeObject = LocalDateTime.now();

        LocalDate localDateObject = localDateTimeObject.toLocalDate();
        LocalTime localTimeObject = localDateTimeObject.toLocalTime();
        IO.println("Get LocalDate and LocalTime from LocalDateTime: " + localDateObject + " T " + localTimeObject);


    }
}
