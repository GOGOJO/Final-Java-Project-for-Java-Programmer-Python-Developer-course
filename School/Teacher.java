package School;

import util.*;

/**
 * Teacher
 */

public class Teacher extends Person implements Displayable {
    private String subject;

    public Teacher() {

    }

    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    @Override
    public String display() {
        // TODO Auto-generated method stub
        return getFullName()+ " teaches " + subject;
    }

}