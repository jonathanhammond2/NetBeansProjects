package com.mycompany.datedemo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

//The Chronounitbetween is useful when you want to measure the maount of time in
//a single unit only, such as days or hours or seconds

public class datedemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Our Current Date is: " + today);
        
        //add 2 months to the current date
        LocalDate date2 = today.plus(1, ChronoUnit.MONTHS);
        long daysNegative = ChronoUnit.DAYS.between(date2, today);
        
        System.out.println("Days 'Negative' = " + daysNegative);
        
         long daysPositive= ChronoUnit.DAYS.between(today, date2);
        
        System.out.println("Days 'Positive = " + daysPositive);
        
        LocalDate dateBefore = LocalDate.of(2005, 03, 15);
        LocalDate dateAfter = LocalDate.now();
       
        long daysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        long monthsBetween = ChronoUnit.MONTHS.between(dateBefore, dateAfter);
        long yearsBetween = ChronoUnit.YEARS.between(dateBefore, dateAfter);
        System.out.println("Days between: " + daysBetween);
        Period P = Period.between(dateBefore, dateAfter);
        
        System.out.println("Between Period: "+ 
                P.getYears() + " years, " + 
                P.getMonths() + " months " +
                P.getDays() + " days ");
        
        long p2 = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println("Between period days: " + p2);
    }
    
}
