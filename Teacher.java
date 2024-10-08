package Orang;
public class Teacher extends Person{
    String subject;

    public void setSubject(String subject){
        this.subject = subject;
    }

    
    public String getSubject(){
        return this.subject;
    }


    public Teacher(){
        super();
        subject = "Kosong";
    }

    public Teacher(String subject){
        this.subject = subject;
    }
    
}