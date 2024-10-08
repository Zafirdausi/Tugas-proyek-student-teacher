
\package Orang;

public class PartTime extends Teacher {
    int hoursworked;

    public void setHoursworked(int hoursworked){
        this.hoursworked = hoursworked;
    }

    public void setSalary(int salary){
        System.out.println(salary);
    }
    

    public int getHoursWorked(){
        return this.hoursworked;
    }


    public PartTime(){
        super();
        hoursworked = 0;
    }

    public PartTime(String subject, int hoursworked){
        super(subject);
        this.hoursworked = hoursworked;
    }

    public void uraikan(){
        System.out.println(subject);
        System.out.println(hoursworked);
    }

}
