package maasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    public void Employee(String name, double salary , int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public void CalisanBilgileri(){
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Work Hours : " + workHours);
        System.out.println("Hire Year : " + hireYear);
    }
    // vergi hesapla
    public static double tax(double salary){
        double vergi = 0.03;
      if(salary <= 1000){
          return  salary;
      }else {
          salary = salary * vergi;
          salary -=salary;
      }
      return salary;
    }
}

