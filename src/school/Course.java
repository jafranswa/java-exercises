package school;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private static String title;
    //private int daysAttended;
    private ArrayList roster;
    //calls student to add student to roster; i think needs a loop
    public HashMap studentGrades;
    //will be used to send value to Student credits
    private Boolean passFail = false;

    //this is my constructor
    public Course (String title, ArrayList roster, HashMap studentGrades, Boolean passFail) {
        this.title = title;
        this.roster = roster;
        this.studentGrades = studentGrades;
        this.passFail = passFail;

    }



}
