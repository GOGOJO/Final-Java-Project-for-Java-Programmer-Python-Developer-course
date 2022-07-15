package School;

import util.Displayable;

public class Student extends Person implements Displayable {

    private int studentId;
    private int finalGrade;

    public Student() {
    }

    public Student(String firstName, String LastName, int studentId, int finalGrade) {
        super(firstName, LastName);
        this.studentId = studentId;
        this.finalGrade = finalGrade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    @Override
    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    @Override
    public String display() {
        // TODO Auto-generated method stub
        return "Student ID: " + studentId + "	  " + getFullName() + "	Final Grade: " + finalGrade + "| ";
    }

}
