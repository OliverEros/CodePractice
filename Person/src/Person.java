public class Person {
    private String name;
    private double salary;

    public Person(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }



}
