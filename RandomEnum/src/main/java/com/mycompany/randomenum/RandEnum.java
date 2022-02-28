package com.mycompany.randomenum;

public class RandEnum {
    public enum Day{
        SUNDAY, MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        
        public static Day getRandom(){
            return values()[(int)(Math.random()*values().length)];
        }
    }
   
    public static void main(String[] args) {
        System.out.println("This is a random day of the week: "
            + Day.getRandom());
    }
    
}
