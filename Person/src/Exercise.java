import java.util.*;
import java.util.ArrayList;
import java.lang.String;

public class Exercise {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Person> employees = new ArrayList<Person>(10);
        Person david = new Person("David", 23);


        int decision;
        double employeeSalary, changeSalary;
        String searchName, name;

        do {
            System.out.println("***EMPLOYEE DATABASE***");
            System.out.println("Enter the number 1 to add a new employee");
            System.out.println("Enter the number 2 to find an employee by name");
            System.out.println("Enter the number 3 to edit an employee");


            System.out.print("Number: ");
            decision = keyboard.nextInt();

            switch (decision) {
                case 1:
                    System.out.println("Enter name and Salary ");
                    System.out.print("Name: ");
                    name = keyboard.next();
                    System.out.println("");
                    System.out.print("Salary: ");
                    employeeSalary = keyboard.nextDouble();
                    Person employee = new Person(name, employeeSalary);
                    employees.add(employee);
                    System.out.println("New employee: " + employee.getName() + "," + "Salary:" + employee.getSalary());
                    break;


                case 2:
                    System.out.println("Enter the name of the employee you are looking for:");
                    searchName = keyboard.next();
                    for (Person item : employees) {
                        if (item.getName().equals(searchName)) {
                            System.out.println("Employee: " + item.getName() + " Salary " + "£" + item.getSalary());
                        } else {
                            System.out.println("No match");
                            break;
                        }
                    }
                    if (employees.isEmpty()) {
                        System.out.println("No employees have been added");
                    }
                    break;


                case 3:
                    System.out.println("Enter the name of the employee and then change his/her salary");
                    searchName = keyboard.next();
                    for (Person item : employees) {
                        if (item.getName().equals(searchName)) {
                            System.out.println("Employee: " + item.getName() + " Salary " + "£" + item.getSalary());
                            System.out.println("To what amount would you like to change the salary? ");
                            item.setSalary(keyboard.nextDouble());
                            System.out.println("The new salary for " + item.getName() + " is " + item.getSalary());
                            break;

                        }
                    }
            }


        } while (decision < 4);
    }


}
















