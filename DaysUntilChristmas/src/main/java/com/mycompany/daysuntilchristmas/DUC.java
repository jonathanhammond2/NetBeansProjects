package com.mycompany.daysuntilchristmas;

/**
 *
 * @author family
 */
import java.util.*;
public class DUC {
    public static void main(String args[]){
        Calendar c = new GregorianCalendar();
    
    c.set(Calendar.YEAR, 2022);
    c.set(Calendar.MONTH, 11);
    c.set(Calendar.DAY_OF_MONTH, 25);
    
    Date xmax = c.getTime();
    Date today = new Date();
    
    long diff = xmax.getTime() - today.getTime();
    
    diff = diff / (1000L*60*60*24);
    
    System.out.println("Days until xmax: " + diff);
    }
    
    
}
