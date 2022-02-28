package com.mycompany.miniproject2_date;

/**
 *
 * @author hammondj
 */
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class MP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the date to know the day and to print that month's calendar: \n");
        
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        
        System.out.println("Enter date: ");
        int date = scanner.nextInt();

        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, date);
                
        LocalDate dateBefore = LocalDate.of(year, month, date);
        LocalDate today= LocalDate.now();
        LocalDateTime today2= LocalDateTime.now();
//        today.format(DateTimeFormatter.ISO_DATE)
//        Date today = new Date(localDate.no)
       
        long daysBetween = ChronoUnit.DAYS.between(dateBefore, today);
        
        String isLeap = "not";
        if (year % 4 ==0)
            isLeap = "";
                
        
        String dateRel;
        if (dateBefore.isAfter(today))
            dateRel = "after";
        else dateRel = "before";
                
       
        LocalDate uDate = LocalDate.of(year, month, date);
        
        var yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();
        
       System.out.println(
       year + " is " + isLeap + " a leap year.\n"
               + month + "/" + date + "/" + year + " was a " + uDate.getDayOfWeek()
               +"\nThe month " + uDate.getMonth() + " has " + daysInMonth + " days");
       
       c.set(year, month-1, 1);
      
       int startDay = c.get(Calendar.DAY_OF_WEEK);
       int numberOfDays = c.getActualMaximum(Calendar.DAY_OF_MONTH);
       System.out.print("The calendar for ");
       System.out.print(c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US));
       System.out.println( " " + year);
       printMonth(numberOfDays, startDay);
       System.out.println("\nThe date entered is:           " + today2.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
       System.out.println("Today's current date and time: " + today2.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss a")));
       System.out.println("The date entered is " + dateRel + " the current date");
       System.out.println("The number of days between the entered date and the current date is: " 
               + Math.abs(daysBetween));
      
    }
    
    private static void printMonth(int numberOfDays, int startDay) {
        int weekdayIndex = 0;
      System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
 
      for (int day = 1; day < startDay; day++) {
         System.out.print("    ");
         weekdayIndex++;
      }
 
      for (int day = 1; day <= numberOfDays; day++) {
         System.out.printf("%1$2d", day);
         weekdayIndex++;
         if (weekdayIndex == 7) {
            weekdayIndex = 0;
            System.out.println();
         } else { 
            System.out.print("  ");
         }
    }


}}
   
