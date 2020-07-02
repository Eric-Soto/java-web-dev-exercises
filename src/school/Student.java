//package school;
//
//// Start working here with your Student class.
//// To instantiate the Student class, add your code to the main in the file, SchoolPractice.
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class Student {
//
////    public Student (String name, int studentId, double gpa, int numberOfCredits){
////        setName(name);
////        setStudentId(studentId);
////        setGpa(gpa);
////        setNumberOfCredits(numberOfCredits);
////    }
//
//    private String name;
//    private int studentId;
//    private int numberOfCredits ;
//    private double gpa = 0.0;
//    private ArrayList<String> grades;
//
//    public ArrayList<String> getGrades() {
//        return grades;
//    }
//
//    public void setGrades(ArrayList<String> grades) {
//        this.grades = grades;
//    }
//
//    public int getNumberOfCredits(int i) {
//        return numberOfCredits;
//    }
//
//    public void setNumberOfCredits(int numberOfCredits) {
//        this.numberOfCredits = numberOfCredits;
//    }
//
//    public String getName(){
//        return name;
//    }
//    public String setName(String aName){
//        name = aName;
//        return aName;
//    }
//
//    public int getStudentId(){
//        return studentId;
//    }
//
//    public void setStudentId(int aStudentId){
//        studentId = aStudentId;
//    }
//
//
//
//    public double getGpa(){
//        return gpa;
//    }
//
//    public double setGpa(double aGpa){
//        gpa = aGpa;
//        return aGpa;
//    }
//
//    public String getGradeLevel(int numberOfCredits){
//
//        String gradeLevel = "";
//
//        if(numberOfCredits >= 90){
//            gradeLevel = "Senior";
//        }
//        else if(numberOfCredits >= 60){
//            gradeLevel = "Junior";
//        }
//        else if(numberOfCredits >= 30){
//            gradeLevel = "Sophomore";
//        }
//        else if(numberOfCredits >= 0){
//            gradeLevel = "Freshman";
//        }
//        return gradeLevel;
//    }
//
//    public double addGrade(HashMap grades) throws Exception {
//
//        double newGpa ;
//        AtomicInteger score = new AtomicInteger();
//        double qualityScore;
//        grades.forEach((key, value) -> {
//
//            switch (key) {
//                case "A": {
//                    score.addAndGet(4 * value);
//                    break;
//                }
//                case "B":
//                    score.addAndGet(3);
//                    break;
//                case "C": {
//                    score.addAndGet(2);
//                    break;
//                }
//                case "D": {
//                    score.addAndGet(1);
//                    break;
//                }
//                case "F": {
//                    score.addAndGet(0);
//                    break;
//                }
//                default:
//                    throw new Exception("Insert an actual grade: A, B, C, D, F");
//
//
//            }
//        });
//
//
//        return newGpa;
//    }
//
//
////    public void DisplayStudentInfo(){
////        System.out.println("********");
////        System.out.println("Name: " + name);
////        System.out.println("GPA: " + gpa);
////        System.out.println("Number of Credits: " + numberOfCredits);
////        System.out.println("********");
////    }
//}