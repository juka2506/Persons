package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people do you want to create? ");
        Person[] persons = new Person[scanner.nextInt()];
        for (int i = 0; i < persons.length; i++) {
            Person person = new Person();
            System.out.print("Enter your firstName: ");
            person.setFirstName(scanner.next());
            System.out.print("Enter your lastName: ");
            person.setLastName(scanner.next());
            System.out.print("Enter your age: ");
            person.setAge(scanner.nextInt());

            persons[i] = person;
        }

        System.out.println("The average age is: " + Average.averageValue(persons));
    }
}
