package school;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    public Student (String name, int studentId, double gpa, int numberOfCredits){
        setName(name);
        setStudentId(studentId);
        setGpa(gpa);
        setNumberOfCredits(numberOfCredits);
    }

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int aStudentId){
        studentId = aStudentId;
    }

    public int getNumberOfCredits(){
        return  numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double aGpa){
        gpa = aGpa;
    }

//    public void DisplayStudentInfo(){
//        System.out.println("********");
//        System.out.println("Name: " + name);
//        System.out.println("GPA: " + gpa);
//        System.out.println("Number of Credits: " + numberOfCredits);
//        System.out.println("********");
//    }
}