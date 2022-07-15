import java.util.ArrayList;

import School.*;
import util.*;

/**
 * PrintReports
 */
public class PrintReports {
    public static void main(String[] args) {
        new PrintReports();
    }

    public PrintReports() {
        ArrayList<Displayable> classrooms = new ArrayList<>();
        do {
            classrooms.add(enterClassroom());
        } while (KeyboardReader.getPromptedChar("do you want to enter a classroom? (y/n)") == 'y');
        report(classrooms);
    }

    public Displayable enterClassroom() {
        int roomNumber = 0;
        ArrayList<Displayable> students = new ArrayList<>();
        while (roomNumber < 100) {
            roomNumber = KeyboardReader.getPromptedInt("Enter a classroom number: ");
        }
        Displayable teacher = enterTeacher();
        do {
            students.add(enterStudent());
        } while (KeyboardReader.getPromptedChar("do you want to enter a student? (y/n)") == 'y');

        return new Classroom(roomNumber, teacher, students);

    }

    public Displayable enterTeacher() {
        String firstName = KeyboardReader.getPromptedString("Enter teacher's fist name: ");
        String lastName = KeyboardReader.getPromptedString("Enter teacher's last name: ");
        String subject = KeyboardReader.getPromptedString("Enter teacher's subject: ");
        return new Teacher(firstName, lastName, subject);

    }

    public Displayable enterStudent() {
        String firstName = KeyboardReader.getPromptedString("Enter student's fist name: ");
        String lastName = KeyboardReader.getPromptedString("Enter student's last name: ");
        int id;
        while (true) {
            id = KeyboardReader.getPromptedInt("Enter student's id: ");
            if (id > 0) {
                break;
            }
        }
        int finalGrade;
        while (true) {
            finalGrade = KeyboardReader.getPromptedInt("Enter student's final grade: ");
            if (finalGrade >= 0 && finalGrade <= 100) {
                break;
            }
        }
        return new Student(firstName, lastName, id, finalGrade);

    }

    void report(ArrayList<Displayable> classrooms) {
        for (int i = 0; i < classrooms.size(); i++) {
            System.out.println(classrooms.get(i).display());
        }
    }

}