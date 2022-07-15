package School;

import java.util.ArrayList;

import util.Displayable;

public class Classroom implements Displayable {
    private int roomNumber;
    Displayable teacher;
    ArrayList<Displayable> students;

    public Classroom() {
    }

    public Classroom(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students) {
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.students = students;
    }

    
    /** 
     * @return String
     */
    @Override
    public String display() {
        // TODO Auto-generated method stub
        String finalString =  "Room Number: " + roomNumber + "\n" + teacher.display() + "\n";
        for(int i = 0; i < students.size(); i++){
            finalString += students.get(i).display();
        }
        return finalString;
    }

}
