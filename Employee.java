public class Employee {
    String name;
    int salary;
    int workhours;
    int hireyear;
    int year;

    Employee(String name,int salary,int workhours,int hireyear){
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireyear = hireyear;
        this.year=0;
    }

    public int tax(){
        double tax = 0.03;
        if (salary>1000){
            return (int) (salary*tax);
        } else {
            return 0;
        }
    }

    public int bonus(){
        int bonus =30;
        if (workhours>40){
            return (workhours-40)*30;
        } else {
            return 0;
        }
    }

    public int risesalary(){
        int experiment = year-hireyear;
        if (experiment>=20){
            return (int) (salary*0.15);
        } else if (experiment<20 && experiment>=10){
            return (int) (salary*0.1);
        } else {
            return (int) (salary*0.05);
        }
    }

    public void total(){
        int total = salary-tax()+bonus()+risesalary();
        System.out.print("Total salary is : "+total);
    }
}
