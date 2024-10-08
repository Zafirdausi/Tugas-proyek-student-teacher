package Orang;

public class Fulltime extends Teacher {
    int anualSalary;
    String unit;

    public void setUnit(String unit){
        this.unit = unit;
    }

    
    public void setAnualSalary(int anualSalary){
        this.anualSalary = anualSalary;
    }


    public String getUnit(){
        return this.unit;
    }

    public int getAnualSalary(){
        return this.anualSalary;
    }

    public Fulltime(){
        super();
        unit = "Kosong";
        anualSalary = 0;
    }

    public Fulltime(String subject,String unit, int anualSalary){
        super(subject);
        this.unit = unit;
        this.anualSalary = anualSalary;
    }

    public void uraikan(){
        System.out.println(subject);
        System.out.println(unit);
        System.out.println(anualSalary);
    }

}
