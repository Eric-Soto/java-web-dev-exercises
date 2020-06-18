package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

        public static void main(String[] args){
            HashMap<String, Integer> students = new HashMap<>();
            Scanner input = new Scanner(System.in);
            String newStudent;

            System.out.println("Enter your students (or ENTER to finish):");

            do {

                System.out.print("Student: ");
                newStudent = input.nextLine();

                if (!newStudent.equals("")) {
                    System.out.print("Identification Number: ");
                    Integer id = input.nextInt();
                    students.put(newStudent, id);

                    // Read in the newline before looping back
                    input.nextLine();
                }

            } while(!newStudent.equals(""));

            System.out.println("\nClass roster:");
            for (Map.Entry<String, Integer> student : students.entrySet()) {
                System.out.println(student.getKey() + " (" + student.getValue() + ")");
            }
        }

}
