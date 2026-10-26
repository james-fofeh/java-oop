    public class Employee{
        public static Employee getEmployee(){
            Employee e = new Employee();
            return e;
        }
        public static void main(String[] args){
            Employee emp = getEmployee();
            String msg = "";
            if (emp instanceof SalariedEmployee)
                msg = "The employee's salary is " + ((SalariedEmployee) emp).salary;
            else if (emp instanceof HourlyEmployee) {
                msg = "The employee's hourly wage is " + ((HourlyEmployee) emp).hourlyWage;
            }
            System.out.println(msg);
        }

    }
    class SalariedEmployee extends Employee {
        static double salary;
    }
    class HourlyEmployee extends Employee{
        static double hourlyWage;
    }