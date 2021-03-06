package inheritance;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary,int year,int month,int day)
    {
        this.name = name;
        this.salary = salary; //隐式参数
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public  void  raiseSalary(double byPrecent)
    {
        double raise = salary*byPrecent/100;
        salary+=raise;
    }
}
