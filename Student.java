package Orang;
public class Student extends Person{
    int studentNumber;
    int score;
    String major;

    public void setMajor(String major){
        this.major = major;
    }

    
    public void setScore(int score){
        this.score = score;
    }

    
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

    
    public String getMajor(){
        return this.major;
    }

    public int getScore(){
        return this.score;
    }

    public int getStudentNumber(){
        return this.studentNumber;
    }


    public Student(){
        super();
        major = "kosong";
        score = 0;
        studentNumber = 0;
    }

    public Student(String major, int score, int studentNumber){
        this.major = major;
        this.score = score;
        this.studentNumber = studentNumber;
    }

    public void uraikan(){
        System.out.println(major);
        System.out.println(score);
        System.out.println(studentNumber);
    }
    
}