package Task2;

import java.util.*;

class Employee implements Comparable<Employee>{
    Employee() {

    };
    private double salary;
    private String empId;
    private int year, month;
    private String empName;
    private String company;

    public Employee(double salary, String empId, int year, int month, String empName, String company) {
        this.salary = salary;
        this.empId = empId;
        this.year = year;
        this.month = month;
        this.empName = empName;
        this.company = company;
    }

    //Sum of salaries.....
    public void sumOfSalary(ArrayList<Employee> list) {
        double totalSalary = 0;
        for (int i = 0; i < list.size(); i++) {
            totalSalary += list.get(i).salary;
        }
        System.out.println("Total sum of salary is: " + totalSalary);
    }

    //Average of salary on the basis of year per employee
    public void avgSalOnYear(ArrayList<Employee> list) {
        double sal = 0;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            sal += list.get(i).salary * (12 - list.get(i).month);
        }
        System.out.println("Average of salaries yearly per employee is: " + ((float) sal) / n);
    }

    // Sum of by salary on the basis of company
    public void sumSalOnCompany(ArrayList<Employee> list) {
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i).company;
            double sal = list.get(i).salary * (12 - list.get(i).month);
            if (map.containsKey(key)) {
                double value = map.get(key);  //getting the value of corresponding key
                double totalSal = value + sal;
                map.put(key, totalSal);
            } else {
                map.put(key, sal);
            }
        }
        System.out.println("Salary on the basis of company are: " + map);
    }

    //Getting the Employees and Employee's salary who have joined the company in June
    public void salOfJune(ArrayList<Employee> list) {
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).month == 6)
                map.put(list.get(i).empName, list.get(i).salary);
        }
        System.out.println("Employees and Employe's salary who have joined the company in June are: " + map);
    }

        // Sorting of list by name(Default)
        public int compareTo(Employee other){
            return this.empName.compareTo(other.empName);
        }

    @Override
    public String toString() {
        return "{" +
                " empName='" + empName + '\'' +
                '}';
    }

    //Method for Sorting by name in asc/desc order

}

public class Task2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        ArrayList<Employee> list = new ArrayList<>();

        Employee emp1 = new Employee(20000, "Emp1", 2022, 10, "Ram", "TCS");
        Employee emp2 = new Employee(30000, "Emp2", 2015, 2, "Mohan", "Wipro");
        Employee emp3 = new Employee(45000, "Emp3", 2010, 6, "Vivek", "TCS");
        Employee emp4 = new Employee(40000, "Emp4", 2022, 5, "Rocky", "Apple");
        Employee emp5 = new Employee(30000, "Emp5", 2015, 6, "Geeta", "IBM");
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        //Calling method for getting total salary
        emp.sumOfSalary(list);

        //Calling method for calculating average salary (Year)
        emp.avgSalOnYear(list);

        //Calling method for calculating sum of by salary on the basis of company
        emp.sumSalOnCompany(list);

        //Calling method for getting the Employees and Employee's salary who have joined the company in June
        emp.salOfJune(list);

        //Calling method to do Sorting of list by name(Default)
        Collections.sort(list);
        System.out.println("Sorting of list by Name: "+list);


        //Calling method for Sorting by name in asc/desc order




    }
}
