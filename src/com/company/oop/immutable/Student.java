package com.company.oop.immutable;

/**
    Immutable class means that once an object is created, we cannot change its content. In Java, all the wrapper
    classes (like Integer, Boolean, Byte, Short) and String class is immutable. We can create our own immutable
    class as well.

    - The class must be declared as final (So that child classes can’t be created)
    - Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
    - A parameterized constructor
    - Getter method for all the variables in it
    - No setters(To not have the option to change the value of the instance variable)
 */
 public final class Student {

    private final String names;
    private final int age;

    public String getNames() {
        return names;
    }

    public int getAge() {
        return age;
    }

    Student(String names, int age) {
        this.names = names;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: " + names + ", " + age + "y.o.";
    }

    public static class StudentService{
        public static void main(String[] args) {
            Student student = new Student("Roman Drohobytskyi", 21);
            System.out.println(student);
        }
    }

}

