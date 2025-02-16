package com.mycompany.mavenproject6;

import java.util.Scanner;

public class Employee {

    //  Attributes
    String name;
    String fName;
    String salary;
    String department;

    Scanner input = new Scanner(System.in);

//  Methods
    void input() {
        System.out.println("Enter your name:");
        name = input.nextLine();
        System.out.println("Enter your Father name:");
        fName = input.nextLine();
        System.out.println("Enter your Salary:");
        salary = input.nextLine();
        System.out.println("Enter your Department:");
        department = input.nextLine();
    }

    void output() {
        System.out.println("Employee Record");
        System.out.println("Name:" + name);
        System.out.println("Father Name:" + fName);
        System.out.println("Department:" + department);
        System.out.println("Salary:" + salary);
    }

    void update() {
        System.out.println("What do you want to update?");
        char response = input.next().charAt(0);
        input.nextLine();
        switch (response) {
            case 'n':
                System.out.println("Enter your name:");
                name = input.nextLine();
                break;
            case 'f':
                System.out.println("Enter your Father name:");
                fName = input.nextLine();
                break;
            case 's':
                System.out.println("Enter your Salary:");
                salary = input.nextLine();
                break;
            case 'd':
                System.out.println("Enter your Department:");
                department = input.nextLine();
                break;
            default:
                System.out.println("Invalid input!");
        }

    }
}
