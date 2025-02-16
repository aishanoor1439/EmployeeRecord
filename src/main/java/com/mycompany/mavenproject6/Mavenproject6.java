package com.mycompany.mavenproject6;

import java.util.Scanner;

public class Mavenproject6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      First object of Student
        Employee e1 = new Employee();
        e1.input();
        e1.output();
        System.out.println("Do you want to update the record?");
        char response = input.next().charAt(0);
        if (response == 'y') {
            e1.update();
            e1.output();
        } else {
            System.out.println("Thank You!");
        }
    }
}
