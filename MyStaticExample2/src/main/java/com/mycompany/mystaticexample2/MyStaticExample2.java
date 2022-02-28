package com.mycompany.mystaticexample2;

public class MyStaticExample2 {
        private static String myStaticString = "CTIS 310";
        private String college = "GUILFORD";
        public static int numberOfStudents = 18;
        
        private void modify(){
            System.out.println("\nInside the private void modify() method");
            System.out.println(myStaticString + " - This is a fun course");
            System.out.println("Accessing 'College': "
                +"\nprivate non-static String variable"
                + "\nof the MSE2 outer class");
            System.out.println(college + " Go Quakers");
            System.out.println("\nThe number of Students: "
                + numberOfStudents);
            numberOfStudents += 10;
            System.out.println("\nThe new number of Students: "
                + numberOfStudents);    
            
            
        }
        public void adjust(){
            System.out.println("\nInside the public void adjust() method");
            System.out.println(myStaticString + " - This is an exciting course");
            System.out.println("Accessing 'College': "
                +"\nprivate non-static String variable"
                + "\nof the MSE2 outer class");
            System.out.println(college + " When is your grraduation date?");
            System.out.println("\nThe number of Students: "
                + numberOfStudents);
            numberOfStudents += 1;
            System.out.println("\nThe new number of Students: "
                + numberOfStudents);    
        }
        
        public static void transform(){
            System.out.println("\nInside the public static void transform() method");
            System.out.println(myStaticString + " - This is a fun course");
            System.out.println("We can NOT access 'college' because it is a "
                    + "\nprivate non-static String variable"
                    + "\nof the MSE2 outer class and the transform method"
                    + "is a public static method;");
//            System.out.println(college + " Go Quakers");
            System.out.println("\nThe number of Students transformed: "
                + numberOfStudents);
            numberOfStudents += 2;
            System.out.println("\nThe new number of Students in transform method: "
                + numberOfStudents);    
        }
        
        static class MyNestedStaticClass{
            public static int numberOfTeachers = 2;
            public void display(){//this is a non-static method
                /*
                note that if you make the myStaticString variable of the outer class
                non-static the nyou will get compilation error because a nested
                static class can not access non-static members of the outer class.
                */
                
                System.out.println("Inside the public void display() method"
                        + "\nof the MyNestedStaticClass inner class");
                
                System.out.println("myStaticString" + myStaticString);
//                System.out.println("college" + college);
                System.out.println("\nThe number of Students in the display method: "
                    + numberOfStudents);
                numberOfStudents +=3;
                System.out.println("\nThe new number of Students in the display method: "
                    + numberOfStudents);
            }
            public void change(){//this is a non-static method
                System.out.println("Inside the public void change() method"
                        + "\nof the MyNestedStaticClass inner class");
                
                System.out.println("Advanced Java Programming: " + myStaticString);
//                System.out.println("college" + college);
                System.out.println("\nThe number of Students in the change method: "
                    + numberOfStudents);
                numberOfStudents +=4;
                System.out.println("\nThe new number of Students in the change method: "
                    + numberOfStudents);
            }
        }

    public static void main(String[] args) {
        /*
        to create instance of a nested class we did not need the outer class instance
        but for a regular nested class, you would need to create an instance of outer class first
        */
        
        MyStaticExample2.MyNestedStaticClass object1 = new MyStaticExample2.MyNestedStaticClass();
        object1.display();
        object1.change();
        
        MyStaticExample2.MyNestedStaticClass object2 = new MyStaticExample2.MyNestedStaticClass();
        object2.display();
        object2.change();
        
        MyStaticExample2 ObjectMSE2 = new MyStaticExample2();
        ObjectMSE2.modify();
        ObjectMSE2.adjust();
        
        transform();
        ObjectMSE2.transform();
    }
    
}
