package main.java.by.rublevskaya.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
/*
Get day of week by date + implemented what day of the year it is
 */
public class DayWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in dd-MM-yyyy format: ");
        String input = scanner.nextLine();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(input, formatter);
            System.out.println("Day of the week: " + date.getDayOfWeek());
            System.out.println("This " + date.getDayOfYear() + " day of the year");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format");
        } finally {
            scanner.close();
        }
    }
}

