package school;

public class Student {
    private static int nextStudentId = 1;
    private String name;
    //studentId set static to avoid changes to the field
    private static int studentId;
    private int numberOfCredits;
    private double gpa;

    //this student instance is for a new student so numberOfCredits = 0, gpa = 0
    public Student (String name, int studentId,
                    int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0;

    }
    private String getName(){
        return name;
    }

    public String setName (String Fredrick) {
        name = Fredrick;
        return name;
    }
    //set to private so the counter on studentId never gets altered
    private static int getNextStudentId() {
        return nextStudentId++;
    }
    //since field is static the data type cannot be changed
    public int getStudentId(){
        return studentId;
    }
    /** setStudentId is static final so studentId is a constant in the
     * event of a name change the student can still be identified by
     * this int*/
    public static final int setStudentId(int studentId) {
        //*student is assigned nextStudentID to ensure every studentId
        // is unique*/
        studentId = nextStudentId;
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits() {
        numberOfCredits = 12;

    }

    public double getGpa () {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


}

