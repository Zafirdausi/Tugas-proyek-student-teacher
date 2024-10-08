package Orang;
public class Person{
    int age;
    String name;

    public void setAge(int age){
        this.age = age;
    }

    
    public void setName(String name){
        this.name = name;
    }
    
    public String getNama(){
        return this.name;
    }

    
    public int getAge(){
        return this.age;
    }

    public Person(){
        age = 0;
        name = "Kosong";
    }

    public Person(String nama, int age){
        this.name = nama;
        this.age = age;
    }
    
}