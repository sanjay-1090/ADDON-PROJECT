package project;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<studentclub> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== STUDENT CLUB MANAGEMENT =====");
            System.out.println("1. Add Student to Club");
            System.out.println("2. View All Student Club Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Club Name: ");
                    String club = sc.nextLine();

                    System.out.print("Enter Role (Member/President/Secretary): ");
                    String role = sc.nextLine();

                    students.add(new studentclub(id, name, club, role));
                    System.out.println("✅ Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("❌ No students found!");
                    } else {
                        System.out.println("\n--- Student Club Details ---");
                        for (studentclub s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting program... Thank you!");
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
