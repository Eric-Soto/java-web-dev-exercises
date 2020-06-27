package school;

import java.util.ArrayList;


public class Course {

    private String name;
    private int credits;
    private String subject;
    private ArrayList teachers;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList teachers) {
        this.teachers = teachers;
    }
}
